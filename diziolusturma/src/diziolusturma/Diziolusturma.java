package diziolusturma;
import java.util.Scanner;
public class Diziolusturma {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Dizinin boyutunu giriniz: ");
       int boyut = scan.nextInt();
       int [] dizi = new int[boyut];
       for(int i=0 ; i<boyut; i++)
       {
           System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
       dizi[i]= scan.nextInt();
       }   
    }
    
}
