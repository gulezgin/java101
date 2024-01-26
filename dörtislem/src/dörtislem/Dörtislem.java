package dörtislem;
import java.util.Scanner;

public class Dörtislem {

    public static void main(String[] args) {
        int x,y;
        //değişken türlerini değiştirilip (double) daha doğru sonuç alınır..
        Scanner klavye= new Scanner(System.in);
        
        System.out.println("LÜTFEN İKİ SAYI GİRİNİZ:");
        x=klavye.nextInt();
        y=klavye.nextInt();
        
        System.out.println("TOPLAMA:" + (x+y));
        System.out.println("ÇIKARMA:" + (x-y));
        System.out.println("ÇARPMA:" + (x*y));
        System.out.println("BÖLME:" + (x/y));
        
    }
    
}
