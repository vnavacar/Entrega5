package Main;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio10 {
public static void Lanzar(Scanner teclado){
Inicio i= new Inicio(teclado);
}
}
class Empleado {

    String nombre;
    int id;
    int seguridadSocial;

    public Empleado() {

    }

    public Empleado(String nombre, int id, int seguridadSocial) {
        this.nombre = nombre;
        this.id = id;
        this.seguridadSocial = seguridadSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empleado)) {
            return false;

        }
        Empleado e = (Empleado) o;
        return ((e.id == this.id) && e.nombre.equals(this.nombre) && e.seguridadSocial == this.seguridadSocial);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + this.id;
        hash = 17 * hash + this.seguridadSocial;
        return hash;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getSegurdiadSocial() {
        return this.seguridadSocial;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Nombre: " + this.nombre;
        s += " Id: " + this.id;
        s += " Segurdidad social " + this.seguridadSocial;
        return s;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSegurdiadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

}

class gestorEmpleados {

    LinkedList<Empleado> lista;

    gestorEmpleados() {
        lista = new LinkedList<>();
    }

    public void registrar(Scanner teclado) {
        Empleado e = new Empleado();
        System.out.println("Nombre empleado");
        String nombre;
        nombre = teclado.next();
        e.setNombre(nombre);
        int id;
        while (true) {
            System.out.println("Número de identificación");
            try {
                id = teclado.nextInt();
                break;
            } catch (InputMismatchException i) {
                teclado.next();
            }
        }
        e.setId(id);
        int social;
        while (true) {
            System.out.println("Nº Seguridad Social");
            try {
                social = teclado.nextInt();
                break;
            } catch (InputMismatchException i) {
                teclado.next();
            }
        }
        e.setSegurdiadSocial(social);
        List<Empleado> buscar = lista.stream().filter(b -> (b.id == e.id) || (b.seguridadSocial == e.seguridadSocial)).collect(Collectors.toList());
        if (buscar.isEmpty()) {
            lista.add(e);
        } else {
            System.out.println("Empleado ya registrado");
        }

    }

    public void buscarEmpleadoNombre(Scanner teclado) {
        System.out.println("Introduzca el nombre del empleado que desea buscar");
        String nombre = teclado.next();
        List<Empleado> buscar = lista.stream().filter(b -> b.nombre.equalsIgnoreCase(nombre)).collect(Collectors.toList());
        if (buscar.isEmpty()) {
            System.out.println("No existe");
        } else if (buscar.size() > 1) {
            System.out.println("Hay varios empleados con este nombre");
            while (true) {
                try {
                    buscarEmpleadoId(teclado);
                    break;
                } catch (InputMismatchException i) {
                    teclado.next();
                }
            }
        } else {
            System.out.println(buscar.get(0).toString());
        }

    }

    public void buscarEmpleadoId(Scanner teclado) {
        System.out.println("Introduce id del empleado");

        int ide = 0;
        while (true) {
            try {
                ide = teclado.nextInt();
                break;
            } catch (InputMismatchException i) {
                teclado.next();
            }
        }
        final int id = ide;

        List<Empleado> buscar = lista.stream().filter(b -> b.id == id).collect(Collectors.toList());
        if (buscar.isEmpty()) {
            System.out.println("No existe");
        } else {
            System.out.println(buscar.get(0).toString());
        }

    }

    public void buscarEmpleadoSocial(Scanner teclado) {
        System.out.println("Introduce el número de segurdiad social");
        int s;
        while (true) {
            try {
                s = teclado.nextInt();
                break;
            } catch (InputMismatchException i) {
                teclado.next();
            }
        }
        final int se = s;
        List<Empleado> buscar = lista.stream().filter(b -> b.seguridadSocial == se).collect(Collectors.toList());
        if (buscar.isEmpty()) {
            System.out.println("No existe");
        } else {
            buscar.get(0).toString();
        }

    }
}

class Inicio {

    public Inicio(Scanner teclado) {
        gestorEmpleados g = new gestorEmpleados();
        int eleccion;
        while (true) {
            System.out.println("1: Registrar Empleado");
            System.out.println("2: Buscar por nombre");
            System.out.println("3: Buscar pod ID");
            System.out.println("4: Buscar por Seguridad Social");
            System.out.println("5: Salir");
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                eleccion = 0;
            }
            switch (eleccion) {
                case 1:
                    g.registrar(teclado);
                    break;
                case 2:
                    g.buscarEmpleadoNombre(teclado);
                    break;
                case 3:
                    g.buscarEmpleadoId(teclado);
                    break;
                case 4:
                    g.buscarEmpleadoSocial(teclado);
                    break;
                    case 5: System.exit(0);
                default:
                    break;
            }
        }

    }
}
