import java.util.Random;
public class Perro{
    private String nombre;
    private String raza;
    private Random rand=new Random();
    private int animo;
    private int umbral;
    /*
     * METODO CONSTRUCTOR
     */
    public Perro(String nombre,String raza){
        this.nombre=nombre;
        this.raza=raza;
        this.animo=rand.nextInt(-5,5)+1;
        this.umbral=rand.nextInt(-20,20)+1;
    }
    /*
     * METODOS GETS
     */
    public String getNombre(){return this.nombre;}
    public String getRaza(){return this.raza;}
    public int getAnimo(){return this.animo;}
    public int getUmbral(){return this.umbral;}
    /*
     * METODOS SETS
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setRaza(String raza){this.raza=raza;}
    /*
     * TOSTRING
     */
    public String ToString(){
        String cadena="";
        cadena+="\nNombre: "+this.nombre;
        cadena+="\nRaza: "+this.raza;
        cadena+="\nAnimo: "+this.animo;
        cadena+="\nUmbral: "+this.umbral;
        return cadena;
    }
}