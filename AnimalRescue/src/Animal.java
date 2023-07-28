public abstract class Animal {
    private int healtyLevel;
    private int feelingHungry;
    private int mood;
    private String favoriteFood;
    private String favoriteActivity;

    public Animal(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity) {
        this.healtyLevel = healtyLevel;
        this.feelingHungry = feelingHungry;
        this.mood = mood;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
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

    public abstract void Sleep();

    public abstract void Speak();

    public abstract void eat();

    public abstract void mood();

    public abstract void healty();
}