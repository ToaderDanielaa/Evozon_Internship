public abstract class Duck extends Animal {
    private boolean canFly;

    public Duck(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, boolean canFly) {
        super(healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public abstract void Sleep();

    public abstract void Speak();

    public abstract void mood();
}
