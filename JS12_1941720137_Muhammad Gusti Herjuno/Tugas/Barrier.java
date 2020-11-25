package Tugas;

public class Barrier implements Destroyable{
    int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= 9;
    }

    public String getBarrierInfo(){
        return "Barrier Strength : " + strength;
    }
}
