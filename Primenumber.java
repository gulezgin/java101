
package primenumber;

import java.util.Scanner;
        
public class Primenumber {

    public static void main(String[] args) {
        int i, j;
        boolean prime;
        System.out.print("prime numbers from 1-100");
        for(i = 2; i <= 100; i++){
            prime=true;
                for(j = 2; j <= i/2; j++){
                    if(i % j == 0){
                        prime=false;
                        break;
                    }
                }
                if(prime){
                    System.out.print(i + " ");
                }
        }
        
    }
    
}
