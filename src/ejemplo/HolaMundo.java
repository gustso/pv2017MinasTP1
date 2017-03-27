/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author gustso
 */
public class HolaMundo {
    public static void main(String[] args){
        String nombreMateria2 = "PV Este es un cambio ";
        saludarAlPublico("Juan Manuel \n ",nombreMateria2);
        
    }
    
    public static void saludarAlPublico(String nombreDeQuienSaluda,String nombreMateria){
        System.out.println("Hola PV2015, saluda: " +nombreDeQuienSaluda + nombreMateria);
        
        //System.out.println(nombreDeQuienSaluda);
    }
    
}
