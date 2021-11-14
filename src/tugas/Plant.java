package tugas;

public class Plant {

    public void doDestroy(Destroyable d) {
        if (d instanceof Zombie) {
            Zombie zombie = (Zombie) d;
            if (zombie instanceof WalkingZombie) {
                WalkingZombie walkingZombie = (WalkingZombie) zombie;
                walkingZombie.destroyed();
            } else if (zombie instanceof JumpingZombie) {
                JumpingZombie jumpingZombie = (JumpingZombie) zombie;
                jumpingZombie.destroyed();
            }
        } else if (d instanceof Barrier) {
            Barrier barrier = (Barrier) d;
            barrier.destroy();
        }
    }

}
