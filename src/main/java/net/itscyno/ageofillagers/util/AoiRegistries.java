package net.itscyno.ageofillagers.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.itscyno.ageofillagers.entity.AoiEntities;
import net.itscyno.ageofillagers.entity.illagers.ExollogerEntity;

public class AoiRegistries {


        public static void registerAttributes() {
            attributeRegistry();
        }

        private static void attributeRegistry() {
            FabricDefaultAttributeRegistry.register(AoiEntities.EXOLLOGER, ExollogerEntity.setAttributes());
        }

}
