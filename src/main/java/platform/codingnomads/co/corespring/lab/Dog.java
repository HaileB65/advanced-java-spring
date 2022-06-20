package platform.codingnomads.co.corespring.lab;

public class Dog {
    String name;
    String bread;

    public Dog(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
