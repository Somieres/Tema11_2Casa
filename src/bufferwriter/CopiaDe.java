package bufferwriter;
import java.io.*;
import java.util.Scanner;

public class CopiaDe {

    public static final String TXT=".txt";

    public static void proceso() {

        String ficheroError = "Scanner";
        String nombreFichero = "";
        String nombreFicheroCopia = "copia_de";
        Scanner sc = null;
        BufferedReader input = null;
        BufferedWriter output = null;
        String registro = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("Introduzca el nombre del fichero que desee sobreescribir");
            nombreFichero = sc.nextLine();
            nombreFichero = nombreFichero + TXT;
            ficheroError = nombreFichero;
            registro = input.readLine();
            if (registro != null) {

                nombreFicheroCopia = nombreFicheroCopia + nombreFichero;
                ficheroError = nombreFicheroCopia;
                output = new BufferedWriter(new FileWriter(nombreFicheroCopia));
                while (registro != null) {
                    ficheroError = nombreFicheroCopia;
                    output.write(registro);
                    output.newLine();
                    ficheroError = nombreFichero;
                    registro = input.readLine();
                }

            }


        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("El archivo "+ficheroError+ " no ha sido enontrado");
        } catch (IOException ex) {
            System.out.println("Error de lectura del "+ficheroError);
        }catch (Exception e){
            System.out.println("Error general del "+ficheroError);
        }finally {
            try {
                ficheroError=nombreFichero;
                input.close();
                ficheroError=nombreFicheroCopia;
                output.close();

            }catch (IOException ex){
                System.out.println("Error al cierre del fichero "+ficheroError);
            }
        }
    }
}
