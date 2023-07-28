public class PomeranianDog extends Dog {
    private static String name;
    private int age;
    private String groomingNeeds;
    private String furType;

    public PomeranianDog(int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String gender, String color, float size, boolean vaccinationStatus, String name, int age, String groomingNeeds, String furType) {
        super(healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, gender, color, size, vaccinationStatus);
        PomeranianDog.name = name;
        this.age = age;
        this.groomingNeeds = groomingNeeds;
        this.furType = furType;
    }

    public static String getName() {
        return name;
    }

    public static String setName(String name) {
        return name;
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

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    public void Sleep() {
        System.out.println("Dog is sleeps at night");
    }

    @Override
    public void Speak() {
        System.out.println("Wof! Wof!");
    }

    @Override
    public void mood() {
        if (getMood() >= 5)
            System.out.println("The animal is happy.");
        else
            System.out.println("The animal is sad.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats bones ");
    }

    @Override
    public void healty() {
        if (getMood() >= 5)
            System.out.println("The animal is healty.");
        else
            System.out.println("The animal is sick.");
    }
}
