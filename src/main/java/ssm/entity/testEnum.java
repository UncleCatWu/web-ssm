package ssm.entity;

/**
 * Created by JacieWu on 2017/1/27.
 */
public enum testEnum {

    HAIKOU(1, "海口"), QIONGHAI(2, "琼海");

    public int key;

    public String value;

    testEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
