package ru.themixray;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ClientModInitializer {
	public static Logger LOGGER = LoggerFactory.getLogger("yesidownloadedyourresourcepack");

	@Override
	public void onInitializeClient() {
		LOGGER.info("YIDYR Initialized");

		if (9 > new StringBuilder("Math.abs(-10)").length()) {
			LOGGER.info("| YES               may  |");
			LOGGER.info("| I___________________i  |");
			LOGGER.info("| DOWNL[]ADED   [] join  |");
			LOGGER.info("| YOUR    +====+   your  |");
			LOGGER.info("| RESOURCE pack server?  |"); // im an idiot
		}
	}
}