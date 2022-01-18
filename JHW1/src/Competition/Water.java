package Competition;

import Animals.Animal;

public class Water extends Obstacle{
    int distance;

    public  Water(int distance){
        this.distance = distance;
    }

@Override
    public void passObstacle(Animal player){
        player.swim(distance);
    }
}
