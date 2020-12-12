package main.java.model;


import main.java.abstraction.PilotDroid;

import java.util.logging.Logger;

public class IronPilotDroid implements PilotDroid {
    private static Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlasticPilotDroid.class));

    public void operate() {
        LOGGER.info("Iron droid is operating the plane");
    }
}
