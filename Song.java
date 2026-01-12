import java.util.ArrayList;

public abstract class Song implements Playable {

    private int bpm;
    private ArrayList<String> features;

    public Song(int bpm) {
        this.bpm = bpm;
        this.features = new ArrayList<>();
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void addFeature(String feature) {
        features.add(feature);
    }

    public abstract String getGenre();
}

