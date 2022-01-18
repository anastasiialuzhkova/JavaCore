package Competition;

import Animals.Animal;
import Animals.Team;

public class Course {

        Obstacle[] Obstacles;


        public Course(Obstacle[] Obstacles) {
            this.Obstacles = Obstacles;
        }

        //public void passCompetition(){
//for(int i = 0; i< passObstacles.length;i++){
    //    for(int j = 0; j < players.get.Players.length; i++);
//}
        //}

        public void runCourse(Animal player){
                for(int i = 0; i < Obstacles.length; i++){
                        Obstacles[i].passObstacle(player);
                }
        }
}
