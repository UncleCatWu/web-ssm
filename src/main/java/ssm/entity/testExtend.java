package ssm.entity;

/**
 * Created by JacieWu on 2017/1/28.
 */
public abstract class testExtend {

    public int i;
    public String j;

    public testExtend(){};

    public testExtend(int i, String j) {
        this.i = i;
        this.j = j;
    }

    public void Super(){
        System.out.println("这是父类的方法");
    }
}
