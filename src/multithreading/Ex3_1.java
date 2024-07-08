package multithreading;

public class Ex3_1 implements Runnable{
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread (new Ex3_1());
        thread1.start();

        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }


    }


}

