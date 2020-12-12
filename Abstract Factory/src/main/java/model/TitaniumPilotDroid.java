package main.java.model;


import main.java.abstraction.PilotDroid;

import java.util.logging.Logger;

public class TitaniumPilotDroid implements PilotDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void operate() {
        LOGGER.info("Titanium droid is operating the plane");
    }
}