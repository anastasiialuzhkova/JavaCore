import Animals.*;
import Competition.*;

public class Main {
    public static void main(String[] args) {
        Animal[] players = {new Cat("Tim"), new Rabbit("Sam"), new Dog("Pep"), new Horse("Penny")};
        Obstacle[] passObstacles = {new Forest(40), new Fence(2), new Water(3)};
        Team lucky = new Team("Lucky", players);
        Course course = new Course(passObstacles);
        lucky.startCompetition(course);
        lucky.winners();
    }
}