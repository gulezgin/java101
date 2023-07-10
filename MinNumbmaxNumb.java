
package minnumbmaxnumb;

import java.util.Scanner;

public class MinNumbmaxNumb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if (number > maxNum) {
                maxNum = number;
            }

            if (number < minNum) {
                minNum = number;
            }
        }

        System.out.println("Biggest number: " + maxNum);
        System.out.println("Smallest number: " + minNum);

        scanner.close();
    }
}
    
    

