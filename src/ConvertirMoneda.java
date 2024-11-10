import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa De Cambio Para Hoy\n1 "+monedaBase+ " = "+monedas.conversion_rate()+ " "+monedaTarget);
        System.out.println("Ingrese La Cantidad De " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = " +cantidadConvertida + " " + monedas.target_code());
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese El Codigo De La Moneda Base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese La Moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}