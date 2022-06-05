package platform.codingnomads.co.ioc.lab.completed;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class CodingNomad {
    // automatically injected due to being private final
    private final JDK jdk;
    // automatically injected due to being private final
    private final IDE ide;
    // automatically injected due to being private final
    private final Framework framework;

    private Desk desk; // added from lab

    // notice the SoundSystem is not private final - we'll need setter or field injection on this
    private SoundSystem soundSystem;

    // setter injection of the SoundSystem
    @Autowired
    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    // field injection of the Operating System
    @Autowired
    OperatingSystem operatingSystem;

    @Autowired
    Computer computer;  // added from lab

    @Autowired
    public void setDesk(Desk desk) {
        this.desk = desk;
    } //added from lab

    public String createAwesomeSoftware() {
        return MessageFormat
                .format("This coding nomad is creating awesome software using, " +
                                "IDE: ({0}:{1}), JDK: ({2}:{3}), Framework: ({4}:{5}), " +
                                "OS: ({6}:{7}), Sound System: ({8}:{9})" +
                                " Computer: ({10}:{11})" +
                                " Desk: ({12}:{13})",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion(),
                        operatingSystem.getName(),
                        operatingSystem.getVersion(),
                        soundSystem.getBrand(),
                        soundSystem.getType(),
                        computer.getName(),  // added from lab
                        computer.getMemorySize(),
                        desk.getColor(),
                        desk.getHeight()

                );
    }
}
