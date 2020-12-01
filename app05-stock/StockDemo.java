/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * Allows testing of stock app without requireing exsesive user input
 * 
 * @author Khayre Abdala
 * @version 1.2
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private int amount;

    /**
     * a stock manager is created and sample products are added
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(210, "Honda City 2019"));
        manager.addProduct(new Product(211, "Honda Civic 2020"));
        manager.addProduct(new Product(212,  "Nissan 2018"));
        manager.addProduct(new Product(213,  "Toyota BeltaX 2016"));
        manager.addProduct(new Product(214, "Toyota BeltaX1 2018"));
        manager.addProduct(new Product(215,  "Toyota YarisW 2020"));
        manager.addProduct(new Product(216,  "Toyota YarisSpecial 2019"));
        manager.addProduct(new Product(217,  "Honda Acord 2017"));
        manager.addProduct(new Product(218,  "Kia classic 2019"));
        manager.addProduct(new Product(219,  "Nissan brv 2010"));
    }
}