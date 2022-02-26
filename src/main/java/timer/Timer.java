package timer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.Supplier;

public class Timer  {

    public void timerWithTimer() {
        Thread mThread = new Thread(()->{
            int count = 30;
            for (int i = 0; i <= count; i++) {
                System.out.print(timeWithWords.get());
                System.out.println(" --- до окончания отсчета осталось: "
                        + reverseCount.apply(count - i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        mThread.start();
    }

    Function<Integer, String> reverseCount = (i) -> {
        if(i < 10){
            return "0" + String.valueOf(i);
        }
        else return String.valueOf(i);
    };

    Supplier<String> timeWithWords = this::get;

    Function<String, String> addWord = (str) -> {
        String[] words = (str.split(":"));
        StringBuilder bld = new StringBuilder();
        return  bld.append("Часы: ").append(words[0]).append(" минуты: ")
                .append(words[1]).append(" секунды: ").append(words[2]).toString();
    };

    private String get() {
        return addWord.apply(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
