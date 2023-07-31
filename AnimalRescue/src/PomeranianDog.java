public class PomeranianDog extends Dog {
    private int age;
    private String groomingNeeds;
    private String furType;

    public PomeranianDog(String name, int healtyLevel, int feelingHungry, int mood, String favoriteFood, String favoriteActivity, String gender, String color, float size, boolean vaccinationStatus, int age, String groomingNeeds, String furType) {
        super(name, healtyLevel, feelingHungry, mood, favoriteFood, favoriteActivity, gender, color, size, vaccinationStatus);
        this.age = age;
        this.groomingNeeds = groomingNeeds;
        this.furType = furType;
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
    public void eat(String favoritefood) {

        if (favoritefood.equals(getFavoriteFood())) {
            setFeelingHungry(10);
            System.out.println(getName() + "is eating favorite food. Its hunger level is now " + getFeelingHungry());
        } else {
            setFeelingHungry(getFeelingHungry() + 2);
            System.out.println(getName() + "doesn't like the food but still eats it. Its hunger level is now" + getFeelingHungry());
        }
    }

    @Override
    public void healty() {
        if (getMood() >= 5)
            System.out.println("The animal is healty.");
        else
            System.out.println("The animal is sick.");
    }

    @Override
    public void Activity(String activity) {
        if (activity.equals(getFavoriteActivity())) {
            System.out.println(getName() + " is doing its favorite activity. ");
            setMood(getMood() + 2);
            System.out.println("Its mood level it's now " + getMood());
        } else {
            System.out.println(getName() + " is not doing its favorite activity. ");
            setMood(getMood() - 1);
            System.out.println("Its mood level it's now " + getMood());
        }
    }
}
