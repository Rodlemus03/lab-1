import java.util.Random;

public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private double salario;
    private int confiabilidad;
    private boolean galleta;
/*
 * METODO CONSTRUCTOR
 */
    public Persona(String nombre, String apellido, String edad, double salario, boolean galleta){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
        Random c=new Random();
        this.confiabilidad=c.nextInt(10)+1;
        System.out.println(this.confiabilidad);
        this.galleta=galleta;
    }
    /*
     * METODOS GETS
     */
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getEdad(){return this.edad;}
    public double getSalario(){return this.salario;}
    public int getConfiabilidad(){return this.confiabilidad;}
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
        cadena+="\nGalletas "+cadenaGalletas;
        return cadena;
    }
    /*
     * METODO IS EQUALS
     */

     public boolean equals(Persona pers){
        return (this.nombre.equals(pers.getNombre())&&this.apellido.equals(pers.getApellido()));
     }
}
