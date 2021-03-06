package love.marblegate.flowingagony.fx;

import love.marblegate.flowingagony.fx.particle.cursedantipathyparticle.CursedAntipathyParticleOption;
import love.marblegate.flowingagony.fx.particle.cursedantipathyparticle.CursedAntipathyParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "flowingagony");
    public static final RegistryObject<ParticleType<CursedAntipathyParticleOption>> CURSED_ANTIPATHY_PARTICLE = PARTICLE_TYPES.register("cursed_antipathy_particle", CursedAntipathyParticleType::new);
}
