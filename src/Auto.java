public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    //constructor 
    public Auto(String marca, String modelo, String tipoCombustible, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    //Getters y Setters
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    //sobreescribir el metodo mostrarinfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " +tipoCombustible);
    }

    @Override
    public void RealizarMantenimiento() {
        System.out.println("Para el mantenimiento del auto ocupamos");
        System.out.println("/tReabastecer gasolina");
        System.out.println("/tLimpiar el interior");
        System.out.println("/tRevisar frenos");
    }

    public void calcularCostoMantenimiento(double kmrecorrido, double costoporkm){
        double costoMantenimiento = kmrecorrido * costoporkm;
        System.out.println(costoMantenimiento+" $");
    }

}
