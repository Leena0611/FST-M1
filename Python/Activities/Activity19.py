import pandas
from pandas import DataFrame, ExcelWriter
from pandas import ExcelFile

	
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

df = pandas.DataFrame(data)
print(df)
writer = ExcelWriter("EmpDetails.xlsx")
df.to_excel(writer,sheet_name="EmpData",index=False)

writer.save()