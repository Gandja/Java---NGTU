package Task7;

public abstract class Computers extends AbstractItem {
    private int ram;
    private int hdd;
    private int cpu;
    protected Computers(String name,int count, String quantity,int price, int ram, int hdd, int cpu ) {
        super(name, count, quantity, price);
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
}
