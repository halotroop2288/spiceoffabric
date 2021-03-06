package de.siphalor.spiceoffabric.client;

import de.siphalor.spiceoffabric.SpiceOfFabric;
import de.siphalor.spiceoffabric.config.Config;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screen.Screen;

import java.util.function.Function;

public class ModMenuInitializer implements ModMenuApi {
	@Override
	public String getModId() {
        return SpiceOfFabric.MOD_ID;
	}

	@Override
	public Function<Screen, ? extends Screen> getConfigScreenFactory() {
		return (parentScreen) -> Config.tweedClothBridge.buildScreen();
	}
}
