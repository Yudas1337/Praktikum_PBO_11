package tugas;

public class JumpingZombie extends Zombie {

    JumpingZombie(int health, int level) {
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
