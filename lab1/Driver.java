public class Driver{
    public static void main(String[] args) {
        Perro perro=new Perro("Fifi","Husky");
        Persona persona=new Persona("Julio", "Lemus", "19", 1505.52, true);
        System.out.println(persona.ToString()); 
        System.out.println(perro.ToString());
    }
}