package tugas;

public class WalkingZombie extends Zombie {

    WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    @Override
    public String getZombieInfo() {
        return "1";
    }

}
