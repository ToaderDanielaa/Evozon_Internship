public class Cat extends Animal {
    private String color;
    private float size;
    private String temperament;

    public Cat(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String color, float size, String temperament) {
        super(name, age, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
        this.color = color;
        this.size = size;
        this.temperament = temperament;
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

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }
    
}
