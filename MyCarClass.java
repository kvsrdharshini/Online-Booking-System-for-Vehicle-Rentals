package console.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class MyCar {

private static final String VehicleType = null;
private String name;
private ArrayList<Car> carList;

public MyCar(String name) {
	this.name = name;
	this.carList = new ArrayList<Car>();
}

public String getName() {
	return this.name;
}

public ArrayList<Car> getFoodList() {
	return this.carList;
}
public void initCar(String path) throws IOException{
   
    try {
    	BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		while((line = br.readLine())!=null)
		{
			String[] values = line.split(",");
			
		}
        
        
    } catch (NullPointerException e) {
    	System.err.println("File is null.");
		    System.exit(1);
    } catch (FileNotFoundException e) {
    	System.err.println("File not found.");
		    System.exit(1);
    } 
}




public void run(String args[]) throws ParseException, IOException  {
	Scanner sc = new Scanner(System.in) ;
	boolean exit = false;
	char input;
	String brand,passengers;
	do {
		printMenu(this.getName());
		
		try {
			input = readUserInput(System.in);
    	} catch (IndexOutOfBoundsException e) {
    		System.out.println("Please provide a valid input.");
    		continue;
    	}
		
		switch (input) 
		{
		case 'a': 
		brand(args);
		break;

		case 'b':
		VehicleType(args);
		break;

		case 'c':
		passengers(args,sc);
		break;

		case 'd':

		// exit from the menu
		System.exit(0);
		break;
			default:
				System.out.println("Please select a valid menu option.");
				break;
		}
	} while (!exit);
}



public static void printMenu(String name)
{
System.out.println( "Welcome to MyCar!" );
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from main menu");
System.out.println("---------------------------------------------------------------------");
System.out.println("a)Search by brand" );
System.out.println("b)Browse by vehicle type" );
System.out.println("c)Filter by number of passengers" );
System.out.println("d)Exit" );

System.out.print("Please select: ");
}

public static char readUserInput(InputStream input) throws IndexOutOfBoundsException {
    Scanner sc = new Scanner(input);
    String stringInput = sc.nextLine();
    return stringInput.charAt(0);
}

private static char Input(int i) {
	// TODO Auto-generated method stub
	return 0;
}

public static void brand(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Please provide a brand: ");
String brandname = scan.next();
if("Toyota".equals(brandname))
{
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from matching list");
System.out.println("---------------------------------------------------------------------");
System.out.println("1)C001 – Toyota Yaris Sedan with 4 seats" );
System.out.println("2)C002 – Toyota Corolla Hatch with 4 seats" );
System.out.println("3)C003 – Toyota Kluger SUV with 7 seats" );
System.out.println("0)Go to main menu" );	
Scanner sc1 = new Scanner(System.in);
System.out.print("Please select: ");
int op = sc1.nextInt( );
}
else if("Audi".equals(brandname))
{
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from matching list");
System.out.println("---------------------------------------------------------------------");
System.out.println("1)C004 – Audi A3 Sedan with 5 seats" );
System.out.println("0)Go to main menu" );
Scanner sc1 = new Scanner(System.in);
System.out.print("Please select: ");
int op = sc1.nextInt( );
}
else if("Holden".equals(brandname))
{
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from matching list");
System.out.println("---------------------------------------------------------------------");
System.out.println("1)C005 – Holden Cruze Hatch with 4 seats" );
System.out.println("0)Go to main menu" );
Scanner sc1 = new Scanner(System.in);
System.out.print("Please select: ");
int op = sc1.nextInt( );
}
else if("BMW".equals(brandname))
{
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from matching list");
System.out.println("---------------------------------------------------------------------");
System.out.println("1)C006 – BMW X5 SUV with 7 seats" );
System.out.println("2)C007 – BMW 320i Sedan with 5 seats" );
System.out.println("0)Go to main menu" );
Scanner sc1 = new Scanner(System.in);
System.out.print("Please select: ");
int op = sc1.nextInt( );
}
else
{
System.out.println("---------------------------------------------------------------------");
System.out.println("> Select from matching list");
System.out.println("---------------------------------------------------------------------");
System.out.println("1)C008 – Ford Focus Sedan with 5 seats" );
System.out.println("2)C009 – Ford Puma SUV with 5 seats" );
System.out.println("0)Go to main menu" );
Scanner sc1 = new Scanner(System.in);
System.out.print("Please select: ");
int op = sc1.nextInt( );
}
}

public static int VehicleType(String args[])
{
System.out.println("---------------------------------------------------------------------");
System.out.println( "Browse by type of vehicle" );
System.out.println("---------------------------------------------------------------------");
System.out.println("1)Sedan" );
System.out.println("2)Hatch" );
System.out.println("3)SUV" );
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner sc = new Scanner(System.in);
int op1 = sc.nextInt( );
switch( op1 )
{
case 1: 
System.out.println("Select from list of Sedans" );
System.out.println("1)C001 – Toyota Yaris Sedan with 4 seats");
System.out.println("2)C004 – Audi A3 Sedan with 5 seats");
System.out.println("3)C007 – BMW 320i Sedan with 5 seats");
System.out.println("3)C008 – Ford Focus Sedan with 5 seats");
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner in1 = new Scanner(System.in) ;
String VehicleType1 = in1.next();
break;
case 2:
System.out.println("Select from list of Hatchs" );
System.out.println("1)C002 – Toyota Corolla Hatch with 4 seats");
System.out.println("2)C005 – Holden Cruze Hatch with 4 seats");
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner in2 = new Scanner(System.in) ;
String VehicleType2 = in2.next();
break;
case 3:
System.out.println("Select from list of SUVs" );
System.out.println("1)C003 – Toyota Kluger SUV with 7 seats");
System.out.println("2)C006 – BMW X5 SUV with 7 seats");
System.out.println("3)C009 – Ford Puma SUV with 5 seats");
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner in3 = new Scanner(System.in) ;
String VehicleType3 = in3.next();
break;
case 4:
System.out.print("Please select:" );
int op = sc.nextInt( );
return 0;
}
return 0;
}

public static void passengers(String args[], Scanner s) throws ParseException, IOException
{
System.out.print("Please provide the number of passengers: " );
Scanner sc = new Scanner(System.in);
int passengers1=sc.nextInt( );
if(passengers1>=6)
{
System.out.println("Select from matching list" );
System.out.println("1)C003 - Toyota Kluger SUV with 7 seats" );
System.out.println("2)C006 - BMW X5 SUV with 7 seats" );
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner sc1 = new Scanner(System.in);
int op = sc1.nextInt( );
}
else if(passengers1==5)
{
System.out.println("Select from matching list" );
System.out.println("1)C004 – Audi A3 Sedan with 5 seats");
System.out.println("2)C007 – BMW 320i Sedan with 5 seats");
System.out.println("3)C008 – Ford Focus Sedan with 5 seats");
System.out.println("4)C009 – Ford Puma SUV with 5 seats");
System.out.println("5)C003 - Toyota Kluger SUV with 7 seats" );
System.out.println("6)C006 - BMW X5 SUV with 7 seats" );
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner sc1 = new Scanner(System.in);
int op = sc1.nextInt( );
}
else if(passengers1>=1)
{
System.out.println("1)C001 – Toyota Yaris Sedan with 4 seats");
System.out.println("2)C002 – Toyota Corolla Hatch with 4 seats");
System.out.println("3)C005 – Holden Cruze Hatch with 4 seats");
System.out.println("4)C004 – Audi A3 Sedan with 5 seats");
System.out.println("5)C007 – BMW 320i Sedan with 5 seats");
System.out.println("6)C008 – Ford Focus Sedan with 5 seats");
System.out.println("7)C009 – Ford Puma SUV with 5 seats");
System.out.println("8)C003 - Toyota Kluger SUV with 7 seats" );
System.out.println("9)C006 - BMW X5 SUV with 7 seats" );
System.out.println("0)Go to main menu" );	
System.out.print("Please select:" );
Scanner sc1= new Scanner(System.in);
int op = sc1.nextInt( );
}


String path = "C:\\Users\\sugan\\OneDrive\\Documents\\AdvancedProgramming\\Fleet.csv";
// Use File
File file = new File(path);
// Use FileReader to red CSV file
FileReader fr = new FileReader(file);
// User BufferReader
BufferedReader br = new BufferedReader(fr);
String line = "";

String[] tempArr;
// User FileWriter to write content to text file
FileWriter writer = new FileWriter("C:\\Users\\sugan\\OneDrive\\Documents\\AdvancedProgramming\\output.txt");
// Use while loop to check when file contains data
while ((line = br.readLine()) != null) {
	tempArr = line.split(",");
	// User for loop to iterate String Array and write data to text file
	for (String str : tempArr) {
		writer.write(str + " ");
	}
	// Write each line of CSV file to multiple lines
	writer.write("\n");
}
writer.close();

}

public void run(char c) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args)
{
	
}

