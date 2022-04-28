package ficheros_random;

public class Perro {

    enum Raza{PASTOR_ALEMAN, BRACO, PODENCO, DOBERMAN, BRETON};
    private int id;
    private String nombre;
    private boolean conChapa;
    private String color;
    private int edad;
    private Raza raza;

    public Perro(){

    }

    public Perro(int id, String nombre, boolean conChapa, String color, int edad, Raza raza) {
        this.id = id;
        this.nombre = nombre;
        this.conChapa = conChapa;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isConChapa() {
        return conChapa;
    }

    public void setConChapa(boolean conChapa) {
        this.conChapa = conChapa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", conChapa=" + conChapa +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", raza=" + raza;
    }
}
