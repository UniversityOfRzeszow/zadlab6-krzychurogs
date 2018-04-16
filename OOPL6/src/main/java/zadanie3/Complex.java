/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Scanner;

/**
 *
 * @author krzysztof
 */
public class Complex {
    
    
    public static void sprzezenie(double re,double im)
    {
       System.out.println("sprzezenie liczby zespolonej");
       im=-im;
       System.out.println(re+""+im+"i");
       
    }   
    
    public static double modul(double re,double im)
    {
    
        return Math.hypot(re, im);
    }
         public static double kat(double re, double im) {
        double cos = re / modul(re, im);
        double sin = im / modul(re, im);

        if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0) {
            return Math.toDegrees(Math.asin(sin));
        } else if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        } else if (Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 3 / 2));
        } else {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }
    }
   public static void naWykladnicza(double Re, double Im) {
         System.out.println("z algebrainczej na wykladnicza"+modul(Re, Im) + "*e^(" + kat(Re, Im) + "*i)");
        
    } 
    public static void naAlgebraiczna(double modul, double kąt) {
         System.out.println(" z wykladniczenj na  postac algebraiczna " + (modul * Math.cos(Math.toRadians(kąt))) + "+(" + (modul * Math.sin(Math.toRadians(kąt))) + ")i");
        
    }

   public static void dodawanie(double re,double im)
   {
       double a,b;
       Scanner odczyt=new Scanner(System.in);
       System.out.println("podaj czesc rzecziwista liczby ktora dodamy");
       a=odczyt.nextDouble();
        System.out.println("podaj czesc urojona liczby ktora dodamy");
       b=odczyt.nextDouble();
       
       double wynik=a+re;
       double wynik1=b+im;
       
       System.out.println(wynik+"+"+wynik1+"i");
   }
   public static void odejmowanie(double re,double im)
   {
      double a,b;
       Scanner odczyt=new Scanner(System.in);
       System.out.println("podaj czesc rzecziwista liczby ktora odejmiemy");
       a=odczyt.nextDouble();
        System.out.println("podaj czesc urojona liczby ktora odejmiemy");
       b=odczyt.nextDouble();
       
       double wynik=(re-a);
       double wynik1=(im-b);
       
       System.out.println(wynik+"+"+wynik1);  
   }
    public static void dzielenie(double re,double im)
   {
       double a,b;
       Scanner odczyt=new Scanner(System.in);
       System.out.println("podaj czesc rzecziwista liczby ktora odejmiemy");
       a=odczyt.nextDouble();
        System.out.println("podaj czesc urojona liczby ktora odejmiemy");
       b=odczyt.nextDouble();
       
       double wynik=(re*a+im*b)/Math.pow(a,2)+Math.pow(b,2);
       double wynik1=(im*a-re*b)/Math.pow(a,2)+Math.pow(b,2);
       
       System.out.println(wynik+"+"+wynik1+"i");  
   }
    public static void mnozenie(double re,double im)
   {
       double a,b;
       Scanner odczyt=new Scanner(System.in);
       System.out.println("podaj czesc rzecziwista liczby ktora pomnozymy");
       a=odczyt.nextDouble();
        System.out.println("podaj czesc urojona liczby ktora pomnozymy");
       b=odczyt.nextDouble();
       
       double wynik=(a*re)-(im*b);
       double wynik1=(a*im)+(re*b);
       
       System.out.println(wynik+"+"+wynik1+"i");
   }

     public static double dodawanieWyk(double mod1, double kat1, double mod2, double kat2) {
        Math.toRadians(kat1);
        Math.toRadians(kat2);
        double x = mod1 * Math.cos(kat1) + mod2 * Math.cos(kat2);
        double y = mod1 * Math.sin(kat1) + mod2 * Math.sin(kat2);
        return kat(x, y);
    }
    public static void dzielenieWyk(double mod1, double kat1, double mod2, double kat2) {
        double mod = mod1 / mod2;
        double kat = kat1 - kat2;
       
       System.out.println(mod+"*e^("+kat+"i");
    }
     
     
     public static void main(String[] args){
        double a,b;
        Scanner odczyt=new Scanner(System.in);
        System.out.println("podaj czesc rzecziwista pierwszej liczby");
         a=odczyt.nextDouble();
        System.out.println("podaj czesc urojona pierwszej liczby ");
        b=odczyt.nextDouble();
        System.out.println("Modul liczby zespolonej"+Complex.modul(a,b));
        Complex.sprzezenie(a, b);
        Complex.dodawanie(a,b);
        Complex.odejmowanie(a, b);
        Complex.mnozenie(a, b);
        Complex.dzielenie(a,b);
        
        
        
         
    }
}
