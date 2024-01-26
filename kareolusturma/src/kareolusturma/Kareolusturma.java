package kareolusturma;
import java.util.Scanner;
public class Kareolusturma {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int k=klavye.nextInt();
        k=k*4;
        for(int i=0; i<=k; i++) {
            for(int j=0; j<=k; j++){
                if(i%4 == 0 && j<=k){
                    System.out.print(" * ");
                }else if(j%4 == 0 && i<=k){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
