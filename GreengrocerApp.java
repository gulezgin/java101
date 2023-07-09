import java.util.Scanner;

public class GreengrocerApp {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = Double.parseDouble(scanner.nextLine());

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = Double.parseDouble(scanner.nextLine());

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = Double.parseDouble(scanner.nextLine());

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = Double.parseDouble(scanner.nextLine());

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = Double.parseDouble(scanner.nextLine());

        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo)
                + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

       scanner.close();
    }
}