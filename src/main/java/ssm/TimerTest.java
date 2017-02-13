package ssm;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JacieWu on 2017/2/12.
 * Description:定时执行任务
 */
public class TimerTest {

    Timer timer = null;

    public TimerTest(int time) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up!!!");
            }
        }, time * 1000);
    }

    public static void main(String[] args) {
        System.out.println("timer begin....");
        new TimerTest(3);
    }
}
