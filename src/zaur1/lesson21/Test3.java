package zaur1.lesson21;

public class Test3 {
    Test3(){
        System.out.println("eto construktor  ");
    }
    void Test3() {

        System.out.println("Eto method");
    }
    //int Test3 = 5;
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}