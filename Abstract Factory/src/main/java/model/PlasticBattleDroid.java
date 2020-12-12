package main.java.model;


import main.java.abstraction.BattleDroid;

import java.util.logging.Logger;

public class PlasticBattleDroid implements BattleDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void shoot() {
        LOGGER.info("Plastic droid is shooting");
    }
}