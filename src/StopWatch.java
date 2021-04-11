
public class StopWatch extends Clock{


	private int hours;
	private int mins;
    private int sec;
    
    private int format;
    private String name;
    
    public StopWatch() {
    	hours=0;
    	mins=0;
    	sec=0;
    	format=24;
    	name="";
    }
    
    public StopWatch(int hours, int mins, int sec, String name, int format) {
    	this.hours=hours;
    	this.mins=mins;
    	this.sec=sec;
    	this.name=name;
    	this.format=format;
    }
    
    public StopWatch(int hours, int mins, int sec) {
    	this.hours=hours;
    	this.mins=mins;
    	this.sec=sec;
    }
/*
    public void setHours(int hours) {
        this.hours=hours;
    }
    
    public int getHours() {
    	return hours;
    }
    
    public void setMins(int mins) {
    	this.mins=mins;
    }
    
    public int getMins() {
    	return mins;
    }
    
    public void setSec(int sec) {
        this.sec=sec;
      }
      
    public int getSec() {
      	return sec;
      }
    
    public void setFormat(int format) {
        this.format=format;
      }
      
    public int getFormat() {
      	return format;
      }
    
    public void setName(String name) {
        this.name=name;
      }
      
      public String getName() {
      	return name;
      }
    */
}
