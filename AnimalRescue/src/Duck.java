public abstract class Duck extends Animal {
    private boolean canFly;

    public Duck(String name, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, boolean canFly) {
        super(name, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity);
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

    public abstract void eat(String favoritefood);

    public abstract void Activity(String activity);
}
