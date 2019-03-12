package Task7;

public class Laptops extends Computers implements Returnable {
    double diagonalOfScreen;

    public Laptops(String name, int count, String quantity, int price, int ram, int hdd, int cpu, double diagonalOfScreen,
                   int timeOfWorkWithOutCharge) {
        super(name, count, quantity, price, ram, hdd, cpu);
        this.diagonalOfScreen = diagonalOfScreen;
        this.timeOfWorkWithOutCharge = timeOfWorkWithOutCharge;
    }

    int timeOfWorkWithOutCharge;

    @Override
    public String getRequariedDocuments() {
        return "14";
    }

    @Override
    public String getDaysForReturn() {
        return "Чек и паспорт";
    }
}
