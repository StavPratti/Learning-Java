import java.util.ArrayList;

public class Clock {
	
	private int hours;
	private int mins;
    private int sec;

    private int alarmHours;
	private int alarmMins;
    private int alarmSec;

    private int format;
    private String name;
    static int clocks=0;
    private ArrayList <StopWatch> stopWatchList = new ArrayList<>();
    
    public Clock () {
    	hours=0;
    	mins=0;
    	sec=0;
    	alarmHours=0;
        alarmMins=0;
    	alarmSec=0;
    	format=24;
    	name="";
    	clocks++;
    }
    
    public Clock (int hours, int mins, int sec, int format) {
    	this.hours=hours;
    	this.mins=mins;
    	this.sec=sec;
    	this.format=format;
    	clocks++;
    }
    
    public Clock (int hours, int mins, int sec, int alarmHours,int alarmMins, int alarmSec,int format) {
    	this.hours=hours;
    	this.mins=mins;
    	this.sec=sec;
    	this.alarmHours=alarmHours;
    	this.alarmMins=alarmMins;
    	this.alarmSec=alarmSec;
    	this.format=format;
    	clocks++;
    }
    
    public ArrayList<StopWatch> getStopWatchList(){
    	return stopWatchList;
    }
    
    public void updateStopWatchList(StopWatch countDown) {
    	stopWatchList.add(countDown);
    }
    
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
    
    public void setAlarmHours(int alarmHours) {
        this.alarmHours=alarmHours;
        }
        
    public int getAlarmHours() {
        return alarmHours;
        }
    
    
     public void setAlarmMins(int alarmMins) {
            this.alarmMins=alarmMins;
          }
          
     public int getAlarmMins() {
          	
          	return alarmMins;
          }
     
     public void setAlarmSec(int alarmSec) {
         this.alarmSec=alarmSec;
       }
       
     public int getAlarmSec() {	
       	return alarmSec;
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
     
     public void advanceTime(int duration) {
    	 hours+=duration/3600;
    	 mins+= (duration%3600)/60;
    	 sec+= (duration%3600)%60;
    	 
    	 if(sec >= 60) {
    		 mins++;
    		 sec=sec-60;
    	 }
    	 
    	 if(mins>=60) {
    		 hours++;
    		 mins-=60;
    	 }
    	 
    	 hours%=format;
     }
     
     public static void howManyClocks() {
    	 System.out.println("There are"+clocks+"clocks");
     }
     
     public void tellTime() {
    	 System.out.printf("The time is %02d:%02d:%02d and the alarm is  %02d:%02d:%02d\n",hours,mins,sec,alarmHours,alarmMins,alarmSec);
     }
     
     public String getTime(){
    	 return "Current Time"+getHours()+":"+getMins()+":"+getSec();     
     }
}   
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
