package bufferScanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class NumerosEnteros {
/*
Crear, con un editor, un archivo de texto de números enteros
con la siguiente información (dos registros con secuencias de números
enteros separados por espacios y tabuladores):
3 45 6 77 89
123 45 67 777
Abrirlo con un flujo de texto para lectura y leerlo línea a línea y datos a
dato. Devolver la suma de todos los números y la cantidad de números
leídos
 */

    public static String fichero="Enteros.txt";

    public static void porceso(){

        BufferedReader input=null;
        Scanner sc=null;
        String registro="";
        int acum=0;
        int cont=0;

        try {
            input=new BufferedReader(new FileReader(fichero));
            registro=input.readLine();
            while (registro!=null) {

                sc = new Scanner(registro);
                while (sc.hasNextInt()){
                    acum=acum+sc.nextInt();
                    cont++;
                }
                registro = input.readLine();
            }

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("El fichero "+ fichero+" no se encuentra");
        }catch (IOException ex){
            System.out.println("Error de lectura del fichero " + fichero);
        }catch (NumberFormatException numberFormatException){
            System.out.println("Error de numero de formato");
        }catch (Exception e){
            System.out.println("error fatal");
        }finally {

            try {
                if (input!=null){
                input.close();
                    System.out.println("La suma de los numeros del fichero es: " +acum);
                    System.out.println("La cantidad de numeros introducidos es: "+cont);
                }
            }catch (IOException ex){
                System.out.println("Error de cierre de archivo");
            }
        }

    }
}
