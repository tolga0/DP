package main.java.model;


import main.java.abstraction.JumpDroid;

import java.util.logging.Logger;

public class PlasticJumpDroid implements JumpDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void startJump() {
        LOGGER.info("Plastic droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Plastic droid doesn`t move ");
    }
}