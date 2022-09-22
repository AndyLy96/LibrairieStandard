package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ecrire();
        nomprenom();
    }
    public static void ecrire() throws IOException {
        FileWriter file = new FileWriter("./vide.txt");
        file.write("bonjour jdajdi");
        file.close();
    }

    public static void nomprenom() throws IOException {
        FileWriter file = new FileWriter("../nomprenom.txt");
        file.write("Andy Ly");
        file.close();
    }


}
