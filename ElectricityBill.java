// This is a Java program to find out the Electricity bill with added Tax and Discount per given units measurements below. 

/*			Units Measurement
	 1-100 units   = 5 Rupees    (per unit Rs.5)
	 101-200 units = 10 Rupees (per unit Rs.10)
	 201-300 units = 20 Rupees (per unit Rs.20)
	 300-Infinity  = 50 Rupees  (per unit Rs.50)
*/

import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args) {
        System.out.println("Enter any integer for units: ");
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();
        int totalBill = 0;
        if (units>=1 && units<=100){
            totalBill = units*5; // 100*5 = 500.
            System.out.println("Total bill in Rupees is: " + totalBill);
        }
        else if (units>=101 && units<=200){
            totalBill = (units-100)*10+500; // 100*10 = 1000.
            System.out.println("Total bill in Rupees is: " + totalBill);
        }
        else if (units>=201 && units<=300){
            totalBill = (units-200)*20+1500; // 100*20 = 2000.
            System.out.println("Total bill in Rupees is " + totalBill);
        }
        else if (units>300){
            totalBill = (units-300)*50+3500;
            System.out.println("Total bill in Rupees is: " + totalBill);
        }
        if (totalBill>2000 && totalBill<4000){
            int tax = (totalBill*10)/100; // 10% tax
            totalBill = totalBill+tax;
            System.out.println("The tax of 5% is: " + tax);
            System.out.println("Total bill after 10% of tax is: " + totalBill);
        }
        else if (totalBill>4000) {
            int discount = (totalBill * 5) / 100; // 5% discount.
            totalBill = totalBill - discount;
            System.out.println("The discount of 5% is: " + discount);
            System.out.println("Total bill after 5% of discount is: " + totalBill); }}}


/* Output will be:

Enter any integer for units:
2110 (for example user gave this input)
Total bill in Rupees is: 94000
The discount of 5% is: 4700
Total bill after 5% of discount is: 89300   */