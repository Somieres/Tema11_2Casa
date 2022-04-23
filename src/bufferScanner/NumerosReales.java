package bufferScanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
Crear, con un editor, un archivo de texto de números reales,
uno por línea. Abrirlo con un flujo de texto para lectura y leerlo línea a
línea. Convertir las cadenas leídas en número de tipo double por medio
de Scanner, y mostrar al final la suma de todos ellos.
 */
public class NumerosReales {

    public static String fichero="Scanner.txt";

    public static void proceso(){

        BufferedReader input=null;
        Scanner sc=null;
        String registro="";
        Double acum=0.0;
        int cont=0;
        try {

            input=new BufferedReader(new FileReader(fichero));
            registro= input.readLine();

            while (registro!=null){

                sc=new Scanner(registro);

                if (sc.hasNextDouble()){
                    acum=acum+sc.nextDouble();
                    cont++;
                }
                registro=input.readLine();
            }

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("El archivo "+ fichero+ " no ha sido encontrado");
        }catch (IOException ex){
            System.out.println("ERRROR lectura del fichero" + fichero);
        }catch (NumberFormatException numberFormatException){
            System.out.println("El dato leido no es un double");
        }catch (Exception e){
            System.out.println("ERROR GENERAL");
        }finally {
            try {

                if (input != null) {
                    input.close();
                    System.out.println("La suma es " + acum);
                    System.out.println("La cantidad de numeros introducidos es de " +cont);
                }
            }catch (IOException ex){
                System.out.println("Error de cierre");
            }
        }
    }
}
