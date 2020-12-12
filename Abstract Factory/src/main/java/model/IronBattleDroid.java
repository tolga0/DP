package main.java.model;


import main.java.abstraction.BattleDroid;

import java.util.logging.Logger;

    public class IronBattleDroid implements BattleDroid {
    private static Logger LOGGER = Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void shoot() {
        LOGGER.info("Iron droid is shooting");
    }
}