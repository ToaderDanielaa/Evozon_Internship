public abstract class Person {
    private String name;
    private int age;
    private boolean animalLover;
    private String hairColor;

    public Person(String name, int age, boolean animalLover, String hairColor) {
        this.name = name;
        this.age = age;
        this.animalLover = animalLover;
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
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

    public boolean isAnimalLover() {
        return animalLover;
    }

    public void setAnimalLover(boolean animalLover) {
        this.animalLover = animalLover;
    }
}
