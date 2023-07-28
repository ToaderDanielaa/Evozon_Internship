public class DomesticDuck extends Duck {
    private String name;
    private int age;
    private String groomingNeeds;
    private int eggFrequency;

    public DomesticDuck(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, boolean canFly, String name, int age, String groomingNeeds, int eggFrequency) {
        super(healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, canFly);
        this.name = name;
        this.age = age;
        this.groomingNeeds = groomingNeeds;
        this.eggFrequency = eggFrequency;
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

    @Override
    public void Sleep() {
        System.out.println("Duck is not sleeping");
    }

    @Override
    public void Speak() {
        System.out.println("Mac! Mac!");
    }

    @Override
    public void mood() {
        if (getMood() >= 5)
            System.out.println("The animal is happy.");
        else
            System.out.println("The animal is sad.");
    }

    @Override
    public void healty() {
        if (getHealtyLevel() >= 5)
            System.out.println("The %d is healty" + getName());
        else
            System.out.println("The %d is sick" + getName());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats cat food");
    }
}
