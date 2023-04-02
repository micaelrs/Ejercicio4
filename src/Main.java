public class Main {
    public static void main(String[] args) {
        int numerolf = 0;
        int numeroWhile =0;
        int numeroDoWhile =3;
        int numeroFor = 0;
        String estacion = "Primavera";
        System.out.println();

        if (numerolf >0){
            System.out.println("El numero" + numerolf + "es positivo");
        }
            else if (numerolf <0){
            System.out.println("El numero" + numerolf + "es negativo");

        }
            else {
            System.out.println("El numero es 0");
        }
            System.out.println();

            System.out.println("-Bucle While");
            while(numeroWhile <3) {
                numeroWhile++;
                System.out.println("" +numeroWhile);

        }
          System.out.println();
            System.out.println("Bucle Do While");
            do{
                numeroDoWhile++;
                System.out.println("" +numeroDoWhile);
            } while (numeroDoWhile >3);
            System.out.println();

            System.out.println("-Switch case");
            switch (estacion) {
                case "Verano":
                    System.out.println("Es verano");
                    break;
                case "Invierno":
                    System.out.println("Es invierno");
                    break;
                case "Otoño":
                    System.out.println("Es otoño");
                    break;
                case "Primavera":
                    System.out.println("Es primavera");
                    break;
                default :
                    System.out.println("Error!!");

            }

        }

    }