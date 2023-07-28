public class PomeranianDog extends Dog {
    private String groomingNeeds;
    private String furType;

    public PomeranianDog(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String owner, String gender, String color, float size, boolean vaccinationStatus, String groomingNeeds, String furType) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, owner, gender, color, size, vaccinationStatus);
        this.groomingNeeds = groomingNeeds;
        this.furType = furType;
    }

    public String getGroomingNeeds() {
        return groomingNeeds;
    }

    public void setGroomingNeeds(String groomingNeeds) {
        this.groomingNeeds = groomingNeeds;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }
}
