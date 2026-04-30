/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gtrabajadoresypagos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Gtrabajadoresypagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int opcion;

        do {
            System.out.println(" MENU");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Listar trabajadores");
            System.out.println("3. Calcular sueldos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        }while (opcion != 4);
    }

}
