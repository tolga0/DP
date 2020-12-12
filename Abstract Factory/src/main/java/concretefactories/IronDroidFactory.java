package main.java.concretefactories;


import main.java.abstraction.BattleDroid;
import main.java.abstraction.DroidFactory;
import main.java.abstraction.JumpDroid;
import main.java.abstraction.PilotDroid;
import main.java.model.IronBattleDroid;
import main.java.model.IronJumpDroid;
import main.java.model.IronPilotDroid;


public class IronDroidFactory implements DroidFactory {
    public PilotDroid createPilotDroid() {
        return new IronPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new IronBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new IronJumpDroid();
    }
}