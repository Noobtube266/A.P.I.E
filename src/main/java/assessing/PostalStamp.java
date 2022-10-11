package assessing;

public class PostalStamp extends Product implements IPrint, LickAble{
    public PostalStamp(String name, double price, Size size) {
        super(name, price, size);
    }
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void print() {

    }
    @Override
    public boolean safeToLick() {
        return true;
    }
}
