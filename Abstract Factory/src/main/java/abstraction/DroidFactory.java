package main.java.abstraction;

public interface DroidFactory {
    PilotDroid createPilotDroid();
    BattleDroid createBattleDroid();
    JumpDroid createJumpDroid();
}