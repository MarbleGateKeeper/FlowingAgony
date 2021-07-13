package love.marblegate.flowingagony.capibility.lastsweetdream;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LastSweetDreamCapabilityProvider implements ICapabilitySerializable<CompoundNBT> {
    private final ILastSweetDreamCapability imp = new LastSweetDreamCapabilityStardardImpl();
    private final LazyOptional<ILastSweetDreamCapability> impOptional = LazyOptional.of(() -> imp);

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if(cap == LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY){
            return impOptional.cast();
        }
        else return LazyOptional.empty();
    }

    @Override
    public CompoundNBT serializeNBT() {
        if (LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY == null) {
            return new CompoundNBT();
        } else {
            return (CompoundNBT) LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY.writeNBT(imp, null);
        }
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        if (LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY != null) {
            LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY.readNBT(imp, null, nbt);
        }
    }
}