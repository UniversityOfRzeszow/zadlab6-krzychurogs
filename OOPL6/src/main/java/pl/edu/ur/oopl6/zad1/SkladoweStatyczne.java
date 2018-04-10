package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        System.out.printf("Pole kwadratu %.3f  ",Figury.polekwadratu(4));
        System.out.printf("Pole prostokata%.3f  ",Figury.poleprostokata(4, 3));
        System.out.printf("Pole stozka%.3f  ",Figury.polestozka(3, 2));
        System.out.printf("Pole walca %.3f ",Figury.polewalca(2, 3));
        System.out.printf("objetosc walca %.3f",Figury.objetoscwalca(2, 3));
        
        
    }
    
}
