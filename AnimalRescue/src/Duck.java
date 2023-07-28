public abstract class Duck extends Animal {
    private String habitat;
    private int WingSpan;

    public Duck(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String habitat, int wingSpan) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
        this.habitat = habitat;
        WingSpan = wingSpan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(int wingSpan) {
        WingSpan = wingSpan;
    }

    public abstract void Sleep();

    public abstract void Speak();
}
