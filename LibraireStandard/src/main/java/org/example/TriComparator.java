package org.example;

import java.io.IOException;
import java.util.*;

public class TriComparator {
        public static void main(String[] args) {
            List<Integer> listNumber = new ArrayList<>();



            listNumber.add(1234);
            listNumber.add(-71);
            listNumber.add(17);
            listNumber.add(747);
            listNumber.add(1977);



            System.out.println(triComplexe(listNumber));
        }



        public static List<Integer> triComplexe(List<Integer> listNumber){
            Collections.sort(listNumber, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    String a = o1.toString();
                    String b = o1.toString();



                    long count = a.codePoints().filter(ch -> ch == '7').count();
                    long count2 = b.codePoints().filter(ch -> ch == '7').count();



                    if(count > count2){
                        return -1;
                    }else if(count == count2){
                        if(o1 < o2){
                            return 1;
                        }
                        return 0;
                    }
                    return 0;
                }
            });
            return listNumber;
        }
    }
