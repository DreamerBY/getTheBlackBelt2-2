package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Studen2 st1 = new Studen2("Ivan",3);
        Studen2 st2 = new Studen2("Nikolay",2);
        Studen2 st3 = new Studen2("Elena",1);
        Studen2 st4 = new Studen2("Petr",4);
        Studen2 st5 = new Studen2("Mariya",3);
        LinkedList<Studen2> studen2LinkedList = new LinkedList<>();
        studen2LinkedList.add(st1);
        studen2LinkedList.add(st2);
        studen2LinkedList.add(st3);
        studen2LinkedList.add(st4);
        studen2LinkedList.add(st5);
        System.out.println("LinkedList = "+studen2LinkedList);
        System.out.println(studen2LinkedList.get(2));

        Studen2 st6 = new Studen2("Zaur",3);
        Studen2 st7 = new Studen2("Igor",4);
        studen2LinkedList.add(st6);
        System.out.println("LinkedList = "+studen2LinkedList);
        studen2LinkedList.add(1,st7);
        System.out.println("LinkedList = "+studen2LinkedList);
        studen2LinkedList.remove(3);
        System.out.println("LinkedList = "+studen2LinkedList);

    }
}
class Studen2 {
    String name;
    int course;

    public Studen2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Studen2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}