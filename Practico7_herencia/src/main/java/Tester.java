public class Tester extends Empleado{

    private boolean manual;
    private boolean automatizador;

    public Tester(boolean unmanual, boolean unautomatizador){
        this.manual = unmanual;
        this.automatizador = unautomatizador;
    }

    public boolean isManual() {
        return manual;
    }

    public boolean isAutomatizador() {
        return automatizador;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setAutomatizador(boolean automatizador) {
        this.automatizador = automatizador;
    }
    @Override
    public String toString() {
        /*return "Es " +
                "manual=" + manual +
                ", automatizador=" + automatizador +
                '}';*/
        if (automatizador){}
    }
}
