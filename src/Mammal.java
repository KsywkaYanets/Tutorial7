public class Mammal extends Animal {
    public int weight;

    public Mammal(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes sound");
    }

    @Override
    public void move() {
        System.out.println("Mammal move");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Mammal natural habitat");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Mammal weight: " + getWeight());
    }
    public int getWeight() {
        return weight;
    }

}
