/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author Guillermolp
 */
public class Mani {
    public static void main(String[] args) {
        
         Administrador administrador = new Administrador();
         
         administrador.setDomicilio("5 de mayo ");
         System.out.println("Direccion:"+ administrador.getDomicilio());
         administrador.setNombre("Juan Carlos Rodriguez Perez");
         System.out.println("Nombre:"+ administrador.getNombre());
         administrador.setEdad(18);
         System.out.println("Edad:"+ administrador.getEdad());
         
         Usu usu = new  Usu();
         usu.setDomicilio("16 de septiembre ");
         System.out.println("Direccion:"+ usu.getDomicilio());
         usu.setNombre("Samuel  Gonzales Ramirez   ");
         System.out.println("Nombre:"+ usu.getNombre());
          usu.setEdad(20);
         System.out.println("Edad:"+ usu.getEdad());
         
         Clien cli = new  Clien();
         cli.setDomicilio("Durazno");
         System.out.println("Direccion:"+ cli.getDomicilio());
         cli.setNombre("Guillermo Emanuel Lopez Palma");
         System.out.println("Nombre:"+ cli.getNombre());
          cli.setEdad(19);
         System.out.println("Edad:"+ cli.getEdad());
         
    }
        
    
}
