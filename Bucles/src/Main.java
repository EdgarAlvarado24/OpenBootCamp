public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int numeroIf = 1;
        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if(numeroIf < 0){

            System.out.println("El numero es negativo");
        }else{
            System.out.println("Es igual a 0");
        }
        //Bucle While
        int numeroWhile = 1;
        while(numeroWhile <= 3){
            System.out.println("El numeroWhile es "+numeroWhile);
            numeroWhile++;
        }
        //Bucle Do While
        int numeroDoWhile = 3;
        do {
            System.out.println("El numeroDoWhile es "+numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile <= 3);
        //Bucle For
        for (int i=0; i<=3; i++){
            System.out.println("El valor de i es "+i);
        }
        var estacion = "verano";
        switch(estacion){
            case "verano":
                System.out.println("Estamos en Verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("No se en que estacion estamos");
                break;
        }
    }
}