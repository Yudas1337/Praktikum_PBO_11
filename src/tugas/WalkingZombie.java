package tugas;

public class WalkingZombie extends Zombie {

    WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        // 10 % heal
        if (super.level == 1)
            super.health += (super.health * 0.1);
        // 20% heal
        else if (super.level == 2)
            super.health += (super.health * 0.3);
        // 30% heal
        else if (super.level == 3)
            super.health += (super.health * 0.4);
    }

    @Override
    public void destroyed() {
        super.health -= (super.health * 0.02);
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
