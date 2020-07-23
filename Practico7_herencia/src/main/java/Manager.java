public class Manager extends Empleado{

    private String area;

    public Manager(String unarea){
        this.area = unarea;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "area='" + area + '\'' +
                '}';
    }
}
