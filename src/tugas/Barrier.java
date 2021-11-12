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

    }

    public String getBarrierInfo() {
        return "1";
    }

    @Override
    public void destroyed() {
        // TODO Auto-generated method stub

    }

}
