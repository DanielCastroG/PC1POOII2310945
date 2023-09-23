
package javaapplication7;

import java.util.Random;
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        char continuar = 'y';

        while (continuar == 'y' ) {
            System.out.println("Tirar dados");
        try{ 
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            System.out.println("Los valosres son:");
            System.out.println(dado1 + " " + dado2);

            System.out.print("¿Desea volver a tirar los dados (y = yes)? ");
            continuar = scanner.next().charAt(0);
        
        }catch(Exception e){
            System.out.println("Variable incorrecta");
            System.exit(0);
        }
        scanner.close();
        System.out.println("Fin del programa");            
        }
    }
}