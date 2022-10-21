package net.itscyno.ageofillagers.entity.client;

import net.itscyno.ageofillagers.AoiMain;
import net.itscyno.ageofillagers.entity.illagers.ExollogerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ExollogerRenderer extends GeoEntityRenderer<ExollogerEntity> {

    public ExollogerRenderer(EntityRendererFactory.Context ctx) { super(ctx, new ExollogerModel()); }

    @Override
    public Identifier getTexture(ExollogerEntity entity) {
        return new Identifier(AoiMain.MOD_ID, "textures/entity/exolloger/exolloger.png");
    }

}