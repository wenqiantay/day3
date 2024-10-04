package day3.monster;

public class Godzilla extends Monster {
    
    
    @Override
    public void damage(int damage) {
        int hitPoints = getHitPoints();
        setHitPoints(hitPoints - damage);
    }
}
