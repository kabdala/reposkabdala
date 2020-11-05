/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(210, "Honda city"));
        manager.addProduct(new Product(211,  "Toyota Sidan"));
	   manager.addProduct(new Product(212,  "Honda 2020"));
        manager.addProduct(new Product(213,  "Honda civix"));
        manager.addProduct(new Product(214,  "Totota Prado"));
        manager.addProduct(new Product(215,  "Land Cruser"));
        manager.addProduct(new Product(216,  " Honda Accord"));
        manager.addProduct(new Product(217,  " Toyota Fit"));
        manager.addProduct(new Product(218,  " Mercdeez benz"));
        manager.addProduct(new Product(119,  " Honda Atlas"));
        manager.addProduct(new Product(220,  " Nissan 2020"));
	  manager.addProduct(new Product(221,  " Mercdeez benz"));
        manager.addProduct(new Product(222,  " Honda 2020"));
        manager.addProduct(new Product(223,  " Nissan 2018"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */


    public void demoDeliverProduct()
    {
        // Show details of all of the products before delivery.
        
	manager.printProduct(210);
	manager.printProduct(211);
	manager.printProduct(212);
	manager.printProduct(213);
	manager.printProduct(214);
	manager.printProduct(215);
	manager.printProduct(216);
	manager.printProduct(217);
	manager.printProduct(218);
	manager.printProduct(219);
	manager.printProduct(220);
	manager.printProduct(221);
	manager.printProduct(222);
	manager.printProduct(223);
        
        // Take delivery of 5 items of one of the products.
        
	   manager.delivery(210, 9);
        manager.delivery(211, 12);
        manager.delivery(212, 6);
        manager.delivery(213, 8);
        manager.delivery(214, 11);
        manager.delivery(215, 7);
        manager.delivery(216, 2);
        manager.delivery(217, 9);
        manager.delivery(218, 12);
        manager.delivery(219, 8);
	   manager.delivery(220, 6);
        manager.delivery(221, 5);
        manager.delivery(222, 19);
        manager.delivery(223, 21);

        
        // Show the list of all products after delivery

        manager.printAllProducts();

    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            manager.printProduct(id);
            product.sellOne();
            manager.printProduct(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

public StockManager getManager()
    {
        return manager;
    }

}
