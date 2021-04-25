package Ejecutable;
import problema4.EquipoCelular;
public class Ejecutable {
    public static void main(String[] args) {
        EquipoCelular eC1 = new EquipoCelular();
        EquipoCelular eC2 = new EquipoCelular();
        //===============================================
        eC1.establecerSistemaOP("Android");
        eC1.establecertamanioPantalla("156,7 x 74,3 mm");
        eC1.establecerCosto(350);
        eC1.establecerDireccionMAC("4b89.fs33.fsr.qwe5");
        eC1.establecerInfoIMEI("5d4s.ss3.ew9.fs8s0");
        //===============================================
        eC2.establecerSistemaOP("Android");
        eC2.establecertamanioPantalla("188,9 x 80,1 mm");
        eC2.establecerCosto(500);
        eC2.establecerDireccionMAC("6ryd3.fs3b.q98t.8trb");
        eC2.establecerInfoIMEI("mo8p.rt8.a8z9e.09te");
        //===============================================
        System.out.println("Equipo Celular 1");
        System.out.printf("\nSistema operativo: "+"%8s",eC1.obtenerSistemaOP());
        System.out.printf("\nTamaño de pantalla: "+"%6s",eC1.obtenerTamanioPantalla());
        System.out.printf("\nCosto: "+"%19.2f",eC1.obtenerCosto());
        System.out.printf("\nDirección MAC: "+"%23s",eC1.obtenerDireccionMAC());
        System.out.printf("\nInformación IMEI: "+"%20s",eC1.obtenerInfoIMEI());
        //===============================================
        System.out.println("");
        System.out.println("\nEquipo Celular 2");
        System.out.printf("\nSistema operativo: "+"%8s",eC2.obtenerSistemaOP());
        System.out.printf("\nTamaño de pantalla: "+"%6s",eC2.obtenerTamanioPantalla());
        System.out.printf("\nCosto: "+"%19.2f",eC2.obtenerCosto());
        System.out.printf("\nDirección MAC: "+"%25s",eC2.obtenerDireccionMAC());
        System.out.printf("\nInformación IMEI: "+"%21s",eC2.obtenerInfoIMEI());
    }  
}

