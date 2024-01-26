package atmbakiye;
import java.util.Scanner;
public class Atmbakiye {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        int bakiye = 1000;
        
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n****İSLEMLER****\n");
        System.out.println("1. para cekme");
        System.out.println("2. para yatır");
        System.out.println("3. bakiye sorgula");
        System.out.println("4. kart iade");
        
        System.out.println("\nisleminizi seciniz");
        int islem = klavye.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = klavye.nextInt();
                if(tutar > bakiye) {
                    System.out.println("Yetersiz bakiye. tekrar girlan: ");
                    tutar=klavye.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = klavye.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz = "+bakiye);
                break;
            case 4:
                System.out.println("Kartınızı almayı unutmayınız.!");
            default:
                System.out.println("islem bilinmiyor. olanı seçlan");
                
                 
            
                        
        }
    }
    
}
