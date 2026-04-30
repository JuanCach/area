
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner (System.in);  
      for (int n = 1 ; n <=10 ; n++){   
      System.out.print("Teclee un numero :");
      int num = scanner.nextInt() ;
      int cubo = num * num * num ; 
      int cuarta = cubo * num ;  
      System.out.println ("La cuarta de um numero es " + cuarta);
    }
      scanner.close();
    }
    
}
