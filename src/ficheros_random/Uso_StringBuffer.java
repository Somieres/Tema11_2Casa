package ficheros_random;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Uso_StringBuffer {

    public static StringBuffer sb;
    public static RandomAccessFile raf = new RandomAccessFile("datosBuffer.bin");
    public static List<Perro> listaPerros=new ArrayList<Perro>();

    public static void incluir(){
        try {
            raf = new RandomAccessFile("datosBuffer.bin","rw");

            for (int i = 0; i <listaPerros.size() ; i++) {
                raf.write(listaPerros.get(i).getId());
                sb=new StringBuffer(listaPerros.get(i).getNombre());
                sb.setLength(15);
                raf.writeBoolean(listaPerros.get(i).isConChapa());
                sb=new StringBuffer(listaPerros.get(i).getColor());
                sb.setLength(15);
                raf.write(listaPerros.get(i).getEdad());
                sb=new StringBuffer(listaPerros.get(i).getRaza().name());
                sb.setLength(15);
                raf.writeChars(sb.toString());
            }
        }catch (Exception e){
            System.out.println("error");
        }

    }
    public static void leer(){


        try {
            raf=new RandomAccessFile (Perro.);
            for (int i = 0; i < ; i++) {

            }

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
