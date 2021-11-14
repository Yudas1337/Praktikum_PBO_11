package tugas;

public class Barrier implements Destroyable {
    private int strength;

    Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        if (this.strength == 0) {
            this.destroyed();
        } else {

        }
    }

    public String getBarrierInfo() {
        String info = "";
        info += "Barrier Strength = " + this.getStrength();
        return info;
    }

    @Override
    public void destroyed() {
        System.out.println("Barrier is destroyed");
    }

}
