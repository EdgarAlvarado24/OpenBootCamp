public class Main {
    public static void main(String[] args) {
        Coche carro = new Coche();
        System.out.println("numero De Puertas: "+carro.numeroDePuertas);
        System.out.println("velocidad Maxima: "+carro.velocidadMaxima);

        Coche carro2 = new Coche(2,90);
        System.out.println("numero De Puertas: "+carro2.numeroDePuertas);
        System.out.println("velocidad Maxima: "+carro2.velocidadMaxima);

    }
}

class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    int velocidadActual;

    public void acelerar(){
        velocidadActual += 15;
    }
    public void desacelerar(){}
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
    }
    public Coche(int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
    }
}