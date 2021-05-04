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
         
         administrador.setDomicilio("hola");
         System.out.println("tu nombre es"+ administrador.getDomicilio());
         
         Usu usu = new  Usu();
         usu.setDomicilio("popo");
         System.out.println("jaja"+ usu.getDomicilio());
          
    }
        
    
}
