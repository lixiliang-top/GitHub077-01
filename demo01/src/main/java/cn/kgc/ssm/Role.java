package cn.kgc.ssm;

/**
 * @author 李锡良
 * @create 2020-09-19 9:13
 */
public class Role {

    private String name;
    private String address;
    private String sex;
    private String dom;

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", dom='" + dom + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
}
