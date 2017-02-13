package ssm.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JacieWu on 2017/2/12.
 * Description:在指定时间执行任务
 */
public class TimerTest02 {

    Timer timer = null;

    public TimerTest02() {
        Date time1 = new Date();
        System.out.println("现在的时间：" + time1);
        Date time = getTime();
        System.out.println("指定时间time=" + time);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("到指定时间啦！...");
            }
        }, time);
    }

    public Date getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 25);
        calendar.set(Calendar.SECOND, 00);
        Date time = calendar.getTime();

        return time;
    }

    public static void main(String[] args) {
        new TimerTest02();
    }
}
