public abstract class Dog extends Animal {

    private String gender;
    private String color;
    private float size;
    private boolean vaccinationStatus;

    public Dog(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String gender, String color, float size, boolean vaccinationStatus) {
        super(healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public boolean isVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(boolean vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public abstract void Sleep();

    public abstract void Speak();

    public abstract void mood();
}
