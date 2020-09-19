package cn.kgc.ssm;

/**
 * @author 李锡良
 * @create 2020-09-19 9:41
 */
public class dog {
    private String name;
    private String aas;

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", aas='" + aas + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAas() {
        return aas;
    }

    public void setAas(String aas) {
        this.aas = aas;
    }
}
