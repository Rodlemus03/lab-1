//Se importa la libreria para la generacion de numeros random. 
import java.util.Random;

public class Persona {
    //Se declaran los atributos de tipo public
    private String nombre;
    private String apellido;
    private String edad;
    private double salario;
    private double confiabilidad;
    private boolean galleta;
/*
 * METODO CONSTRUCTOR
 * @param, se piden todos los datos, excepto la confiabilidad, ya que esta se genera de manera aleatoria. 
 */

    public Persona(String nombre, String apellido, String edad, double salario, boolean galleta){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
        Random c=new Random();
        this.confiabilidad=c.nextDouble(10)+1;
        System.out.println(this.confiabilidad);
        this.galleta=galleta;
    }
    /*
     * METODOS
     * Como parametro pide un perro, al cual le dara una galleta. 
     */
    public String darGalleta(Perro p){
        String c="";
        if(galleta){
            c=this.nombre+" le dio una gallera a "+p.getNombre();
        }
        return c;
    }

    /*
     * METODOS GETS
     */
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getEdad(){return this.edad;}
    public double getSalario(){return this.salario;}
    public double getConfiabilidad(){return this.confiabilidad;}
    public boolean getGalleta(){return this.galleta;}
    /*
     * METODOS SETS
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public void setEdad(String edad){this.edad=edad;}
    public void setSalario(double salario){this.salario=salario;}
    //No tiene get de confiabilidad, ya que no puede cambiarse. 
    public void setGalletas(Boolean galleta){this.galleta=galleta;}
    /*
     * METODO TOSTRING
     */
    public String ToString(){
        String cadena="";
        cadena+="\nNombre "+this.nombre;
        cadena+="\nApellido "+this.apellido;
        cadena+="\nEdad "+this.edad;
        cadena+="\nSalario "+this.salario;
        cadena+="\nConfiabilidad "+this.confiabilidad;
        String cadenaGalletas="";
        if(this.galleta==true){cadenaGalletas="Si tiene galletas";}else{cadenaGalletas="No tiene galletas";}
        cadena+="\nGalletas :"+cadenaGalletas;
        return cadena;
    }
    /*
     * METODO IS EQUALS
     */

     public boolean equals(Persona pers){
        return (this.nombre.equals(pers.getNombre())&&this.apellido.equals(pers.getApellido()));
     }
}
