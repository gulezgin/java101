package sayimerdiveni;
import java.util.Scanner;
public class Sayimerdiveni {

    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n=klavye.nextInt();
        
        for (int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
