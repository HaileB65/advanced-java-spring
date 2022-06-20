package platform.codingnomads.co.corespring.lab;

import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class Cat {
    String Bread;
    String Color;

    public Cat(String bread, String color) {
        this.Bread = bread;
        this.Color = color;
    }

    public String getBread() {
        return Bread;
    }

    public void setBread(String bread) {
        this.Bread = bread;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

}
