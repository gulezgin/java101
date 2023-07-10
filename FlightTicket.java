
package flightticket;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args) {
        double distance, age, triptype;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the distance in km :");
        distance = input.nextDouble();
        
        System.out.print("enter your age :");
        age = input.nextDouble();
        
        System.out.println("specify the type of trip "
                + "1 for One Way, 2 for Roundtrip :");
        triptype = input.nextInt();
        
        if(distance <= 0 || age <= 0 || (triptype != 1 && triptype != 2)){
            System.out.print("You Entered Wrong Data!");
            return;
        }
        double unitPrice = 0.10;
        double rawWage = distance * unitPrice;
        double totalPrice;
        
        double ageDiscount = 0;
        if(age <= 12){
            ageDiscount = 0.5;   
        }else if (age <= 24){
            ageDiscount = 0.1;
        }else if (age >= 65){
            ageDiscount = 0.3;
        }
        
        
        double roundtripTicketDiscount = 0;
        if(triptype ==2){
            roundtripTicketDiscount = 0.8;
        }
        
         double discountedAmount = rawWage * ageDiscount * roundtripTicketDiscount;
        
        totalPrice = rawWage - discountedAmount;
        
        System.out.print("the amount you will pay :" + totalPrice);
    }
    
}
