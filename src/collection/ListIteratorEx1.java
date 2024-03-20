package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverceiterator = list.listIterator(list.size());
        boolean isPolidrome = true;
        while (iterator.hasNext() && reverceiterator.hasPrevious()) {
            if (iterator.next() !=reverceiterator.previous()){
                isPolidrome = false;
                break;
            }


        }
        if(isPolidrome){
            System.out.println("Polidrom");
        }else System.out.println("NOT Polidrom");

    }
}
