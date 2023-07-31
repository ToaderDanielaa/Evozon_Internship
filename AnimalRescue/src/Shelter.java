public class Shelter {
    private String name;

    public Shelter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Enters(Person person1, Person person2) {
        System.out.println(person1.getName() + "and " + person2.getName() + " entered in shelter named " + getName());
    }
}
