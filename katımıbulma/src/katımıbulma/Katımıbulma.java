package katımıbulma;
import java.util.Scanner;
public class Katımıbulma {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        
        if(sayi % 3 == 0) {
            System.out.println("Girilen sayı 3 ün katıdır");
        }
        else {
            System.out.println("Girilen sayı 3 ün katı değildir.");
        }
    }
    
}
