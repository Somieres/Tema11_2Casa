package ficheros_random;

public class Main_Ficheros_Random {

    public static void main(String[] args) {
        Ejercicio1.leer();

        //Montamos el array de perros
        Uso_StringBuffer.listaPerros.add(new Perro(1,"Mosto",true,"Marron",4, Perro.Raza.BRETON));
        Uso_StringBuffer.listaPerros.add(new Perro(2,"Chispas",true,"blanco",3, Perro.Raza.DOBERMAN));
        Uso_StringBuffer.listaPerros.add(new Perro(3,"Rancio",false,"negro",2, Perro.Raza.PODENCO));
        Uso_StringBuffer.listaPerros.add(new Perro(4,"Sintagma",true,"gris",1, Perro.Raza.PASTOR_ALEMAN));



        Uso_StringBuffer.sb.setLength(10);
        Uso_StringBuffer.sb.length();
        Uso_StringBuffer.sb.toString();
    }

}
