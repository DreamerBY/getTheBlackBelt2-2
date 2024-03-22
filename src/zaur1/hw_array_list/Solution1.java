package zaur1.hw_array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution1 {
    public static ArrayList abc(String... st) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : st) {
            if (!arrayList.contains(s)){
                arrayList.add(s);
            }

        }



        Collections.sort(arrayList);


        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList.toString());
        System.out.println(arrayList);
        return arrayList;

    }

    public static ArrayList sort(ArrayList al) {
        ArrayList<String> al1 = new ArrayList<>(al);


        OUTER:
        for (int i = 0; i < al1.size(); i++) {
            String s = al1.get(i);
            for (int j = 1; j < al1.size(); j++) {
                if (s == al1.get(j)) {
                    al1.remove(i);
                    i = 0;
                    continue OUTER;

                }
            }


        }


        return al1;
    }

    public static void main(String[] args) {
        abc("E", "A", "D", "A" ,"B", "C", "E","C","C", "C");
    }
}

