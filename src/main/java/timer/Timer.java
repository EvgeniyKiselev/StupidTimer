package timer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        MyThread mThread = new MyThread();
        mThread.start();
        for (int i = 0; i < 31; i++) {
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
