public class BritishCat extends Cat {
    private String name;
    private int age;
    private String groomingNeeds;
    private String owner;

    public BritishCat(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String color, float size, String temperament, String name, int age, String groomingNeeds, String owner) {
        super(healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, color, size, temperament);
        this.name = name;
        this.age = age;
        this.groomingNeeds = groomingNeeds;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void Sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void Speak() {
        System.out.println("Miau! Miau!");
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
        if (getMood() >= 5)
            System.out.println("The animal is healty.");
        else
            System.out.println("The animal is sick.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats special food cats ");
    }
}
