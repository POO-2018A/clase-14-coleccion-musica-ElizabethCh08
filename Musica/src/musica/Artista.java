package musica;

import java.util.Arrays;
import java.util.Objects;

public class Artista {
    private String nombre;
    public String  fechadeNacimiento;
    private String pais;
    private Album [] albums;


    public Artista(String nombre, String fechadeNacimiento, String pais, Album[] albums) {
        this.nombre = nombre;
        this.fechadeNacimiento = fechadeNacimiento;
        this.pais = pais;
        this.albums = albums;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artista)) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nombre, artista.nombre) &&
                Objects.equals(fechadeNacimiento, artista.fechadeNacimiento) &&
                Objects.equals(pais, artista.pais) &&
                Arrays.equals(albums, artista.albums);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(nombre, fechadeNacimiento, pais);
        result = 31 * result + Arrays.hashCode(albums);
        return result;
    }

    @Override
    public String toString (){
        return this.nombre;
    }
}
