package sayıdegistirme;
import java.util.Scanner;

public class Sayıdegistirme {
public static void main(String[] args) {
    Scanner klavye=new Scanner (System.in);
    int sayi1, sayi2;
    int gecici;
    System.out.print("Lütfen 1. sayiyi giriniz: ");
    sayi1=klavye.nextInt();
    System.out.print("Lütfen 2. sayiyi giriniz: ");
    sayi2=klavye.nextInt();
    System.out.println("Değiştirilen yeni değerler... ");
    gecici=sayi1;
    sayi1=sayi2;
    sayi2=gecici;
    System.out.println("1.sayi="+sayi1);
    System.out.println("2.sayi="+sayi2);
}
}
