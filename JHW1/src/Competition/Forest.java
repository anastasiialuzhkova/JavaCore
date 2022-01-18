package Competition;


import Animals.Animal;

public class Forest extends Obstacle {
    int distance;

    public Forest(int distance) {
        this.distance = distance;
    }

    @Override
    public void passObstacle(Animal player){
        player.run(distance);
    }
}
