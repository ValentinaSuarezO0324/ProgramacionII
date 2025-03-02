package PrgmDos;

public class Vehiculo {
    
    private String empresa;
    private int numPasajer;
    private int cantCombustible;
    private int medConsumo;

    public Vehiculo(String empresa, int numPasajer, int cantCombustible, int medConsumo) {
        this.empresa = empresa;
        this.numPasajer = numPasajer;
        this.cantCombustible = cantCombustible;
        this.medConsumo = medConsumo; 
    }

    public void detalles (){
        System.out.println("Datos: " + "Empresa: " + empresa + ", cantidad de pasajeros: " + numPasajer + ", Cantidad de combustible " + cantCombustible + ", media: " + medConsumo );
    }

    public int calcuSRango() {
        return cantCombustible * medConsumo;
    }
}
