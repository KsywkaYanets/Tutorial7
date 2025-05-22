public abstract class Animal {
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void makeSound();
    public abstract void move();
    public abstract void naturalHabitat();
    public void displayInformation() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}