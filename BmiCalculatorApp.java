
package bmicalculatorapp;

import java.util.Scanner;


public class BmiCalculatorApp {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        double kilo, boy, vki;
       
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy=klavye.nextDouble();
        
        System.out.println("Lütfen kilonuzu (kg cinsinden) giriniz");
        kilo=klavye.nextDouble();
        
        vki = kilo/(boy*boy);
        System.out.print("Vücut kitle İndeksiniz :"+vki);
        
     }
    }
    
    