public class Profesor extends Persona{

    private String materia;
    private int salario;


    public Profesor(String unaMateria,int unSalario,String unNombre,int unCi, int unaedad){
        super(unNombre,unCi,unaedad);
        this.materia = unaMateria;
        this.salario = unSalario;
    }

    public String getMateria() {
        return materia;
    }

    public int getSalario() {
        return salario;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                ", salario=" + salario +
                '}';
    }
}
