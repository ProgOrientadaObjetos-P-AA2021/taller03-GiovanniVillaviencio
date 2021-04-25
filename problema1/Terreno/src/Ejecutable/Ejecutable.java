package Ejecutable;
import terreno.Terreno;
public class Ejecutable {
    public static void main(String[] args) {
        //============================
        Terreno trn = new Terreno();
        trn.establecerAncho(12);
        trn.establecerLargo(25);
        trn.establecerValorMetroCuadrado(5);
        trn.establecerArea();
        trn.establecerCosto();
        //============================
        Terreno trn2 = new Terreno();
        trn2.establecerAncho(1000);
        trn2.establecerLargo(2000);
        trn2.establecerValorMetroCuadrado(10);
        trn2.establecerArea();
        trn2.establecerCosto();
        //=============================
        System.out.printf("El valor del terreno 1 es de $ " + "%5.2f",trn.obtenerCosto());
        System.out.printf("\nEl valor del terreno 2 es de $ " + "%5.2f",trn2.obtenerCosto());  
    }  
}

