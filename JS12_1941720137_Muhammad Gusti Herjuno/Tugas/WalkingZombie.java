package Tugas;

public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (level) {
            case 1:
                health += 10/100;
                break;
            case 2:
                health += 30/100;
                break;
            case 3:
                health += 40/100;
                break;
        }
    }
    public void destroyed(){
        health -= health*20/100;
    }

    public String getZombieInfo(){
        return "Walking Zombie Data : \n" + super.getZombieInfo();
    }

}
