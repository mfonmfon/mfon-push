import java.util.Scanner;

public class AccountBalance{

public static void main(String [] args){

Scanner input = new Scanner(System.in);



int account;
int oldbalance;
int credit;
int limitedCredit;
int charges;
int newBalance;




System.out.println(" Enter your account number (or -1 to quit): ");
int account = input.nextlnt();

while ( account != -1 ){

System.out.println(" Enter new balance");
newBalance = input.nextln();

System.out.println(" Enter oldBalance");
oldBalance = input.nextlnt();


System.out.println("enter charges");
charges = input.nextlnt();

System.out.println("enter credit");
credit = input.nextlnt();


System.out.println( "Enter Credit Limit: ");
creditLimit = input.nextInt(); 


newBalance = oldBalance + charges - credit;
System.out.printf( "New balance is %d%s\n", newBalance );
}

if ( newBalance > creditLimit ){
System.out.println( "Credit limit exceeded");
}
else{
System.out.printf( "Enter Account Number or( -1 to quit:) ");
account = input.nextInt();
}




}
}