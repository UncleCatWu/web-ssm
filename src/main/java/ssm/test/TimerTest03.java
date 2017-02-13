package ssm.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JacieWu on 2017/2/12.
 * Description:在延迟指定时间后以指定的间隔时间循环执行定时任务
 */
public class TimerTest03 {

    Timer timer = null;

    public TimerTest03() {
        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println("每隔两秒钟执行一次，现在的时间是：" + date);
            }
        }, 1000, 2000);
    }

    public static void main(String[] args) {
        new TimerTest03();
    }
}
