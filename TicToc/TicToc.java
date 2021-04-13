import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TicToc {

	public static void main(String[] args) {
	
		Clock c1 =new Clock();
		
		c1.setHours(12);
		c1.setMins(42);
		c1.setSec(52);
		c1.setFormat(24);
		c1.advanceTime(8410);
        System.out.printf("The time is %d:%d:%d \n", c1.getHours(),c1.getMins(),c1.getSec());
        
        Clock.howManyClocks();
        Clock c2=new Clock();
        //c2.howManyClocks();
        Clock c3=new Clock(12,23,45,24);
        System.out.println("There are " +Clock.clocks+"clocks");
        //  System.out.println("There are " +c2.clocks+"clocks");
        //i can also write that
        
        Scanner input=new Scanner(System.in);
        try {
        System.out.println("Give hours:");
        c2.setHours(input.nextInt());
        System.out.println("Give mins:");
        c2.setMins(input.nextInt());
        System.out.println("Give sec:");
        c2.setSec(input.nextInt());
        }
        catch(InputMismatchException e) { //program continues
        	c1.setHours(0);
        	c1.setMins(0);
        	c1.setSec(0);
        	System.out.println("Error -- Clock reset to default values!");
        	input.nextLine();
        } 
        
        System.out.println("Give name:");
        c2.setName(input.next());
        c2.tellTime();
        if(c2.getName().length() < 3) {
        	  System.out.println("Invalid name:");
              c2.setName(input.next());
        }else
        	System.out.println("All okey");
        
        //MeteoClock mc1Clock=new MeteoClock(9,15,28,24,12.3,25.4,1456.2);
        
        for(int i=0; i<10; i++) {
        	StopWatch temp=new StopWatch(i,i,i);
        	c1.updateStopWatchList(temp);
        }
        
        for(int i=0; i<c1.getStopWatchList().size(); i++) {
        	System.out.println(c1.getStopWatchList().get(i).getHours()+":"+c1.getStopWatchList().get(i).getMins()+":"+c1.getStopWatchList().get(i).getSec());
        }
        
        
        for(StopWatch i:c1.getStopWatchList()) {
        	System.out.println(i.getHours()+"::"+i.getMins() +"::"+i.getSec());
        }
        
        int hrs=LocalDateTime.now().getHour();
        int minus=LocalDateTime.now().getMinute();
        int secs=LocalDateTime.now().getSecond();
        
        c1.setHours(hrs);
        c1.setMins(minus);
        c1.setSec(secs);
           
        char[] clockName=c1.getName().toCharArray(); //or charAt
        if (Character.isLetter(clockName[0]) && Character.isLetter(clockName[1])) {
        	System.out.println("Format is okay!");
        } else {
        	System.out.println("Format is not okay!");
        }      
        
        c1.setAlarmHours(14);
        c1.setAlarmMins(15);
        c1.setAlarmSec(0);
        LocalTime alarmTime=LocalTime.of(c1.getAlarmHours(), c1.getAlarmMins(), c1.getAlarmSec());
        System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond());
        while(true) {
        //if(LocalDateTime.now().getHour()==c1.getAlarmHour() &&)
          if (alarmTime.equals(LocalTime.now())) { //compare objects
        	  System.out.println("Alarm");
        	  break;
          }
	}

}
	
}

