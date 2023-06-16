package flight;
import java.util.*;
public class Flight {
    static Scanner io=new Scanner(System.in);
	int seats;
	int price;
	ArrayList<Passenger> passengers;
	int fid;
	static int id=0;
	public Flight()
	{
		this.seats=50;
		this.price=5000;
		this.passengers=new ArrayList<>();
		id++;
		this.fid=id;
		
	}
	public void book()
	{
		System.out.println("no_of_tickets available is "+this.seats);
		System.out.println("Price is "+this.price);
		System.out.println("enter passenger name");
		String pname=io.next();
		System.out.println("enter the passenger id");
		int pid=io.nextInt();
		System.out.println("enter no of tickets");
		int no_of_tickets=io.nextInt();
		if(no_of_tickets>0 && no_of_tickets<=this.seats)
		{
		Passenger p=new Passenger(pname,no_of_tickets,pid);
		System.out.println("Ticket fare is "+no_of_tickets*price);
		passengers.add(p);
		seats-=no_of_tickets;
	    price+=(no_of_tickets*200);
	    System.out.println("Booked sucessfully ");
		}
		else
		{
			System.out.println("tickets not available");
		}
		System.out.println("---------------------------");
		
	}
	public void cancel()
	{
		System.out.println("enter passenger id");
		int pid=io.nextInt();
		int n=passengers.size();
		for(int i=0;i<n;i++)
		{
			System.out.println("pass id is "+passengers.get(i).passenger_id);
			if(passengers.get(i).passenger_id==pid)
			{
				this.seats+=passengers.get(i).no_of_tickets;
				this.price-=(200*passengers.get(i).no_of_tickets);
				passengers.remove(i);
				System.out.println("tickets cancelled sucessfully");
				System.out.println("---------------------------");
				return;
			}
		}
		System.out.println("---------------------------");
		System.out.println("passenger data is not there in this flight");
	}
	public void printdetails(int pid)
	{
		int n=passengers.size();
		for(int i=0;i<n;i++)
		{
			if(passengers.get(i).passenger_id==pid)
			{
				Passenger u=passengers.get(i);
			   System.out.println(" passenger details");
			   System.out.println(" passenger name is "+u.name);
			   System.out.println(" Number of ticket booked is "+u.no_of_tickets);
			   System.out.println(" Flight id is "+this.fid);
			   System.out.println("---------------------------");
			   return;
			}
		}
	}
	
	
}
