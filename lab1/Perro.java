import java.util.Random;
public class Perro{
    private String nombre;
    private String raza;
    private Random rand=new Random();
    private double animo;
    private double umbral;
    /*
     * METODO CONSTRUCTOR
     */
    public Perro(String nombre,String raza){
        this.nombre=nombre;
        this.raza=raza;
        this.animo=rand.nextDouble(-5,5)+1;
        this.umbral=rand.nextDouble(-20,20)+1;
    }
    //Metodos
        public void psican(Persona p){
        String respuesta="";
        this.animo=(1.0/p.getConfiabilidad())*(rand.nextFloat()-0.5)*10+this.animo;
        if(p.getGalleta()){
            respuesta=p.darGalleta(this);
        }
        System.out.println("El animo del perro ahora es de: "+this.animo);
    }
    public String ladrar(){return "Guaf Guaf";}
    public String Morder(){return this.nombre+" ha mordido";}
    public String moverCola(){return this.nombre+" ha movido la cola";}

    /*
     * METODOS GETS
     */
    public String getNombre(){return this.nombre;}
    public String getRaza(){return this.raza;}
    public double getAnimo(){return this.animo;}
    public double getUmbral(){return this.umbral;}
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