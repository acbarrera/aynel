public class Developer extends Empleado{
    private String lenguaje;

    public Developer(String unlenguaje){
        this.lenguaje = unlenguaje;
    }

    public String toString() {
        return "Developer{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }
}
