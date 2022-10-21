package net.itscyno.ageofillagers.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.itscyno.ageofillagers.AoiMain;
import net.itscyno.ageofillagers.entity.illagers.ExollogerEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AoiEntities {

    public static final EntityType<ExollogerEntity> EXOLLOGER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AoiMain.MOD_ID, "exolloger"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ExollogerEntity::new)
                    .dimensions(EntityDimensions.fixed(2.0f, 2.8f)).build());

}
