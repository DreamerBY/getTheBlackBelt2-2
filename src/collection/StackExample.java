package collection;

public class StackExample {
    static void abc1(){
        System.out.println("abc1 START");
        System.out.println("abc1 ENDS");
    } static void abc2(){
        System.out.println("abc2 START");
        abc1();
        System.out.println("abc2 ENDS");
    }
    static void abc3(){
        System.out.println("abc3 START");
        abc2();
        System.out.println("abc3 ENDS");
    }

    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        abc3();
        System.out.println("MAIN ENDS");
    }
}
