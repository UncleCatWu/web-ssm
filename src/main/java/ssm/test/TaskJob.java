package ssm.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by JacieWu on 2017/2/12.
 */
@Component("taskJob")
public class TaskJob {

    @Scheduled(cron = "0/5 * * * * ?")
    public void job1(){
        System.out.println("任务进行中...");
    }
}
