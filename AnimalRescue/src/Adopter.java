import java.util.Scanner;

public class Adopter extends Person {

    private Animal pet;
    private int availableMoney;

    public Adopter(String name, int age, boolean animalLover, String hairColor, int availableMoney) {
        super(name, age, animalLover, hairColor);
        this.availableMoney = availableMoney;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void adopt(Animal pet) {
        Scanner scan = new Scanner(System.in);
        String animal;
        animal = scan.nextLine();
        System.out.print(getName() + " adopted a pet named: ");
        pet.setName(animal);
        System.out.println(pet.getName() + " has hunger level= " + pet.getFeelingHungry() + ", mood level=" + pet.getMood() + ", health level=" + pet.getHealtyLevel());
    }

    public void feed(Animal animal, String food) {
        System.out.println(getName() + " feed " + animal.getName() + " with " + food);
        animal.eat(food);
    }


}
