package love.marblegate.flowingagony.effect.special;

import net.minecraft.entity.ai.attributes.AttributeModifier;

public class PotentialBurstImplicitEffect extends BeneficialBlankImplicitEffect {
    public PotentialBurstImplicitEffect() {
        super();
    }

    @Override
    public double getAttributeModifierAmount(int amplifier, AttributeModifier modifier) {
        return modifier.getAmount() * (1 + amplifier);
    }
}