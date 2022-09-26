package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriCustom {

    public static void main( String[] args ) throws IOException {
        List<Integer> liste = Arrays.asList(1234, 44445454, 535435, 53534534, 345345345,3, 45334543, 5345345);

        Collections.sort(liste, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // return -1 is tu veux que o1 soit avant o2 dans le resultat
                // return 1 is tu veux que o1 soit apres o2 dans le resultat
                // 0 si je mèn fous
                int premierChiffre1 = o1.toString().charAt(0);
                int premierChiffre2 = o2.toString().charAt(0);
                if(premierChiffre1 < premierChiffre2) return -1;
                if(premierChiffre1 > premierChiffre2) return 1;
                // ici les 2 ont le meme nombre de chiffre
                if (o1 > o2) return -1;
                if (o2 > o1) return 1;

                return 0;
            }
        });

        System.out.println(liste);
    }
}
