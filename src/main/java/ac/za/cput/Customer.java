package ac.za.cput;

public class Customer {
    private String name;
    private int balance;

    public Customer(String name, int balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void reduceBalance(int amount)
    {
        this.balance = this.balance - amount;
    }
}
