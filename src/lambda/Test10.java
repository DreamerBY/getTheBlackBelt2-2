package lambda;

public class Test10 {
    static void def1(I1 i) {
        System.out.println(i.abc1());
    }

    public static void main(String[] args) {

        def1(() ->   18 );
    }

}

interface I1 {
    int abc1(); // Единственный абстрактный метод
}