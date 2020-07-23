public class MiEmpresa {

    private Empleado tester = new Tester();
    private Empleado dev1 = new Developer(lenguaje);
    private Empleado dev2 = new Developer(lenguaje);
    private Empleado manager = new Manager(area);

    public MiEmpresa(Tester untes,Developer unev1,Developer undev2,Manager unmanager){
        this.tester = untes;

    }

}
