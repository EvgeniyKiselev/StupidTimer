package timer;

public class App {
    public static void main(String args[]){
        Timer timer = new Timer();
        System.out.println("Тупой таймер - поехали:");
        timer.timer();
        System.out.println("Таймер покрасивше - поехали:");
        timer.timerWithTimer();
    }
}
