package Task7;

public abstract class ElectricalTools extends AbstractItem {
    private int powerConsuption;
    protected ElectricalTools(String name, int count, String quantity, int powerConsuption,int price) {
        super(name,count,quantity, price);
        this.powerConsuption = powerConsuption;
    }

    public int getPowerConsuption() {
        return powerConsuption;
    }

    public void setPowerConsuption(int powerConsuption) {
        this.powerConsuption = powerConsuption;
    }
}
