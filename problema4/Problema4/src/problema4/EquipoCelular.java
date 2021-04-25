package problema4;
public class EquipoCelular {
    private String sistemaOP;
    private String tamanioPantalla;
    private double costo;
    private String direccionMAC;
    private String infoIMEI;

    public void establecerSistemaOP(String n) {
        sistemaOP = n;
    }

    public void establecertamanioPantalla(String n) {
        tamanioPantalla = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public void establecerDireccionMAC(String n) {
        direccionMAC = n;
    }

    public void establecerInfoIMEI(String n) {
        infoIMEI = n;
    }

    public String obtenerSistemaOP() {
        return sistemaOP;
    }

    public String obtenerTamanioPantalla() {
        return tamanioPantalla;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccionMAC() {
        return direccionMAC;
    }

    public String obtenerInfoIMEI() {
        return infoIMEI;
    }
}

