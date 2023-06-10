package lab8p1_diegoalberto;

import java.util.Scanner;

public class Lab8P1_DiegoAlberto {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        /* System.out.println("Elija una opcion");
        System.out.println("1. Crear biblioteca");
        System.out.println("2. Modificar librero");
        System.out.println("3. Salir");
        opcion = sc.nextInt();*/
        int validacion = 0;
        Libro[][] librero2 = null;
        while (opcion != 3) {
            System.out.println("Elija una opcion");
            System.out.println("1. Crear biblioteca");
            System.out.println("2. Modificar librero");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1: {
                    librero2 = llenarLibrero();
                    validacion++;
                    break;
                }

                case 2: {
                    if (validacion == 0) {
                        System.out.println("Debe hacer primero la bliblioteca");

                    } else {

                        System.out.println("Ingrese el nombre del titulo");
                        String titulo = scs.nextLine();
                        System.out.println("Ingrese el nombre del autor");
                        String autor = scs.nextLine();
                        System.out.println("Ingrese el año de publicacion");
                        int publi = sc.nextInt();

                        librero2 = ModificarLibro(librero2, titulo, autor, publi);
                        System.out.println("El librero modificado es");
                        matrizmod(librero2);
                        //print(librero2); 
                    }

                    opcion = 4;
                    break;
                }

                case 3: {
                    break;
                }
                default:
                    break;

            }

        }
    }

    public static Libro[][] llenarLibrero() {
        System.out.println("Ingrese numero de filas");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = sc.nextInt();

        while (filas < 1) {
            System.out.println("Las filas deben ser mayores a a 1");
            filas = sc.nextInt();
            if (columnas < 1) {
                System.out.println("Las columnas deben ser mayor a 1");
                columnas = sc.nextInt();
            }
        }

        Libro[][] librero = new Libro[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el nombre del titulo");
                String titulo = scs.nextLine();
                System.out.println("Ingrese el nombre del autor");
                String autor = scs.nextLine();
                System.out.println("Ingrese el año de publicacion");
                int publi = sc.nextInt();

                System.out.println("El libro ah sido agregado exitosamente ");

                Libro book = new Libro(titulo, autor, publi);

                librero[i][j] = book;

            }

        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("[" + librero[i][j].getTitulo() + "]");

            }

        }

        return librero;

    }

    public static Libro[][] ModificarLibro(Libro[][] librero, String titulo, String autor, int publi) {

        boolean encon = false;

        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {

                Libro librito = librero[i][j];

                String escritor = librito.getEscritor();
                int publicacion = librito.getPublicacion();
                String titu = librito.getTitulo();

                if (autor.equals(escritor) && publicacion == publi && titulo.equals(titu)) {
                    System.out.println("Se encontro el libro en la fila" + (i + 1) + "columa" + (j + 1));
                    System.out.println("Ingrese el nombre del titulo");
                    titulo = scs.nextLine();
                    System.out.println("Ingrese el nombre del autor");
                    autor = scs.nextLine();
                    System.out.println("Ingrese el año de publicacion");
                    publi = sc.nextInt();

                    librero[i][j].setEscritor(autor);
                    librero[i][j].setTitulo(titulo);
                    librero[i][j].setPublicacion(publi);

                    encon = true;
                    break;

                }
                if (encon) {
                    break;
                }
            }

            if (!encon) {
                System.out.println("No se encontró el libro en el librero.");

                System.out.println("Ingrese el nombre del título nuevamente");
                titulo = scs.nextLine();
                System.out.println("Ingrese el nombre del autor nuevamente");
                autor = scs.nextLine();
                System.out.println("Ingrese el año de publicación nuevamente");
                publi = sc.nextInt();
            }

        }

        return librero;
    }

    public static void matrizmod(Libro[][] librero) {
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                System.out.print("[" + librero[i][j].getTitulo() + "]");
            }
            System.out.println();
        }
    }

}
