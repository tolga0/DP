package main.java.model;


import main.java.abstraction.BattleDroid;

import java.util.logging.Logger;

public class TitaniumBattleDroid implements BattleDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void shoot() {
        LOGGER.info("Titanium droid is shooting");
    }
}