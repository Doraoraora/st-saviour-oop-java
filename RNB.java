public class RNB extends Song {

    private boolean runs;

    public RNB(int bpm, boolean runs) {
        super(bpm);
        this.runs = runs;
    }

    public boolean hasRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }

    public boolean tearJerking() {
        return true;
    }

    @Override
    public String getGenre() {
        return "RNB";
    }

    @Override
    public void play() {
        System.out.println("Playing an RNB song 🎶");
    }
}
