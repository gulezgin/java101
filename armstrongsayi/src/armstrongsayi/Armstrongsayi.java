package armstrongsayi;
import java.util.Scanner;
public class Armstrongsayi {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int basamak_sayisi = 0, rakam;
       int toplam = 0;
       
       System.out.print("Bir sayı giriniz: ");
       int sayi = scan.nextInt();
       int gecici = sayi;
       int gecici2 = sayi;
       
       while(gecici > 0) {
           gecici /= 10;
           basamak_sayisi++;
       }
       while(sayi>0){
           rakam = sayi % 10;
           toplam += Math.pow(rakam, basamak_sayisi);
           sayi /= 10;
    }
       if(toplam == gecici2){
           System.out.println(gecici2 + " sayisi armstrong bir sayıdır");
           
       }
       else{
           System.out.println(gecici + " sayisi armstrong bir sayi değildir");
       }
       
        
       }
}
