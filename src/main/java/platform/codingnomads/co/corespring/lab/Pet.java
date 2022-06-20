package platform.codingnomads.co.corespring.lab;

import java.text.MessageFormat;

public class Pet {
    private final Cat cat;

    public Pet(Cat cat) {
        this.cat = cat;
    }

    public String printOutPets() {
        return MessageFormat
                .format("This Pet class is creating a new pets, " +
                                "Cat:({0}:{1})",
                        cat.getBread(),
                        cat.getColor()
                );
    }
}
