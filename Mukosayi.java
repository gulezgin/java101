package mukosayi;
import java.util.Scanner;
public class Mukosayi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam =0;
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i=1; i<sayi; i++)
        {
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi == toplam){
            System.out.println(sayi+ "mükemmel bir sayıdır");
            
        }
        else {
            System.out.println(sayi + "mükemmel bir sayı değildir");
        }
    }
    
}
