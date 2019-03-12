package Task7;

public class Drills extends ElectricalTools implements Returnable {
    private float maxDiametrOfDrill;
    protected Drills(String name, int count, String quantity, int powerConsuption, int price, float maxDiametrOfDrill) {
        super(name, count, quantity, powerConsuption, price);
        this.maxDiametrOfDrill = maxDiametrOfDrill;
    }

    @Override
    public String getRequariedDocuments() {
        return "Чек";
    }

    @Override
    public String getDaysForReturn() {
        return "14";
    }

    public float getMaxDiametrOfDrill() {
        return maxDiametrOfDrill;
    }

    public void setMaxDiametrOfDrill(float maxDiametrOfDrill) {
        this.maxDiametrOfDrill = maxDiametrOfDrill;
    }
}
