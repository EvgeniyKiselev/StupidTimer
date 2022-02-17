package timer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyThread extends Thread implements Runnable{
    @Override
    public void run() {
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
