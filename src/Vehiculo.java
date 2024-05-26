public class Vehiculo {

        private String marca;
        private String modelo;
        private int año;
        private int kilometraje;
    
        //constructor
        public Vehiculo(String marca, String modelo, int año, int kilometraje) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.kilometraje = kilometraje;
        }
    
            //Getters y Setters
            public String getMarca() {
                return marca;
            }
    
            public void setMarca(String Marca) {
                this.marca = marca;
            }
    
            public String getModelo() {
                return modelo;
            }
    
            public void setModelo(String Modelo) {
                this.modelo = modelo;
            }
    
            public int getAño() {
                return año;
            }
            public void setAño(int Año) {
                this.año = año;
            }
    
            public int getKilometraje()  {
                return kilometraje;
            }
            public void setkilometraje(int Kilometraje) {
                this.kilometraje = kilometraje;
            }
    
            //metodo para mostrar la informacion del vehiculo 
            public void mostrarInfo() {
                System.out.println("marca: " +marca);
                System.out.println("Modelo: " +modelo);
                System.out.println("Año: " +año);
                System.out.println("Kilometraje: " +kilometraje);
            }
    
            
    
    
                
    
    
    }
    
