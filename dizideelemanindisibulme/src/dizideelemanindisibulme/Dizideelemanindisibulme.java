package dizideelemanindisibulme;
import java.util.Scanner;
public class Dizideelemanindisibulme {

    public static void main(String[] args) {
        int[] sayilar={100,101,102,103,104,105,106,107,108,109};
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("Dizideki hangi elemanıın yerini öğrenmek istiyorsun");
        
        int ara=klavye.nextInt();
        for(int i=0; i<sayilar.length;i++){
            if(ara==sayilar[i]){
                System.out.println("Aradığınız sayı : " + ara);
                System.out.println("Dizideki yeri : " + i);
            }
        }
    }
    
}
