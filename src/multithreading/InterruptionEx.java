package multithreading;

public class InterruptionEx {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("main starts");
    InterruptedThread thread = new InterruptedThread();
    thread.start();
    Thread.sleep(200);
    thread.interrupt();

    thread.join();
    System.out.println("main ends");
  }

}


class InterruptedThread extends Thread {
  double sqtSum = 0;

  public void run() {
    for (int i = 1; i <= 1000000000; i++) {
      if(isInterrupted()){
        System.out.println("Potok xotayt prevratj");
        System.out.println("Mi ubedilis, chto sosotyanie" +
            " vsex obyektov normalnoe i reshili zavershit rabotu potoka");
        System.out.println(sqtSum);
        return;
      }
      sqtSum += Math.sqrt(i);

      try {
        sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Potok xotyat prevratj vo vremya sna. "+
            "Davajte zavershim ego raboty");
        System.out.println(sqtSum);
        return;
      }
    }
    System.out.println(sqtSum);
  }
}
