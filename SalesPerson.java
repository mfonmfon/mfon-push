import java.util.Scanner;

public class SalesPerson {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	double gross = 0.0;
	double earnings; 
 
	int product = 0; 
	int numberSold; 


	while ( product < 4 ){
	product++;

	System.out.printf( "Enter number sold of product %d: ",product );
	numberSold = input.nextInt();


if (product == 1) {
    gross += numberSold * 239.99;
} else if (product == 2){
    gross += numberSold * 129.75;
} else if (product == 3){
  gross += numberSold * 99.95;
} else if (product == 4){
    gross += numberSold * 350.89;
} 
   

earnings = 0.09 * gross + 200;
System.out.printf("Earnings this week: $%.2f\n", earnings);

}
}
}