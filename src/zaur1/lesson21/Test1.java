package zaur1.lesson21;

public class Test1 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println((a < 4 ? 7 : "privet "));
        int b = 5;
        int c = 5;
        int e = (b < 6 ? b++ : c++);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }


}
