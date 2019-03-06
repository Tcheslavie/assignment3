package ac.za.cput;

public class Store {
    private int stock = 5;

    public Store (){};

    public void sellProduct()
    {
        stock--;
    }

    public int getStock()
    {
        return this.stock;
    }

}
