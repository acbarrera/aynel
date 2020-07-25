public class Persona {

    private String nombre;
    private int ci;
    private int edad;

    public Persona(){

    }

    public Persona(String unNombre,int unCi, int unaedad){
        this.nombre = unNombre;
        this.ci = unCi;
        this.edad = unaedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
