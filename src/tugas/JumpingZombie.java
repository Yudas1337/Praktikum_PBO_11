package tugas;

public class JumpingZombie extends Zombie {

    JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        // 30 % heal
        if (super.level == 1)
            super.health += (super.health * 0.3);
        // 40% heal
        else if (super.level == 2)
            super.health += (super.health * 0.4);
        // 50% heal
        else if (super.level == 3)
            super.health += (super.health * 0.5);
    }

    @Override
    public void destroyed() {
        super.health -= (super.health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        String info = "";
        info += "Walking Zombie Data = \n";
        info += "Health = " + super.health + "\n";
        info += "Level = " + super.level + "\n";

        return info;
    }

}
