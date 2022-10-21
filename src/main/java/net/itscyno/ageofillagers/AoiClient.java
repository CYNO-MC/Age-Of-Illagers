package net.itscyno.ageofillagers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.itscyno.ageofillagers.entity.AoiEntities;
import net.itscyno.ageofillagers.entity.client.ExollogerRenderer;

public class AoiClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(AoiEntities.EXOLLOGER, ExollogerRenderer:: new);
    }
}
