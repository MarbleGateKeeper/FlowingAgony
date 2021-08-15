package love.marblegate.flowingagony.capibility;

import love.marblegate.flowingagony.capibility.abnormaljoy.AbnormalJoyCapability;
import love.marblegate.flowingagony.capibility.abnormaljoy.IAbnormalJoyCapability;
import love.marblegate.flowingagony.capibility.cooldown.CoolDown;
import love.marblegate.flowingagony.capibility.cooldown.ICoolDown;
import love.marblegate.flowingagony.capibility.hatredbloodlinestatus.HatredBloodlineStatusCapability;
import love.marblegate.flowingagony.capibility.hatredbloodlinestatus.IHatredBloodlineStatusCapability;
import love.marblegate.flowingagony.capibility.lastsweetdream.ILastSweetDreamCapability;
import love.marblegate.flowingagony.capibility.lastsweetdream.LastSweetDreamCapability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber()
public class CapabilityTransfer {

    @SubscribeEvent
    public static void migrateCapDataWhenPlayerRespawn(PlayerEvent.Clone event) {
        if (!event.getPlayer().world.isRemote()) {
            LazyOptional<IHatredBloodlineStatusCapability> oldHatredBloodStatus = event.getOriginal().getCapability(HatredBloodlineStatusCapability.HATRED_BLOODLINE_STATUS_CAPABILITY);
            LazyOptional<IHatredBloodlineStatusCapability> newHatredBloodStatus = event.getPlayer().getCapability(HatredBloodlineStatusCapability.HATRED_BLOODLINE_STATUS_CAPABILITY);
            if (oldHatredBloodStatus.isPresent() && newHatredBloodStatus.isPresent()) {
                newHatredBloodStatus.ifPresent((newCap) -> oldHatredBloodStatus.ifPresent((oldCap) -> newCap.setActiveLevel(oldCap.getActiveLevel())));
            }
            LazyOptional<IAbnormalJoyCapability> oldAbnormalJoyPoint = event.getOriginal().getCapability(AbnormalJoyCapability.ABNORMALJOY_CAPABILITY);
            LazyOptional<IAbnormalJoyCapability> newAbnormalJoyPoint = event.getPlayer().getCapability(AbnormalJoyCapability.ABNORMALJOY_CAPABILITY);
            if (oldAbnormalJoyPoint.isPresent() && newAbnormalJoyPoint.isPresent()) {
                newAbnormalJoyPoint.ifPresent((newCap) -> oldAbnormalJoyPoint.ifPresent((oldCap) -> newCap.set(oldCap.get())));
            }
            LazyOptional<ICoolDown> oldCoolDown = event.getOriginal().getCapability(CoolDown.COOL_DOWN_CAPABILITY);
            LazyOptional<ICoolDown> newCoolDown = event.getPlayer().getCapability(CoolDown.COOL_DOWN_CAPABILITY);
            if (oldCoolDown.isPresent() && newCoolDown.isPresent()) {
                newCoolDown.ifPresent((newCap) -> oldCoolDown.ifPresent((oldCap) -> newCap.setMap(oldCap.getMap())));
            }
            LazyOptional<ILastSweetDreamCapability> oldLastSweetDreamItem = event.getOriginal().getCapability(LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY);
            LazyOptional<ILastSweetDreamCapability> newLastSweetDreamItem = event.getPlayer().getCapability(LastSweetDreamCapability.LAST_SWEET_DREAM_CAPABILITY);
            if (oldLastSweetDreamItem.isPresent() && newLastSweetDreamItem.isPresent()) {
                newLastSweetDreamItem.ifPresent((newCap) -> oldLastSweetDreamItem.ifPresent((oldCap) -> newCap.saveItemStack(oldCap.getItemStack())));
            }
        }
    }
}
