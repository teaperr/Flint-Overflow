package net.teaper.flintoverflow;

import net.fabricmc.api.ModInitializer;
import net.teaper.flintoverflow.block.OverflowBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintOverflow implements ModInitializer {
    public static final String MOD_ID = "flintoverflow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        OverflowBlocks.registerModBlocks();

    }
}
