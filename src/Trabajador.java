/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Trabajador {
   private String nombre;
   private String apellido_paterno;
   private String apellidos_materno;
   private String tipo_doc;
   private String num_doc;
   private String regimen;
   private String tipo_pension;
   private double sueldo_base;
   private boolean tiene_hijos;
   private boolean trabaja_noche;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellidos_materno() {
        return apellidos_materno;
    }

    public void setApellidos_materno(String apellidos_materno) {
        this.apellidos_materno = apellidos_materno;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
     if (tipo_doc.equals("DNI") || tipo_doc.equals("Residencia")) {
     this.tipo_doc = tipo_doc;
    } else {
        System.out.println("Tipo de documento invalido");
    }
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getTipo_pension() {
        return tipo_pension;
    }

    public void setTipo_pension(String tipo_pension) {
        this.tipo_pension = tipo_pension;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public boolean isTiene_hijos() {
        return tiene_hijos;
    }

    public void setTiene_hijos(boolean tiene_hijos) {
        this.tiene_hijos = tiene_hijos;
    }

    public boolean isTrabaja_noche() {
        return trabaja_noche;
    }

    public void setTrabaja_noche(boolean trabaja_noche) {
        this.trabaja_noche = trabaja_noche;
    }
    
    
}
