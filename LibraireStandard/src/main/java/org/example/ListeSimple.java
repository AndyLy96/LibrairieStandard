package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListeSimple {
    public static void main( String[] args ) throws IOException {
        repete(4,2);
    }

    public static void repete(int n, int nombreFois) {
        List<Integer> liste = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int o=0; o<nombreFois;o++)
            {
                System.out.print(1);
            }

        }

    }
}
