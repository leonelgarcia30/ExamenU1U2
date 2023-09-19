/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner v1 = new Scanner(System.in);
        String j1 = v1.nextLine();
        System.out.println("Ingrese nombre del videojuego: " + j1);
        
        Scanner v2 = new Scanner(System.in);
        String j2 = v2.nextLine();
        System.out.println("Ingrese nombre del videojuego: " + j2);
        
        Scanner v3 = new Scanner(System.in);
        String j3 = v3.nextLine();
        System.out.println("Ingrese nombre del videojuego: " + j3);
        
        
        double vidj1 = 353.65;
        final double pt1 = vidj1*30/100;
        System.out.println("El precio final del videojuego 1 es: " + pt1);
        
        double vidj2 = 803.50;
        final double pt2 = vidj2*65/100;
        System.out.println("El precio final del videojuego 2 es: " + pt2);
       
        double vidj3 = 747.00;
        final double pvdlj3 = vidj3*15/100;
        System.out.println("El precio final del videojuego 3 es: " + pvdlj3);
        
        
        
    }
    
}
