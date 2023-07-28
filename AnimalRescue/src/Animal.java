public class Animal {
    private String name;
    private int age;
    private int healtyLevel;
    private int feelingHungry;
    private int mood;
    private String favoriteFood;
    private String favoriteActivity;

    public Animal(String name, int age, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity) {
        this.name = name;
        this.age = age;
        this.healtyLevel = healtyLevel;
        this.feelingHungry = feelingHungry;
        this.mood = mood;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealtyLevel() {
        return healtyLevel;
    }

    public void setHealtyLevel(int healtyLevel) {
        this.healtyLevel = healtyLevel;
    }

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
}
