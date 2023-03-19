// Definición de la clase principal
public class Main {
    // Método principal del programa
    public static void main(String[] args) {
        // Creación de tres objetos de diferentes subclases de Animal
        Gato gato1 = new Gato("ivan", 24);
        Perro perro1 = new Perro("max", 7);
        Loro loro1 = new Loro("loro",48);

        // Invocación del método hacerSonido() de cada objeto
        gato1.hacerSonido();
        perro1.hacerSonido();
        loro1.hacerSonido();

        // Invocación del método dormir() del objeto gato1
        gato1.dormir();
    }
}

// Clase abstracta Animal
abstract class Animal {
    // Atributos privados de la clase
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto hacerSonido()
    public abstract void hacerSonido();

    // Método comer()
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    // Método dormir()
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Métodos get y set de los atributos nombre y edad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Clase Gato que hereda de Animal
class Gato extends Animal {
    // Constructor de la clase
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Miau.");
    }
}

// Clase Perro que hereda de Animal
class Perro extends Animal {
    // Constructor de la clase
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Guau.");
    }
}

// Clase Loro que hereda de Animal
class Loro extends Animal {
    // Constructor de la clase
    public Loro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Jueputa, Jueputa.");
    }
}
