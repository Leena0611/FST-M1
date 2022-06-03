package Activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:/work/newtxtfile.txt");
		File f2 = new File("C:/work/newtxtfile2.txt");
		System.out.println(f.createNewFile());
		
		FileUtils f1 = new FileUtils();
		FileUtils.copyFile(f, f2);
		
		String s1 = FileUtils.readFileToString(f, "UTF-8");
		System.out.println(s1);
		
		File newDr = new File("C:/work/NewDir");
		FileUtils.copyFileToDirectory(f2, newDr);
		File f3 = FileUtils.getFile("C:/work/NewDir/newtxtfile2.txt");
		System.out.println(FileUtils.readFileToString(f3, "UTF-8"));
		
	}

}
