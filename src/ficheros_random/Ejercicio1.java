package ficheros_random;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio1 {


    public static RandomAccessFile raf;

    public static void leer(){

        try{
            raf=new RandomAccessFile("datos.bin","rw");


            raf.write(1);
            raf.write(2);
            raf.write(3);
            raf.write(4);

            raf.writeLong(5);
            raf.writeLong(6);
            raf.writeLong(7);
            raf.writeLong(8);

            raf.seek(0);

            System.out.println(raf.read());
            System.out.println(raf.read());
            System.out.println(raf.read());
            System.out.println(raf.read());
            System.out.println(raf.readLong());
            System.out.println(raf.readLong());
            System.out.println(raf.readLong());
            System.out.println(raf.readLong());


        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println();
        }
    }
}
