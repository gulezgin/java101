package kelimesay;
import java.util.Scanner;
public class Kelimesay {

    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        int sayac = 1;
        
        System.out.print("Lütfen herhangi bir cümle yazınız: ");
        String cumle = klavye.nextLine();
        
        for(int i = 0; 1 < cumle.length(); i++){
        if(cumle.charAt(i) == ' ') {
            sayac++;
        }
    }
        System.out.println("Girilen cumlede " +sayac+ "tane harf vardır.");
    
    }
    
}
