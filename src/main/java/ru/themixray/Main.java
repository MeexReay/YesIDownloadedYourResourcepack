package ru.themixray;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ClientModInitializer {
	public static Logger LOGGER = LoggerFactory.getLogger("yesidownloadedyourresourcepack");

	@Override
	public void onInitializeClient() {
		LOGGER.info("YesIDownloadedYourResourcepack Initialized");
	}
}