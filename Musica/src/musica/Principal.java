package musica;


import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int auxGeneros = 0;
        int auxAlbumes = 0;
        Genero ListaGeneros[] = new Genero[3];
        Album ListaAlbumes[] = new Album[4];

        do {
            System.out.println("\t Coleccion de musica");
            System.out.println("1.- Ingresar artista ");
            System.out.println("2.- Ingresar album ");
            System.out.println("3.- Ingresar genero ");
            System.out.println("4.- Imprimir artistas ");
            System.out.println("5.- Salir ");
            System.out.println("Ingrese la opcion que desea: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del artista: ");
                    sc.nextLine();
                    String nombreArtista = sc.nextLine();

                    System.out.println("Ingrese el pais: ");
                    String paisArtista = sc.nextLine();

                    System.out.println("Seleccione todos los albums que pertenecen al artista: ");
                    for (int i = 0; i < ListaAlbumes.length; i++) {
                        if (ListaAlbumes[i] != null) {
                            System.out.println((i + 1) + ". " + ListaAlbumes[i].getNombre());
                        }
                    }
                    String albumesArtistaTmp = sc.nextLine();
                    String[] idAlbumesArtista = albumesArtistaTmp.split(",");

                    Album[] albumesArtista = new Album[idAlbumesArtista.length];
                    for (int i = 0; i < idAlbumesArtista.length; i++) {
                        albumesArtista[i] = ListaAlbumes[Integer.valueOf(idAlbumesArtista[i])];
                    }
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("Ingrese el nombre del album: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el año de creacion: ");
                    int anio = sc.nextInt();
                    System.out.println("Ingrese numero de canciones: ");
                    int numCanciones = sc.nextInt();
                    for (int i = 0; i < ListaGeneros.length; i++) {
                        if (ListaGeneros[i] != null) {
                            System.out.println((i + 1) + ". " + ListaGeneros[i]);
                        }
                    }
                    System.out.println("Seleccione el genero a que pertenece: ");
                    int opcionGenero = sc.nextInt();
                    Genero generoSeleccionado = ListaGeneros[opcionGenero - 1];

                    Album album = new Album(nombre, generoSeleccionado, anio, numCanciones);

                    System.out.println("Se ha ingresado el siguiente album: ");
                    System.out.println(album);
                    System.out.println("");

                    ListaAlbumes[auxAlbumes] = album;
                    auxAlbumes++;
                    break;
                case 3:
                    if (auxGeneros == 3) {
                        System.out.println("La lista de generos esta llena ");
                        break;
                    }
                    System.out.println("Ingrese el nombre del genero ");
                    sc.nextLine();
                    String nombreGenero = sc.nextLine();

                    Genero genero = new Genero(nombreGenero);

                    ListaGeneros[auxGeneros] = genero;
                    auxGeneros++;

                    break;
                case 4:
                    System.out.println("Esta es la lista de artistas: ");
                    break;
                case 5:
                    System.out.println("Adios ");
                    break;
                default:
                    System.out.println("Opcion no valida ");
                    break;
            }

        } while (opcion != 5);
    }
}
