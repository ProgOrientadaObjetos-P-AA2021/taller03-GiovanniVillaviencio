package equivalentehora;

public class EquivalenteHora {

    private int horas;
    private int dias;
    private int minutos;
    private int segundos;

    public void establecerHoras(int n) {
        horas = n;
    }

    public void establecerMinutos() {
        minutos = horas * 60;
    }

    public void establecerSegundos() {
        segundos = horas * 3600;
    }

    public void establecerDias() {
        dias = horas / 24;
    }
    public int obtenerHoras(){
        return horas;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }

    public int obtenerDias() {
        return dias;
    }
}
