package pl.edu.ur.oopl6.zad1;

public class Figury {   
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    public static double polekwadratu(double a)
    {
        return a*a;
    }
     public static double poleprostokata(double a,double b)
    {
        return a*b;
    }
     public static double polestozka(double r,double l)
     {
        
         return Math.pow(r,2)*Math.PI+Math.PI*r*l;
     }
     public static double polewalca(double r,double h)
     {
         return 2*Math.PI*r*r+2*Math.PI*r*h;
     }
     public static double objetoscwalca(double r,double h)
     {
         return Math.PI*r*r*h;
         
     }
}
