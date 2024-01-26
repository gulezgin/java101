package ucgensayilar;
import java.util.Scanner;
public class Ucgensayilar {

    public static void main(String[] args) 
    {
        System.out.println("Lütfen istenilen sayıyı giriniz: ");
        Scanner klavye = new Scanner (System.in);
        
        int sira = klavye.nextInt();
        
        for (int i = sira; i>=1; i--){
            
            for (int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
             for(int k=2; k<=i; k++)
             {
                 System.out.print(k+" ");
                 
             }
             System.out.println("");
        }
    }
    
}
