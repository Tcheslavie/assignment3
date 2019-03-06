package ac.za.cput;

/**
 * Hello world!
 *
 */
public class Purchaser
{
    private static Store myStore;
    private static Customer myCust;
    private static Product myProd;

    public static void main( String[] args )
    {
        myStore = new Store();
        myCust = new Customer("John", 5);
        myProd = new Product("Tomato", 2);

        makeSale();
        makeSale();
        makeSale();
    }

    public static void makeSale()
    {
        if(myStore.getStock()>0)
        {
            if(myCust.getBalance()>=myProd.getPrice())
            {
                myCust.reduceBalance(myProd.getPrice());
                myStore.sellProduct();
            }  else System.out.println("Not enough money");
        } else System.out.println("Not enough stock");
    }

}
