package ssm;

/**
 * Created by JacieWu on 2017/1/28.
 */
public class testExtendChild extends testExtend {

    public void Child() {
        System.out.println("这是子类的方法");
    }

    public static void main(String[] args) {

        testExtendChild testExtendChild = new testExtendChild();
        testExtendChild.Child();
        testExtendChild.Super();

        testExtend testExtend = new testExtend() {
            @Override
            public void Super() {
                super.Super();
                System.out.println("父类的i=" + super.i + "\n" + "父类的j=" + super.j);
            }
        };
        testExtend.Super();
    }
}
