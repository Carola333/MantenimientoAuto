public class App {
    public static void main(String[] args) throws Exception {
       
        //crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", "Gasolina", 2020, 15000, 5);

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        //mostrar la informacion de cada vehiculo
        System.out.println("Informacion del auto");
        auto.mostrarInfo();

        System.out.println("============================================");

        System.out.println("Informacion del camion");
        camion.mostrarInfo();
    }
}
