package Ejecutable;

import equivalentehora.EquivalenteHora;

public class Ejecutable {

    public static void main(String[] args) {
        EquivalenteHora eq = new EquivalenteHora();
        EquivalenteHora eq2 = new EquivalenteHora();
        //======================
        eq.establecerHoras(48);
        eq.establecerMinutos();
        eq.establecerSegundos();
        eq.establecerDias();
        //======================
        eq2.establecerHoras(23);
        eq2.establecerMinutos();
        eq2.establecerSegundos();
        eq2.establecerDias();
        //======================
        System.out.println("\n****************************************");
        System.out.printf("Horas: " + "%5d", eq.obtenerHoras());
        System.out.printf("\nSegundos: " + "%6d", eq.obtenerSegundos());
        System.out.printf("\nMinutos: " + "%5d", eq.obtenerMinutos());
        System.out.printf("\nDias: " + "%5d", eq.obtenerDias());
        System.out.println("\n****************************************");
        System.out.printf("Horas: " + "%6d", eq2.obtenerHoras());
        System.out.printf("\nSegundos: " + "%6d", eq2.obtenerSegundos());
        System.out.printf("\nMinutos: " + "%6d", eq2.obtenerMinutos());
        System.out.printf("\nDias: " + "%6d", eq2.obtenerDias());
        System.out.println("\n****************************************");
    }
}
