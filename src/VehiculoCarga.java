public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;

    //constructor 
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Getters y Setters
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga; 
    }

    //sobreescribir el metodo mostrarinfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " +capacidadCarga +"Kg");
    } 
}

