package clase_file;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {

    public static Scanner sc=new Scanner(System.in);
    public static String fichero="";
    public static File file=null;
    public static File [] listaFicheros;

    public static void montrarContenido(){

        System.out.println("Indique el nombre del directorio del que desee conocer el contenido");
        fichero=sc.nextLine();

        file=new File(fichero);
       // listaFicheros = file.list();

        for (int i=0; i<listaFicheros.length;i++){
            System.out.println(listaFicheros[i]);
        }

    }


}
