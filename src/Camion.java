public class Camion extends VehiculoCarga  {
    private int numEjes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
    }

    //Getters y Setters
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    //sobreescribir el metodo mostrar info
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de ejes: " +numEjes);
    }

    @Override
    public void RealizarMantenimiento() {
        System.out.println("Para el camion se necesita");
        System.out.println("/tReabastecer diesel");
        System.out.println("/tLimpiar cabina");
        System.out.println("/trevisar amortiguadores");
    }


}
