package main.java.concretefactories;

import main.java.abstraction.BattleDroid;
import main.java.abstraction.DroidFactory;
import main.java.abstraction.JumpDroid;
import main.java.abstraction.PilotDroid;
import main.java.model.PlasticBattleDroid;
import main.java.model.PlasticJumpDroid;
import main.java.model.PlasticPilotDroid;


public class PlasticDroidFactory implements DroidFactory {
    public PilotDroid createPilotDroid() {
        return new PlasticPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new PlasticBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new PlasticJumpDroid();
    }
}

