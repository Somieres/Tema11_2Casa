package clase_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    /*
    Ejercicio 1.- En este programa, vamos a pedir el nombre de un fichero o de un directorio. El
programa comprobará si el fichero o el directorio existe físicamente o no y mostrará las
propiedades del fichero o el directorio:
• el nombre del fichero o directorio
• la ruta con la que se creó el objeto File.
• la ruta absoluta asociada al objeto File.
• el directorio padre de File
• si el fichero o directorio existe o no
• Si existe, indicará si:
• Es de escritura:
• Es de lectura:
• Es un directorio:
• Tamaño en bytes del fichero o directorio */

    public static Scanner sc=new Scanner(System.in);
    public static String fichero="";

    public static File file=null;

    public static void existeFichero(){


            //Pedimos el nombre del fichero que queremos encontrar
            System.out.println("introduzca el nombre del fichero que desee encontrar");
            fichero=sc.nextLine();

            file=new File(fichero);
            //Utilizamos los metodos de la clase File
        //Para saber si el fichero es de lectura
        System.out.println("¿Es mi fichero de lectura? " + file.canRead());
        //Saber si se puede escribir en el
        System.out.println("¿Se puede escribir en el fichero? "+file.canWrite());
        //este metodo lo tenermos que introducir en un try catch
        //este metodo sirve para crear un fichero si no existe previamente
        try{
            System.out.println("¿Se ha podido crear un fichero asociado? "+file.createNewFile());
        }catch (IOException ex){
            System.out.println("Error");
        }
        //metodo para borrar el archivo
        //  System.out.println("Borrado del archivo creado previamnete "+ file.delete());
        // metodo para saber si existe el fichero
        System.out.println("¿Existe mi fichero? " + file.exists());
        // Para conocer el nombre del fichero
        System.out.println("el fichero se llama "+file.getName());
        //para saber la ruta absoluta del fichero
        System.out.println("La ruta absoluta del fichero es "+ file.getAbsolutePath());
        //para saber la ruta absoluta asociado al fichero
        // Debe de estar dentro de un try catch
        try{
        System.out.println("La ruta absoluta del fichero es "+ file.getCanonicalFile());
        }catch (IOException ex){
        System.out.println("Error");
        }
        // Devuelve la ruta con la que se creó el objeto, puede ser relativa o no
           System.out.println(file.getPath());

        //saber si la ruta es absoluta
        System.out.println("La ruta es absoluta? "+ file.isAbsolute());

        // Para saber si es un directorio válido
        System.out.println("Pertenece a un directorio valido? "+file.isDirectory());

        // Para saber cuando fue modificado la ultima vez
        System.out.println("Cuando fue modificado la ultima vez? "+file.lastModified());

        // devuelve el tamaño en bytes del fichero, devuelve 0 si no existe
        System.out.println("Que tamaño tiene? "+file.length());

        // Para saber si es un directorio válido
        //System.out.println("Pertenece a un drectorio valido? "+file.isDirectory());

        // Para saber si es un directorio válido
        //System.out.println("Pertenece a un drectorio valido? "+file.isDirectory());

        // Para saber si es un directorio válido
       // System.out.println("Pertenece a un drectorio valido? "+file.isDirectory());

        // Para saber si es un directorio válido
       // System.out.println("Pertenece a un drectorio valido? "+file.isDirectory());

    }

}
