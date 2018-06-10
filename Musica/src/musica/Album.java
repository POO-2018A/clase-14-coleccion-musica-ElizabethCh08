package musica;

public class Album {

    private String nombre;
    private Genero genero;    //ojo
    private int  añoLanzamiento;
    private int numCanciones;

    public Album(String nombre, Genero genero, int añoLanzamiento, int numCanciones) {
        this.nombre = nombre;
        this.genero = genero;
        this.añoLanzamiento = añoLanzamiento;
        this.numCanciones = numCanciones;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }



    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }


    public String toString (){
        return "Nombre: "+this.nombre+" ,Año de Creacion= "+añoLanzamiento+" ,Genero: "+genero+" ,Numero de canciones: "+numCanciones;
    }

}
