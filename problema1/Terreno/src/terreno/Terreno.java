package terreno;

public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerLargo(double n) {
        largo = n;
    }

    public void establecerAncho(double n) {
        ancho = n;
    }

    public void establecerValorMetroCuadrado(double n) {
        valorMetroCuadrado = n;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerCosto() {
        costo = area * valorMetroCuadrado;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCosto() {
        return costo;
    }

}
