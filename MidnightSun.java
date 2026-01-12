public class MidnightSun extends Pop {

    private int highNotes;
    private int noteDuration;

    public MidnightSun(int bpm, boolean riffs, int highNotes, int noteDuration) {
        super(bpm, riffs);
        this.highNotes = highNotes;
        this.noteDuration = noteDuration;
    }

    public int getHighNotes() {
        return highNotes;
    }

    public int getNoteDuration() {
        return noteDuration;
    }
}

