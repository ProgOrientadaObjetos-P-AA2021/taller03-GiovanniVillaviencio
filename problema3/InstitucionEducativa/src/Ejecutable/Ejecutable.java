package Ejecutable;
import institucioneducativa.InstitucionEducativa;
public class Ejecutable {
    public static void main(String[] args) {
        InstitucionEducativa iE1 = new InstitucionEducativa();
        InstitucionEducativa iE2 = new InstitucionEducativa();
        //===============================================================================
        iE1.establecerNAlumnos(3000);
        iE1.establecerNDocentes(80);
        iE1.establecerNSedes(3);
        iE1.establecerNombre("Daniel Alvarez Burneo");
        iE1.establecertipoInstitucion("Fiscomisional");
        //===============================================================================
        iE2.establecerNAlumnos(1750);
        iE2.establecerNDocentes(40);
        iE2.establecerNSedes(2);
        iE2.establecerNombre("Antonio Peña Celi");
        iE2.establecertipoInstitucion("Privado");
        //===============================================================================
        System.out.println("*************************************************************");
        System.out.printf("Nombre de la institución: "+"%s",iE1.obteberNombre());
        System.out.printf("\nNúmero de alumnos: "+"%11d",iE1.obtenerNAlumnos());
        System.out.printf("\nNúmero de profesores: "+"%6d",iE1.obtenerNDocentes());
        System.out.printf("\nTipo de institución: "+"%18s",iE1.obtenertipoInstitucion());
        System.out.printf("\nNúmero de sedes: "+"%10d",iE1.obtenerNSedes());
        System.out.println("\n*************************************************************");
        System.out.printf("Nombre de la institución: "+"%s",iE2.obteberNombre());
        System.out.printf("\nNúmero de alumnos: "+"%11d",iE2.obtenerNAlumnos());
        System.out.printf("\nNúmero de profesores: "+"%6d",iE2.obtenerNDocentes());
        System.out.printf("\nTipo de institución: "+"%12s",iE2.obtenertipoInstitucion());
        System.out.printf("\nNúmero de sedes: "+"%10d",iE2.obtenerNSedes());
    }
}

