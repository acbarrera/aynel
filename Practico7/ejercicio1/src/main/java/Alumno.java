public class Alumno extends Persona{

    private int nroEstudiante;
    private String grupo;
    private boolean tienePrevia;

    public Alumno(int nroEst,String ungrupo,boolean previa,String unNombre,int unCi, int unaedad){
        super(unNombre,unCi,unaedad);
        this.nroEstudiante = nroEst;
        this.grupo = ungrupo;
        this.tienePrevia = previa;
    }

    public int getNroEstudiante() {
        return nroEstudiante;
    }

    public String getGrupo() {
        return grupo;
    }

    public boolean isTienePrevia() {
        return tienePrevia;
    }

    public void setNroEstudiante(int nroEstudiante) {
        this.nroEstudiante = nroEstudiante;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setTienePrevia(boolean tienePrevia) {
        this.tienePrevia = tienePrevia;
    }

    @Override
    public String toString() {
        return "El número de alumno es: " +
                "nroEstudiante=" + nroEstudiante +
                ", grupo='" + grupo + '\'' +
                ", tienePrevia=" + tienePrevia +
                '}';
    }
}
