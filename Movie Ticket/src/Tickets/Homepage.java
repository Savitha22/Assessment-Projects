
package Tickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Homepage {
	String SelectedShowTime=" ";
	String SelectedMovie=" ";
	String username;
	String password;
	String Date;
	String MovieName;
	int date;
	    String Movie;
	    double showtime;
	    int noofppl;
	    char selectedrow;
	    String seat;
	    int ticket=150;
	    int total;


	Scanner sc=new Scanner(System.in);
	HashMap<String,String> hm=new HashMap<>();
	Homepage(){
	hm.put("Savi","savi@000");
	hm.put("kalvi", "kalvi@21");
	hm.put("sowmi","sowmi@43");
	hm.put("varshini", "varshini@56");
	hm.put("varsha","varsha@987\n");

	}
	ArrayList<String> al=new ArrayList<>();
	    LinkedList RowA=new LinkedList();
	    LinkedList RowB=new LinkedList();
	    LinkedList RowC=new LinkedList();
	    LinkedList RowD=new LinkedList();
	    LinkedList RowF=new LinkedList();
	    LinkedList RowE=new LinkedList();




	public void verify() {

	System.out.println("Home");
	System.out.println("Are you a 1.Admin or 2.User?");
	int n=sc.nextInt();
	switch(n) {
	case 1:
	System.out.println("Do yo want to 1.Add user 2.Remove user 3.Print user 4.Exit?");
	int op=sc.nextInt();
	switch(op) {
	case 1:
	System.out.println("Enter the user name");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	hm.put(username, password);
	System.out.println("User Added Successfully");
	System.out.println(hm);
	break;
	case 2:
	System.out.println("Enter the user name");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	hm.remove(username, password);
	System.out.println("User removed Successfully");
	System.out.println(hm);
	break;
	case 3:
	System.out.println("The Existing users of the Movie booking system");
	System.out.println(hm);
	break;


	case 4:System.exit(0);
	      break;
	      default:System.out.println("Check the Option");
	      break;
	}
	case 2:
	System.out.println("Are u 1.New User 2.RegisterUser?");
	int s=sc.nextInt();
	switch(s) {
	case 1:
	newUser(username, password);
	login(username, password);
	selectMovie(Date,MovieName);
	break;
	case 2:
	login(username, password);
	selectMovie(Date,MovieName);
	break;



	}
	}

	}
	void newUser(String username,String password) {
	System.out.println("Register Here!!!");
	System.out.println("Enter the user name");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	hm.put(username, password);
	System.out.println("Registered Sucessfully...Now u have to Login");
	login(username, password);

	}
	void login(String username,String password) {
	System.out.println("Login Here!!!");
	System.out.println("Enter the username");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	hm.put(username,password);
	if(hm.containsKey(username)&&hm.containsValue(password)) {
	System.out.println("Login Successfull!");
	selectMovie(Date,MovieName);
	}
	else {
	System.out.println("Please enter the valid user name..");
	login(username, password);
	}

	}
	void selectMovie(String Date,String MovieName){
	String m1="SpiderMan";
	String m2="Beast";
	String m3="VTV";
	String m4="Jessi";
	System.out.println("Select the Movie 1.SpiderMan 2.Beast 3.VTV 4.Jessi 5.Exit");
	int op=sc.nextInt();
	switch(op) {
	case 1:
	SelectedMovie+=m1;
	System.out.println("Your selected Movie"+SelectedMovie);
	selectShowTime();
	break;
	case 2:
	SelectedMovie+=m2;
	System.out.println("Your selected Movie"+SelectedMovie);
	selectShowTime();
	break;
	case 3:
	SelectedMovie+=m3;
	System.out.println("Your selected Movie"+SelectedMovie);
	selectShowTime();
	break;
	case 4:
	SelectedMovie+=m4;
	System.out.println("Your selected Movie"+SelectedMovie);
	selectShowTime();
	break;
	case 5:
	System.exit(0) ;
	break;
	default:System.out.println("Enter the valid option");
	}
	}
	void selectShowTime() {
	String s1="6.00am";
	String s2="10.00am";
	String s3="1.00pm";
	String s4="4.00pm";
	String s5="7.00pm";
	String s6="11.00am";

	System.out.println("1.6.00am 2.10.00am 3.1.00pm 4.4.00pm 5.7.00pm 6.11.00pm");
	int cr=sc.nextInt();
	if(cr==1) {
	SelectedShowTime+=s1;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}
	if(cr==2) {
	SelectedShowTime+=s2;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}
	if(cr==3) {
	SelectedShowTime+=s3;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}
	if(cr==4) {
	SelectedShowTime+=s4;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}
	if(cr==5) {
	SelectedShowTime+=s5;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}
	if(cr==6) {
	SelectedShowTime+=s6;
	System.out.println("Your show time:"+SelectedShowTime);
	select_row();
	}

	}
	void select_no_of_persons()
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("\nEnter the no of persons you want to book");
	 noofppl=s.nextInt();
	 System.out.println("\nYou have Booked tickets for a movie "+SelectedMovie+" persons for the show time "+SelectedShowTime);
	 System.out.println("\nNumbr of Persons u have booked: "+noofppl);
	 payment(noofppl,ticket);
	}

	void select_row()
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Select the row (A-F): ");
	 char ch=s.next().charAt(0);
	 switch(ch)
	 {
	 case 'A':
	 {
	  selectedrow='A';
	  System.out.println("\nYou have Choosed A Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowA,seat,selectedrow);
	  break;
	 }
	 case 'B':
	 {
	  selectedrow='B';
	  System.out.println("\nYou have Choosed B Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowB,seat,selectedrow);
	  break;
	 }
	 case 'C':
	 {
	  selectedrow='C';
	  System.out.println("\nYou have Choosed C Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowC,seat,selectedrow);
	  break;
	 }
	 case 'D':
	 {
	  selectedrow='D';
	  System.out.println("\nYou have Choosed D Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowD,seat,selectedrow);
	  break;
	 }
	 case 'E':
	 {
	  selectedrow='E';
	  System.out.println("\nYou have Choosed E Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowE,seat,selectedrow);
	  break;
	 }
	 case 'F':
	 {
	  selectedrow='F';
	  System.out.println("\nYou have Choosed F Row");
	  System.out.println("\nSelect the seats (1-10)");
	  seat=sc.next();
	  seat=selectedrow+seat;
	  select_seat(RowF,seat,selectedrow);
	  break;
	 }
	 default:
	  System.out.println("\nInvalid choice");
	  select_row();
	  break;
	 }
	 
	}
	void select_seat(LinkedList l1, String s1,char row)
	{
	 if(l1.contains(s1))
	 {
	  System.out.println("\nSeat is already booked");
	  System.out.println("\nTry with different seat number");
	  select_row();
	 }
	 else{
	  al.add(s1);
	  l1.add(s1);
	  System.out.println("\nYou have selected seat number "+s1+" in "+row+" "+"row");
	  System.out.println("\nDo you want to book another seat (y/n)?: ");
	  char c=sc.next().charAt(0);
	  if(c=='y')
	  {
	   select_row();
	  }
	  else{
	  select_no_of_persons();
	 
	  }
	   
	  }}


	void payment(int noofppl,int ticket) {
	Scanner sc=new Scanner(System.in);
	total=noofppl*ticket;
	 System.out.println("\nTotal amount for the booked tickets: "+total);
	 System.out.println("\nType (y/n) to confirm booking");
	 char cnfrm=sc.next().charAt(0);
	 if(cnfrm=='y')
	 {
	  display();
	 }
	 else{
	  System.out.println("\nLast Booking Cancelled");
	  cancel();
	 
	 }

	}
	void display()
	{
	 System.out.println("*******BOOKING CONFIRMED****");
	 System.out.println("\nHi "+ username +" Your Booking is Confirmed :) :)");
	 System.out.println("\nYour Ticket No: "+Math.random());
	 System.out.println("\nMovie name: "+SelectedMovie);
	 System.out.println("\nShowTime: "+SelectedShowTime);
	 System.out.println("\nSelected Row: "+selectedrow);
	 System.out.println("\nSelected Seats: "+al);
	 System.out.println("\nNo of Persons: "+noofppl);
	 System.out.println("\nTotal Amount: "+total);
	 System.out.println("\n*****************");
	 System.out.println("\nDo you want to book again (y/n)?: ");
	 char ch=sc.next().charAt(0);
	 if(ch=='y')
	 {
	  verify();
	 }
	 else{
	  System.out.println("\nThank You for Using our System");
	 }
	}
	void cancel()
	{
	System.out.println("Enter the username");
	username=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	hm.remove(username, password);
	    System.out.println("\nSorry "+username+" :( :(");
	    System.out.println("\nYour Last Booking is Cancelled");
	   System.out.println("\nIf you want to start booking again (y/n)?: ");
	   char ch=sc.next().charAt(0);
	   if(ch=='y')
	   {
	   verify();
	   }
	  else{
	   System.out.println("\nThank You for Using our System ");
	  }
	}

}