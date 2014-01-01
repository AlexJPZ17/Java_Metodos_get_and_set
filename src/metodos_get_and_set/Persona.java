/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_get_and_set;

/**
 *
 * @author Alex
 */
public class Persona {
     //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    private int altura;
    /*Método constructor de la clase persona que recibe los parámetros el 
      nombre apellido edad peso altura */
    public Persona(String nombre, String apellido, int edad, int peso, int altura){
        //Asignamos los parámetros a los atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    //métodos get sirve para obtener los datos
    public String getNombre(){
        return nombre;
    }
     public String getApellido(){
        return apellido;
    }
      public int getEdad(){
        return edad;
    }
       public int getPeso(){
        return peso;
    }
        public int getAltura(){
        return altura;
    }
        //Métodos set para asignarle el parámetro al atributo
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setPeso(int peso){
            this.peso = peso;
        }
        public void setAltura(int altura){
            this.altura = altura;
        }
}
