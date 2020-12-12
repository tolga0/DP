package main.java.concretefactories;


import main.java.abstraction.BattleDroid;
import main.java.abstraction.DroidFactory;
import main.java.abstraction.JumpDroid;
import main.java.abstraction.PilotDroid;
import main.java.model.TitaniumBattleDroid;
import main.java.model.TitaniumJumpDroid;
import main.java.model.TitaniumPilotDroid;


public class TitaniumDroidFactory implements DroidFactory {
    public PilotDroid createPilotDroid() {
        return new TitaniumPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new TitaniumBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new TitaniumJumpDroid();
    }
}
