import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {

    public static void main(String args[]){
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();

        System.out.println("------Menu------");
        /* 1 - Agregar profesor
           2 - Agregar alumno
           3 - Ver alumnos
           4 - Ver profesores
           5 - Salir
        */
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        while (opcion != 5){
            System.out.println("1 - Agregar profesor");
            System.out.println("2 - Agregar alumno");
            System.out.println("3 - Ver alumnos");
            System.out.println("4 - Ver profesores");
            System.out.println("5 - Salir");
            opcion = entrada.nextInt();

            if (opcion == 1){
                System.out.println("Ingrese nombre del profesor");
                String nombre = entrada.next();
                System.out.println("Ingrese CI del profesor");
                int ci = entrada.nextInt();
                System.out.println("Ingrese edad del profesor");
                int edad = entrada.nextInt();
                System.out.println("Ingrese materia del profesor");
                String materia = entrada.next();
                System.out.println("Ingrese materia del profesor");
                int salario = entrada.nextInt();

                Profesor pro = new Profesor(materia,salario,nombre,ci,edad);
                listaPersona.add(pro);
            }
            else if (opcion == 4){
                imprimirPersona(listaPersona);
            }
        }
    }
    public static void imprimirPersona(ArrayList<Persona> lista){
        System.out.println("-----Listado de Personas-----");
        for (Persona p: lista){
            System.out.println(p);
        }
    }
}