/*Scanner in = new Scanner(System.in) ;
String passengers = in.next();
System.out.println("---------------------------------------------------------------------");
System.out.println( " Provide dates " );
System.out.println("---------------------------------------------------------------------");
System.out.println( "Please provide pick-up date (dd/mm/yyyy):" );
/*String regDate = s.nextLine();

SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");

String date = null;
Date regDate1=format.parse(date);
System.out.println( "Please provide return date (dd/mm/yyyy):" );
System.out.println("---------------------------------------------------------------------");
System.out.println( " Show vehicle details " );
System.out.println("---------------------------------------------------------------------");
System.out.println("Vehicle:C003");
System.out.println("Brand: Toyota");
System.out.println("Model: Kluger");
System.out.println("Type of vehicle: SUV"); 
System.out.println("Year of manufacture: 2019");
System.out.println("No. Of seats: 7");
System.out.println("Colour: Grey");
System.out.println("Rental: $280.00 ($70.00 * 4 days)"); 
System.out.println("Discounted price: $280.00 (Discount is not applicable)");
System.out.println("Insurance: $80.00 ($20.00 * 4 days)");
System.out.println("Service fee: $20.00"); 
System.out.println("Total: $380.00");
System.out.println("Would you like to reserve the vehicle(Y/N)?");
System.out.println("---------------------------------------------------------------------");
System.out.println( " Provide personal information " );
System.out.println("---------------------------------------------------------------------");
System.out.println( " Please provide your given name: " );
Scanner in1 = new Scanner(System.in) ;
String name = in.next();
System.out.println( " Please provide your surname " );
Scanner in2 = new Scanner(System.in) ;
String surname = in.next();
System.out.println( " Please provide your email address: " );
Scanner in3 = new Scanner(System.in) ;
String email = in.next();
System.out.println( " Please provide number of passengers: " );
Scanner in4 = new Scanner(System.in) ;
String pass = in.next();
System.out.println( " Confirm and pay(Y/N): " );
Scanner in5 = new Scanner(System.in) ;
String confirm = in.next();
System.out.println("---------------------------------------------------------------------");
System.out.println( " Congratulations! Your vehicle is booked. A receipt has been sent to your email." );
System.out.println("We will soon be in touch before your pick-up date.");
System.out.println("---------------------------------------------------------------------");
System.out.println("Name:"+name);
System.out.println("Email:"+email);
System.out.println("Number of passengers:"+pass);
return 0;
}*/
}
