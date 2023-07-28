public class DomesticDuck extends Duck {
    private String groomingNeeds;
    private int eggFrequency;

    public DomesticDuck(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String habitat, int wingSpan, String groomingNeeds, int eggFrequency) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, habitat, wingSpan);
        this.groomingNeeds = groomingNeeds;
        this.eggFrequency = eggFrequency;
    }

    public String getGroomingNeeds() {
        return groomingNeeds;
    }

    public void setGroomingNeeds(String groomingNeeds) {
        this.groomingNeeds = groomingNeeds;
    }

    public int getEggFrequency() {
        return eggFrequency;
    }

    public void setEggFrequency(int eggFrequency) {
        this.eggFrequency = eggFrequency;
    }
}
