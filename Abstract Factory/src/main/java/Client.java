package main.java;

import main.java.abstraction.BattleDroid;
import main.java.abstraction.DroidFactory;
import main.java.abstraction.JumpDroid;
import main.java.abstraction.PilotDroid;
import main.java.concretefactories.IronDroidFactory;
import main.java.concretefactories.PlasticDroidFactory;
import main.java.concretefactories.TitaniumDroidFactory;

public class Client {
    public static void main(String[] args) {
        runIronDroidFactory();
        runPlasticDroidFactory();
        runTitaniumDroidFactory();
    }

    public static void runIronDroidFactory(){
        DroidFactory factory = new IronDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }
    public static void runPlasticDroidFactory() {
        DroidFactory factory = new PlasticDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }

    public static void runTitaniumDroidFactory () {
        DroidFactory factory = new TitaniumDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }
}