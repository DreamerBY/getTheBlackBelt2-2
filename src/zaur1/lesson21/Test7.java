package zaur1.lesson21;

public class Test7 {


    int a=5;
    int t,h=5,k;
    int l;

    public void abc(int a, int b){
        System.out.println("privet");
    }

    public void abc(double a, double b){
        int c;
        c=10;
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1,2);
    }
}
