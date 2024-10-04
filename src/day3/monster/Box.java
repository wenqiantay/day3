package day3.monster;

public class Box implements Damagable{
    
    private int integrity = 3;

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public void damage(int d) {
        integrity = this.integrity - d;
    }

    public int getDamage(){
        return this.integrity;
    }

}
