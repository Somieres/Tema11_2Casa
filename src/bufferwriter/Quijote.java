package bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Quijote {
/*
 Ejemplo: Vamos a guardar en un fichero de texto:
“En un lugar de La Mancha,
de cuyo nombre no quiero acordarme”
La primera línea carácter a carácter
La segunda línea en una sola sentencia

 */
    public static final String FICHERO="FicheroQuijote.txt";
    public static String cadena="";

    public static void escribir(){

        BufferedWriter output=null;
        try {
            output=new BufferedWriter(new FileWriter(FICHERO));
            cadena="En un lugar de la Mancha, ";
            for (int i=0; i<cadena.length();i++){
                output.write(cadena.charAt(i));
            }
            cadena="de cuyo nombre no quiero acordarme...";
            output.write(cadena);
        }catch (IOException ex){
            System.out.println("Error de escritura");
        }catch (Exception e){
            System.out.println("Error general");
        }finally {
            try{
                if (output!=null){
                    output.close();
                }
            }catch (IOException ex){
                System.out.println("Error de cierre de escritura");
            }
        }
    }
}
