package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class EcrireEtLitFichier
{
    public static void main( String[] args ) throws IOException {
        ecrire();
        ecrire2();
        nomprenom();
        lire(args);
    }
    public static void ecrire() throws IOException {
        FileWriter file = new FileWriter("./vide.txt");
        file.write("bonjour jdajdi");
        file.close();
    }

    public static void ecrire2() throws IOException {
        FileWriter file = new FileWriter("./vides.txt");
        file.write("bonjour tcool");
        file.close();
    }

    public static void nomprenom() throws IOException {
        FileWriter file = new FileWriter("../nomprenom.txt");
        file.write("Andy Ly");
        file.close();
    }

    public static void lire(String[] args) throws IOException {
        if (args.length > 1)
        {
            for (String read : args) {
                FileReader file = new FileReader(read);
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine())
                {
                    String line = myReader.nextLine();
                    System.out.print(line + " -------- ");
                }
            }
        }
        else
        {
            FileReader file = new FileReader(args[0]);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine())
            {
                String line = myReader.nextLine();
                System.out.println(line);
            }

        }


    }


}
