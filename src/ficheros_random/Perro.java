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
