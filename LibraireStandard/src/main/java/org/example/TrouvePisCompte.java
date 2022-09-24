package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrouvePisCompte {
    public static void main( String[] args ) throws IOException {
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(3);
        liste.add(3);
        liste.add(3);
        liste.add(4);
        trouve(5,liste);
        compte(1, liste);

    }

    public static boolean trouve(int element, List<Integer> liste) {
        for (int el : liste) {
            if (element == el)
            {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }

    public static int compte(int element, List<Integer> liste){
        int cpt = 0;
        for (int el : liste) {
            if (element == el)
            {
               cpt++;
            }
        }
        System.out.println(cpt);
        return cpt;
    }
}
