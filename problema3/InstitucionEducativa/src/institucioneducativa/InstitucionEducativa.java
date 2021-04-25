package institucioneducativa;

public class InstitucionEducativa {
    private String nombre2;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroDeSedes;
    
    public void establecerNombre(String n){
        nombre2 = n;
    }
    public void establecertipoInstitucion(String n){
        tipoInstitucion = n;
    }
    public void establecerNAlumnos(int n){
        numeroAlumnos = n;
    }
    public void establecerNDocentes(int n){
        numeroDocentes = n;
    }
    public void establecerNSedes(int n){
        numeroDeSedes = n;
    }
    
    public String obteberNombre(){
        return nombre2;
    }
    public String obtenertipoInstitucion(){
        return tipoInstitucion;
    }
    public int obtenerNAlumnos(){
        return numeroAlumnos;
    }
    public int obtenerNDocentes(){
        return numeroDocentes;
    }
    public int obtenerNSedes(){
        return numeroDeSedes ;
    }
}

