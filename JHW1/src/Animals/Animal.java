package Animals;

public abstract class Animal implements Desk {
    String type;
    String name;
    int age;
    int maxRun;
    int maxSwim;
    int maxJump;
    boolean isWinner;


    public Animal(String type, String name, int age, int maxRun, int maxSwim, int maxJump) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        this.isWinner = true;

    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(type + " " + name + " " + "прошла дистанцию.");
        } else {
            System.out.println(type + " " + name + " " + "не прошла дистанцию.");
            this.isWinner = false;
        }

    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(type + " " + name + " " + "проплыла дистанцию.");
        } else {
            System.out.println(type + " " + name + " " + "не проплыла дистанцию.");
            this.isWinner = false;

        }
    }

    public void jump(int height) {
        if (height <= maxSwim) {
            System.out.println(type + " " + name + " " + "преодолела препятствие.");
        } else {
            System.out.println(type + " " + name + " " + "не преодолела препятствие.");
            this.isWinner = false;

        }
    }

    public boolean getIsWinner() {
        return isWinner;
    }
}

    //
//    Animals.Dog dog1 = new Animals.Dog("Бублик");
//    Animals.Dog dog2 = new Animals.Dog("Кубик");
//    Animals.Cat cat1 = new Animals.Cat("Барсик");
//    Animals.Cat cat2 = new Animals.Cat("Персик");
//



//public class AnimalsPlayers {
//    public static void main(String[] args) {
//        Animals.Animal animal = new Animals.Animal();
//    }
//}
//
