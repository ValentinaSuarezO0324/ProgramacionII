package PrgmDos;

public class Cuenta {
    private String titular;
    private double total = 500;
    private double consulta = 0.0; 
    private double cant = 0.0;
    
    public Cuenta(String titular, double total, double consulta, double cant) {
        this.titular = titular;
        this.total = total;
        this.consulta = consulta;
        this.cant = cant;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getConsulta() {
        return consulta;
    }

    public void setConsulta(double consulta) {
        this.consulta = consulta;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        if (cant > 0){
            this.cant = cant;
        }else {
            System.out.println("La cantidad es negativa");
        }
    }    
    
    public void retirar(double cant) {
        if (cant > 0) {
            if (total - cant >= 0) {
                 total -= cant;
            } else {
                total = 0;
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }
}
