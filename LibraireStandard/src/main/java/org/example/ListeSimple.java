package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListeSimple {
    public static void main( String[] args ) throws IOException {
        repete(4,4);
    }

    public static void repete(int n, int nombreFois) {
        List<Integer> liste = new ArrayList<Integer>();
        int ger = 1;
        for (int p = 0; p < n; p++)
        {
            for (int i = 0; i < nombreFois; i++ )
            {
                liste.add(ger);
            }
            ger++;
        }
        System.out.println(liste);


    }
}
