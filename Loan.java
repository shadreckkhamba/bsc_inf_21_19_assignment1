import java.util.ArrayList;
import java.util.Scanner;
public class Loan{
    public static void main(String[] args){
//generate random numbers
 int number1 = (int)(Math.random() * 10);
 int number2 = (int)(Math.random() * 10);
 int number3 = (int)(Math.random() * 10);
 Scanner input = new Scanner(System.in);

ArrayList<Student> accounts = new ArrayList();
for(int cnt = 0; cnt < 10; cnt++ ){
    Student created = new Student();
    created.setName("name"+cnt);
    created.setProgram("program"+cnt);
    created.setSubsidence("subsidence"+cnt);
    accounts.add(created);
}


 Student c1 = new Student();
 
 System.out.println("      SELECT YOUR OPTION");
 System.out.println("1. Undergraduate");
 System.out.println("2. postgraduate");
 int choice = input.nextInt();

 if(choice ==1){

System.out.println("      SELECT YOUR OPTION");
System.out.println("--------------------------------------------");
System.out.println("1. Create account");
System.out.println("2. Apply for the loan");
System.out.println("3. Check balance");
System.out.println("4. Exit");

int choice1 = input.nextInt();

if(choice1 ==1){

 System.out.println("Enter your name");
 String name = input.next();
 
System.out.println("Enter year of study");
int year =  input.nextInt(); System.out.println("Enter your program of study");
String program = input.next();
System.out.println("Enter subsitence amount");
double subsidence = input.nextDouble();
System.out.println("Enter statioanay amount");
double statioanay = input.nextDouble();
 
String account = "                   UG"+number1+number2+number3;
System.out.println("............YOUR ACCOUNT DETAILS..........." );
System.out.println("");
System.out.println("name       year       program         loan ammount               Account number");
System.out.println("-------------------------------------------------------------------------");
System.out.println(name+" "+"   "+year+"      "+program+"       "+(c1.getInterest()* subsidence+ subsidence)+"      "+account);


System.out.println("..............PLACE YOUR CHOICE.............");
System.out.println("1. Check your account balance");
System.out.println("2. Create another account");
System.out.println("3. payback");
int choice2 = input.nextInt();
if(choice2 ==1){
    System.out.println("your account balance is "+(c1.getInterest()* subsidence+ subsidence));
}
else if(choice2==2){ 
}
}
}
 else if(choice==2){
    System.out.println("      SELECT YOUR OPTION");
System.out.println("--------------------------------------------");
System.out.println("1. Create Loan account ");
System.out.println("2. Apply for loans");
System.out.println("3. Check balance");
System.out.println("4. Exit");

int choice2 = input.nextInt();
if (choice2==1){
    
}

System.out.println("Enter your name");
 String name = input.next();
 
System.out.println("Enter year of study");
int year =  input.nextInt();
 System.out.println("Enter your program of study");
 String program = input.next();
System.out.println("Enter research grant amount:");
double grant = input.nextDouble();
 
String account = "                   PG"+number1+number2+number3;
System.out.println("..........YOUR ACCOUNT DETAILS..........." );
System.out.println("");
System.out.println("name         year      program     loan ammount                   Account number");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println(name+" "        +"   "   +year+"      "    +program+"       "    +(c1.getInterest()* grant+ grant)+"          "+account);
System.out.println(" ");

System.out.println("..............PROCEED TO: .............");
System.out.println("1. Checking your account balance");
System.out.println("2. Loan payback");
System.out.println("3. Creating another account");
int choice3 = input.nextInt();
if(choice3==1){
    System.out.println("your account balance is "+(c1.getInterest()* grant+ grant));
}
else if(choice3==2){
    System.out.println("Enter the account number: ");
    String accountNumber=input.next();

}
 }
 }
}