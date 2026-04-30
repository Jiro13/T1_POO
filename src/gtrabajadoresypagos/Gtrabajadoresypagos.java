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
        ArrayList<Trabajador> lista = new ArrayList<>();
        Trabajador t = new Trabajador();

        int opcion;

        do {
            System.out.println(" MENU");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Listar trabajadores");
            System.out.println("3. Calcular sueldos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            if (opcion==1){
                 System.out.print("Nombre: ");
    t.setNombre(sc.nextLine());

    System.out.print("Apellido paterno: ");
    t.setApellido_paterno(sc.nextLine());

    System.out.print("Apellido materno: ");
    t.setApellidos_materno(sc.nextLine());

    System.out.print("Tipo doc (DNI/Residencia): ");
    t.setTipo_doc(sc.nextLine());

    System.out.print("Numero doc: ");
    t.setNum_doc(sc.nextLine());

    System.out.print("Regimen (728/Locacion): ");
    t.setRegimen(sc.nextLine());

    System.out.print("Tipo pension (Integra/Prima/Habitat/ONP): ");
    t.setTipo_pension(sc.nextLine());

    System.out.print("Sueldo base: ");
    t.setSueldo_base(sc.nextDouble());

    System.out.print("Tiene hijos (si/no): ");
    t.setTiene_hijos(sc.nextBoolean());

    System.out.print("Trabaja de noche (si/no): ");
    t.setTrabaja_noche(sc.nextBoolean());
    sc.nextLine();

    lista.add(t);

    System.out.println("Trabajador agregado correctamente");
                
                
            }
        }while (opcion != 4);
    }

}
