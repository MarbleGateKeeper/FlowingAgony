package love.marblegate.flowingagony.capibility.hatredbloodlinestatus;

public class HatredBloodlineStatusCapabilityStardardImpl implements IHatredBloodlineStatusCapability {
    private int hatredBloodlineLevel;

    public HatredBloodlineStatusCapabilityStardardImpl() {
        hatredBloodlineLevel = 0;
    }

    @Override
    public int getActiveLevel() {
        return hatredBloodlineLevel;
    }

    @Override
    public void setActiveLevel(int level) {
        hatredBloodlineLevel = level;
    }

}
