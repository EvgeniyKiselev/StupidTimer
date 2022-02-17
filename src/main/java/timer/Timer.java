package timer;

public class Timer {
    public void timer() {
        for (int i = 0; i < 31; i++) {
            if (i < 10) {
                System.out.println("00:0" + i);
            } else System.out.println("00:" + i);
            try {
                if (i != 30) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void timerWithTimer() {
        Thread mThread = new MyThread();
        mThread.start();
    }
}
