package taller3.exercise.pkg1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller3Exercise1 {
    Random nr = new Random();

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño del arreglo (solo impares)");
        int tam = tec.nextInt();
        int A[][] = new int[tam][tam];
        int n = A.length - 1;
        int minRandom=10;
        int maxRandom=90;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {              
                if ((j < (n / 2 - i) || j > (n - i + n / 2)) ||   (j > i + n / 2 || j < i - n / 2)) {                 
                   A[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
                }else{
                     A[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
                    System.out.println("Numero que compone el rombo:"+A[i][j]);
                        System.out.println("");
                }          
            }
        }         
        for (int[] A1 : A) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf(A1[j] + "\t");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

    }
    
}