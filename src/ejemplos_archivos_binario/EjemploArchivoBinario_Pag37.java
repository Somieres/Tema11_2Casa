package ejemplos_archivos_binario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjemploArchivoBinario_Pag37 {

    public static int[] tabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static List<Integer> tabla2 = new ArrayList<Integer>();

    public static void escribir() throws IOException {

        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;

        try {

            fileOutputStream=new FileOutputStream("datos.dat");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);

            for (int i = 0; i <tabla.length ; i++) {
                objectOutputStream.write(tabla[i]);
            }

            objectOutputStream.writeObject(tabla);

        }catch (EOFException ex){
            System.out.println("Error FATAL");
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();

            }catch (EOFException ex){
                System.out.println("ERROR AL CIERRE DEL FICHERO");
            }


        }
    }

    public static void leer() throws IOException {

        try(FileInputStream fileInputStream=new FileInputStream("datos.dat");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {

            tabla = (int[]) objectInputStream.readObject();
            for (int i = 0; i < tabla.length; i++) {
                System.out.println(objectInputStream.read());
            }
        }catch (ClassNotFoundException classNotFoundException){
            System.out.println("fata");

        }catch (EOFException eofException){
            System.out.println("Error ");
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("donde lees?");
        }c

    }




}
