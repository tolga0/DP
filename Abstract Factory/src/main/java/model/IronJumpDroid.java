package main.java.model;


import main.java.abstraction.JumpDroid;

import java.util.logging.Logger;

public class IronJumpDroid implements JumpDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void startJump() {
        LOGGER.info("Iron droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Iron droid doesn`t move ");
    }
}