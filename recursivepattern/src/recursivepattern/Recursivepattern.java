
package recursivepattern;

import java.util.Scanner;

public class Recursivepattern {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Number : ");
        int n = input.nextInt();
        recursiveMethod(n);
       
    }
     
    public static void recursiveMethod(int n){
        System.out.print(n + " ");
            
        if (n <= 0){
            return;
            }
            
        recursiveMethod(n-5);
        System.out.print(n + " ");
            
        if(n>0) {
            recursiveMethod(n+5);
            System.out.print(n + " ");
            
        }     
    }
    
}
