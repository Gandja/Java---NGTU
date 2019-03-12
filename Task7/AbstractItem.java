package Task7;

public abstract class AbstractItem implements Item {
    private String name;
    private int count;
    private String quantity;
    private int price;


    protected AbstractItem(String name, int count, String quantity, int price) {
        this.count = count;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
            this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }
}
