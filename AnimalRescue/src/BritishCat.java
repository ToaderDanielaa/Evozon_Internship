public class BritishCat extends Cat {
    private String groomingNeeds;
    private String owner;

    public BritishCat(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String color, float size, String temperament, String groomingNeeds, String owner) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, color, size, temperament);
        this.groomingNeeds = groomingNeeds;
        this.owner = owner;
    }

    public String getGroomingNeeds() {
        return groomingNeeds;
    }

    public void setGroomingNeeds(String groomingNeeds) {
        this.groomingNeeds = groomingNeeds;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
