public class Main {
    public static void main(String[] args) {
        System.out.println(suma(10,20,30));
        class Coche{
            public int puertas = 2;
            public void updatePuertas() {
                this.puertas++;
            }
        }
        Coche miCoche = new Coche();
        miCoche.updatePuertas();
        System.out.println("El numero de puertas es: "+miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}