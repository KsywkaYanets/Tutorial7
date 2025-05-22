public class ZooManagement {
    public static void main(String[] args) {
        Lion lion = new Lion("Alex", 5, 120);
        lion.makeSound();
        lion.displayInformation();
        lion.naturalHabitat();
        Eagle eagle = new Eagle("Pin", 1, "brown");
        eagle.move();
        Snake snake = new Snake("Lee", 2, 3);
        snake.move();
        snake.displayInformation();
    }
}
