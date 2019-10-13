package chapter14.test02;

public class Pet {
    private String name;
    private String masterName;

    public Pet() {
    }

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void introduce() {
        System.out.println("我的名字是" + name + "!");
        System.out.println("我的主人是" + masterName + "!");
    }
}
