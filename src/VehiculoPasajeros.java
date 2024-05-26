public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    //constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    //Getters y Setterspara numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    //sobreescribir el ,etodo mostrarinfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " +numPasajeros);

    }

}



