
package chineszodiac;

import java.util.Scanner;
        
public class ChinesZodiac {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dateofBirth;
        System.out.print("Please enter your Year of Birth: ");
        dateofBirth=input.nextInt();
        switch (dateofBirth%12){
            case 0:
                System.out.println("Your Chinese zodiac sign: " + "Monkey ");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign: " + "Rooster");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign: " + " Dog ");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign:" + "Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign: " + " Mouse ");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign: " + "Ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign: " + "Tiger ");
                break;

            case 7:
                System.out.println("Your Chinese zodiac sign: " + "Rabbit ");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign: " + "Dragon ");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign: " + "Snake ");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign:" + "Horse ");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign: " + "Sheep");
                break;

        }
    }

}
    