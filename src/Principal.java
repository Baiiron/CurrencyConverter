import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("********************************\n" +
                        "Bienvenido/a Al Conversor De Monedas\n\n" +
                        "Ingrese El Número De La Opcion Que Desea \n\n" +
                        "1. Dolar A Peso Colombiano\n" +
                        "2. Peso Colombiano A Dolar\n" +
                        "3. Dolar A Euro\n" +
                        "4. Euro A Dolar\n" +
                        "5. Dolar A Peso Argentino\n" +
                        "6. Peso Argentino A Dolar\n" +
                        "7. Convertir Otra Moneda\n" +
                        "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir( monedaBase: "USD", monedaTarget: "COP", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir( monedaBase: "COP", monedaTarget: "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir( monedaBase: "USD", monedaTarget: "EUR", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir( monedaBase: "EUR", monedaTarget: "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir( monedaBase: "USD", monedaTarget: "ARS", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir( monedaBase: "ARS", monedaTarget: "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            );
        }
    }

}
