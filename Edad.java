
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    for (int n = 1 ; n <=10;n++) {
    System.out.print("teclee año de nacimiento");
    int año_n = scanner.nextInt();
    System.out.print ("teclee año actual");  
    int año_a = scanner.nextInt();   
    int eda_p =año_a - año_n ;
    System.out.println ("La edad es :" + eda_p);
    
       }
     scanner.close();   
        
    }                 
       
   }
