public class Person extends Adopter {
    private String name;
    private int age;
    private boolean animalLover;

    public Person(int availableMoney, String name, int age, boolean animalLover) {
        super(availableMoney);
        this.name = name;
        this.age = age;
        this.animalLover = animalLover;
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

    public void goIntoTheShelder() {
        System.out.println(getName() + " enters the shelder with her father.");
    }

    public void adoptAnimal() {
        System.out.println(getName() + " adopts a puppy and names it ");
    }

}
