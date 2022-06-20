package platform.codingnomads.co.corespring.examples.application_context.xml;

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

    public String printOutCat() {
        return MessageFormat
                .format("This coding nomad is creating awesome software using, " +
                                "IDE:({0}:{1}), JDK: ({2}:{3}), Framework:({4}:{5})",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion()
                );
}
