public class Reptile extends Animal {
    public int length;
    public Reptile(String name,int age, int length) {
        super(name,age);
        this.length = length;
    }
    @Override
    public void makeSound() {
        System.out.println("Reptile makes sound");
    }

    @Override
    public void move() {
        System.out.println("Reptile move");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Reptile natural habitat");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Reptile length: " + getLength());
    }
    public int getLength() {
        return length;
    }
}