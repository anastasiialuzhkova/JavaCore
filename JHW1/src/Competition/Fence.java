package Competition;

import Animals.Animal;

public class Fence extends Obstacle {
    int height;

    public Fence(int height){
        this.height = height;
    }

    @Override
    public void passObstacle(Animal player){
        player.jump(height);
    }
}
