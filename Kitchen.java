public class Kitchen extends RNB {

    private boolean bridge;
    private boolean autoTune;

    public Kitchen(int bpm, boolean runs, boolean bridge, boolean autoTune) {
        super(bpm, runs);
        this.bridge = bridge;
        this.autoTune = autoTune;
    }

    public boolean hasBridge() {
        return bridge;
    }

    public boolean usesAutoTune() {
        return autoTune;
    }
}

