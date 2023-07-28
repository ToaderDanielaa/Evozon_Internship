public abstract class Dog extends Animal {
    private String owner;
    private String gender;
    private String color;
    private float size;
    private boolean vaccinationStatus;

    public Dog(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String owner, String gender, String color, float size, boolean vaccinationStatus) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
        this.owner = owner;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
}
