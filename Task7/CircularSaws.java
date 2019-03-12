package Task7;

public class CircularSaws extends ElectricalTools implements Returnable {
    private int radiusOfCircle;
    protected CircularSaws(String name, int count, String quantity, int powerConsuption, int radiusOfCircle, int price) {
        super(name, count, quantity,price, powerConsuption);
        this.radiusOfCircle = radiusOfCircle;
    }

    public int getRadiusOfCircle() {
        return radiusOfCircle;
    }

    public void setRadiusOfCircle(int radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public String getRequariedDocuments() {
        return "Чек и паспорт";
    }

    @Override
    public String getDaysForReturn() {
        return "21";
    }
}
