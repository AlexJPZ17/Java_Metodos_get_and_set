/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_get_and_set;

/**
 *
 * @author Alex
 */
public class Metodos_get_and_set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                //Paremetros del metodo constructor
        Persona p = new Persona("Alex","Pagoada",29,90,150);
        p.setNombre("Joel");
        p.setEdad(28);
        System.out.println("Su nombre es: " + p.getNombre());
        System.out.println("Su apellido es: " + p.getApellido());
        System.out.println("Su edad es: " + p.getEdad());
        System.out.println("Su peso es: " + p.getPeso());
        System.out.println("Su altura es: " + p.getAltura());
    }
}
