/*
 * Programador: Mauricio Julio Rodrigo Lemus Guzman
 * Carnet: 22461
 * Universidad del Valle de Guatemala
 * Ingenieria en Ciencia de la Computacion y Tecnologias de la Informacion. 
 * Programacion Orientada a Objetos
 * Lynette Garcia
 * 
 * El laboratorio consiste en utilizar la programacion orientada a objetos para lograr
 * crear un sistema en donde los voluntarios puedan interactuar con los perros. Usando clases
 * y objetos pueden crearse moldes para utilizarlos varias veces. 
 */








//Se importa la libreria de scanner para la entrada de datos. 
import java.util.Scanner;;

public class Driver {
    public static void main(String[] args) {
        /*
         * DECLARACION DE VARIABLES E INSTANCIA DE OBJETOS
         * 
         */
        boolean banderaPerro = false, banderaPersona = false;
        Perro perro = new Perro("", "");
        Persona persona = new Persona("nombre", "apellido", "edad", 00, false);
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMA DE VETERINARIA ");
        int respuesta = 7, respuestaSecundaria = 0;


        while (respuesta != 4) {
            System.out.println("1. Ingresar nuevo perro ");
            System.out.println("2. Ingresar nueva persona ");
            System.out.println("3. Interactuar ");
            System.out.println("4. Salir");
            respuesta = teclado.nextInt();
            if (respuesta == 1) {
                /*
                 * se usan los metodos sets para cambiar los atributos del perro, ya que se inicializan sin nombre y sin raza. 
                 */
                String nombre, raza;
                System.out.println("Ingresa el nombre del perro ");
                nombre = teclado.next();
                System.out.println("Ingresa la raza del perro");
                raza = teclado.next();
                perro.setNombre(nombre);
                perro.setRaza(raza);
                System.out.println("Se ha ingresado el perro correctamente ");
                System.out.println(perro.ToString());
                banderaPerro = true;
            } else if (respuesta == 2) {
                /*
                 * Se usan los metodos sets para poder darle valor a los atributos, ya que se inicializan vacias. 
                 */
                String nombre, apellido, edad, galletas;
                Double salario;
                Boolean galletasClase = false;
                System.out.println("Ingresa el nombre ");
                nombre = teclado.next();
                System.out.println("Ingresa el apellido ");
                apellido = teclado.next();
                System.out.println("Ingresa el edad ");
                edad = teclado.next();
                System.out.println("Ingresa el salario ");
                salario = teclado.nextDouble();
                System.out.println("Tiene galletas?  ");
                galletas = teclado.next();
                if (galletas == "si") {
                    galletasClase = true;
                } else {
                    galletasClase = false;
                }
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEdad(edad);
                persona.setSalario(salario);
                persona.setGalletas(galletasClase);
                System.out.println("Persona agregada correctamente ");
                System.out.println(persona.ToString());
                banderaPersona = true;
            } else if (respuesta == 3) {
                /*
                 * Se obtiene el valor del umbral por el metodo get. Si se encuentra menor a -5 esta de mal humor, por lo que muerde. De -5 a 5 ladra, y de 5 en adelante mueve la cola. 
                 */
                //Se valida que haya un perro y una persona creadas. 
                if (banderaPerro == false || banderaPersona == false) {
                    System.out.println("Ingresa al perro y a la persona primero");
                }else{
                    
                    Double umbral = perro.getUmbral();
                    if (umbral < -5) {
                        System.out.println(perro.Morder());
                    } else if (umbral >= -5 && umbral <= 5) {
                        System.out.println(perro.ladrar());
                    } else if (umbral > 5) {
                        System.out.println(perro.moverCola());
                    }
                    perro.psican(persona);
                }
                } else if (respuesta == 4) {
                    System.out.println("Feliz dia");
            }

        }
    }
}