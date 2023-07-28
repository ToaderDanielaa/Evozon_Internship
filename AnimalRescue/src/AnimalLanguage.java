public class AnimalLanguage {
    private String sounds;
    private String gestures;

    public AnimalLanguage(String sounds, String gestures) {
        this.sounds = sounds;
        this.gestures = gestures;
    }

    public String getSounds() {
        return sounds;
    }

    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    public String getGestures() {
        return gestures;
    }

    public void setGestures(String gestures) {
        this.gestures = gestures;
    }
    
}
