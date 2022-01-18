package Animals;

import Competition.Course;

public class Team {
        String teamName;
        Animal[] players;


        public Team(String teamName, Animal[] players) {
                this.teamName = teamName;
                this.players = players;
        }

        public void getTeamName() {
                System.out.println(teamName);
        }

        public void getPlayers() {
                for(int i = 0; i < players.length; i++){
                        System.out.println(players[i].getName());
                }
        }

        public void showResults() {

        }

        public void startCompetition(Course course){
                for(int i = 0; i < players.length; i++){
                        course.runCourse(players[i]);
                }
        }

        public void winners(){
for(int i = 0; i < players.length; i++){
        if(players[i].getIsWinner()){
                System.out.println(players[i].getName());
        }
}
        }
}




       // public void showResult(){
                //  System.out.println(type +" " + name + " " + "" );
                // }

