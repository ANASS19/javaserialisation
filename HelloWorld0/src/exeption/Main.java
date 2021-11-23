package exeption;
import java.util.*;
public class Main {
    public static void affectation(int i,int []tab){
        int x= 1/(tab[i+2]-tab[i]) ;
        System.out.println("x="+x);
        int y=tab[i+4];


    }
    public static void main(String[] args) {
        int[] t={6,2,7,9,7};
        try {
            System.out.println("début ");
            affectation(2,t);
            System.out.println("affectation reussie!");}
        catch (ArithmeticException e) {
            System.out.println ( "Operation impossible"  );
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ( "indice incorrect"  );
        }
        System.out.println("Fin") ;
    }
}
