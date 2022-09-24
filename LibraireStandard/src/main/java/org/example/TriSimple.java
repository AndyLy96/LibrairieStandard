package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TriSimple {
    public static void main( String[] args ) throws IOException {
        List<Double> liste = new ArrayList<>();
        liste.add(0.1);
        liste.add(12.34);
        liste.add(-0.1234);
        liste.add(3.1416);
        //0.1, 12.34, -0.1234, 3.1416
        tri(liste);
    }

    public static void tri(List<Double> liste) {

        Collections.sort(liste);
        System.out.println(liste);



    }
}
