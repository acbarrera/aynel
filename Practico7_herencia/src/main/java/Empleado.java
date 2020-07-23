public class Empleado {

    private String nombre;
    private float sueldo;
    private int telefono;

    public Empleado(){

    }
    public Empleado (String unNombre,float unsueldo,int untelefono){
        this.nombre = unNombre;
        this.sueldo = unsueldo;
        this.telefono = untelefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {

        return this.telefono;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /*public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", telefono=" + telefono +
                '}';
    }*/
}
