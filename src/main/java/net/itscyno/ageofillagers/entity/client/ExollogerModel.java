package net.itscyno.ageofillagers.entity.client;

import net.itscyno.ageofillagers.AoiMain;
import net.itscyno.ageofillagers.entity.illagers.ExollogerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ExollogerModel extends AnimatedTickingGeoModel<ExollogerEntity> {

    @Override
    public Identifier getModelResource(ExollogerEntity object) {
        return new Identifier(AoiMain.MOD_ID, "geo/exolloger.geo.json");
    }

    @Override
    public Identifier getTextureResource(ExollogerEntity object) {
        return new Identifier(AoiMain.MOD_ID, "textures/entity/exolloger/exolloger.png");
    }

    @Override
    public Identifier getAnimationResource(ExollogerEntity animatable) {
        return new Identifier(AoiMain.MOD_ID, "animations/exolloger.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })

    public void setLivingAnimations(ExollogerEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
