public class App {
    public static void main(String[] args) throws Exception {
       
        //crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", "Gasolina", 2020, 15000, 5);

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        //mostrar la informacion de cada vehiculo
        System.out.println("Informacion del auto");
        auto.mostrarInfo();
        System.out.println("Se recomienda hacer mantenimiento cada 6 meses al vehiculo");

        System.out.println("El precio del mantenimiento es: ");
        auto.calcularCostoMantenimiento(100, 20);

        System.out.println("================================================");
       
        System.out.println("Para el mantenimiento del auto ocupamos");
        System.out.println("-Reabastecer gasolina");
        System.out.println("-Limpiar el interior");
        System.out.println("-Revisar frenos");



        System.out.println("============================================");

        System.out.println("Informacion del camion");
        camion.mostrarInfo();
        System.out.println("Se recomienda hacer mantenimiento cada 6 meses al camion");

        System.out.println("==============================================");

         System.out.println("Para el camion se necesita");
        System.out.println("-Reabastecer diesel");
        System.out.println("-Limpiar cabina");
        System.out.println("-Revisar amortiguadores");

        System.out.println("El precio del mantenimiento es: ");
        auto.calcularCostoMantenimiento(150, 30);
    }
    
}
