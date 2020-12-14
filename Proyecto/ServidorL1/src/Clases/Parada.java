package Clases;

public class Parada {//Parada por donde pasarán los buses

    private String nombre;

    public Parada(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Parada getParada(String nombre) {

        if (this.getNombre().equals(nombre)) {
            return this;
        }
        return null;
    }

}
