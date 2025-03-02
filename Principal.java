package PrgmDos;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {

    Persona paulo = new Persona(" Paulo", 21);
    paulo.mostrar();
    paulo.correr();
    
    System.out.println("*******************************************************");

    Vehiculo minivan = new Vehiculo("cootranar", 11, 29, 22);
    minivan.detalles();
    System.out.println("Medida por rango: " + minivan.calcuSRango());

    Vehiculo duoBus = new Vehiculo("Trans Arauca", 40, 28, 35);
    duoBus.detalles();
    System.out.println("Medida por rango: " + duoBus.calcuSRango());

    System.out.println("*******************************************************");

    Cuenta cuenta1 = new Cuenta("karla", 0, 0, 0);
    System.out.println(cuenta1.getTitular() + " porfavor ingresa un valor a ingresar a la cuenta: ");
    cuenta1.setCant(0);
    cuenta1.retirar(0);
}
}