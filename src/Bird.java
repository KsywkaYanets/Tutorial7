public class Bird extends Animal {
    public String color;
    public Bird(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    @Override
    public void makeSound() {
        System.out.println("Bird makes sound");
    }

    @Override
    public void move() {
        System.out.println("Bird move");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Bird natural habitat");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Bird color: " + getColor());
    }
    public String getColor() {
        return color;
    }
}