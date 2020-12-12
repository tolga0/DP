package main.java.model;



import main.java.abstraction.JumpDroid;

import java.util.logging.Logger;

public class TitaniumJumpDroid implements JumpDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void startJump() {
        LOGGER.info("Titanium droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Titanium droid doesn`t move ");
    }
}