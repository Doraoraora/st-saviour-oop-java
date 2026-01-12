public class Pop extends Song {

    private boolean riffs;

    public Pop(int bpm, boolean riffs) {
        super(bpm); // REQUIRED use of super
        this.riffs = riffs;
    }

    public boolean hasRiffs() {
        return riffs;
    }

    public void setRiffs(boolean riffs) {
        this.riffs = riffs;
    }

    public String danceBreak() {
        return "Big choreo dance break!";
    }

    @Override
    public String getGenre() {
        return "Pop";
    }

    @Override
    public void play() {
        System.out.println("Playing a pop song 🎤");
    }
}
