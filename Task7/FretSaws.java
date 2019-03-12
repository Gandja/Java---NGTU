package Task7;

public class FretSaws extends ElectricalTools {
    private int maxThicknessOfNag;

    public FretSaws(String name, int count, String quantity, int powerConsuption, int price, int maxThicknessOfNag) {
        super(name, count, quantity, powerConsuption, price);
        this.maxThicknessOfNag = maxThicknessOfNag;
    }
    public int getMaxThicknessOfNag() {
        return maxThicknessOfNag;
    }

    public void setMaxThicknessOfNag(int maxThicknessOfNag) {
        this.maxThicknessOfNag = maxThicknessOfNag;
    }

}
