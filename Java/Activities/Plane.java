package Activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
   

	public Plane(int maxPassengers) {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<String>();
    }
    
    public void onBoard(String s) {
    	passengers.add(s);
    }
    
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public List<String> getPassesngers() {
    	return passengers;
    }
}
