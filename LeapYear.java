
package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter year: ");
        year = input.nextInt();

        if (!(year%400 == 0)){
            if (!(year%100 == 0)){
                if(year%4 == 0){
                    System.out.println("Leap year");
                }
                else
                    System.out.println("Not a leap year");
            }
            else
                System.out.println("Not a leap year");
        }
        else
            System.out.println("Leap year");
    }
    
}
