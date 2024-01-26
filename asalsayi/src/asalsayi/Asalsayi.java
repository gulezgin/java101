package asalsayi;
import java.util.Scanner;
public class Asalsayi {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayi giriniz: ");
       int sayi = scan.nextInt();
       int sayac = 0;
       for(int i=2; i < sayi ; i++)
       {
           if(sayi%i==0){
               sayac++;
           }
       }
       if (sayac==0){
           System.out.println(sayi+" Asal sayıdır");
       }
       else{
           System.out.println(sayi+" Asal sayı değildir");
       }
    }
    
}
