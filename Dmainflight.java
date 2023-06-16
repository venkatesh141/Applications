package flight;
import java.util.*;
public class Dmainflight {

	static Scanner io=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the no of flights to create");
		int n=io.nextInt();
		Flight[] flights=new Flight[n];
		for(int i=0;i<n;i++)
		{
			Flight f=new Flight();
			flights[i]=f;
		}
		boolean goon=true;
		while(goon)
		{
			System.out.println("1.book   2.cancel   3.printdetails");
		    int ch=io.nextInt();
		    switch(ch)
		    {
		    case 1:
		    	System.out.println("enter fid");
		    	int fid=io.nextInt();
		    	for(int i=0;i<n;i++)
		    	{
		    		if(fid==flights[i].fid)
		    		{
		    			flights[i].book();
		    		
		    		}
		    	}
		    	break;
		    	
		    case 2:
		    	System.out.println("enter fid");
		    	int flight_id=io.nextInt();
		    	for(int i=0;i<n;i++)
		    	{
		    		if(flight_id==flights[i].fid)
		    		{
		    			flights[i].cancel();
		    			break;
		    		}
		    	}
		    	break;
		    case 3:
		    	System.out.println("enter fid");
		    	int fid1=io.nextInt();
		    	System.out.println("ente pid");
		    	int pid=io.nextInt();
		    	for(int i=0;i<n;i++)
		    	{
		    		if(fid1==flights[i].fid)
		    		{
		    			flights[i].printdetails(pid);
		    			break;
		    		}
		    	}
		    	break;	
		    }
		    
		}
	}
}
