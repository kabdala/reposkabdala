/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Khayre Abdala
 * @version 3.0
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
	  
    }
public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
    }

    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */


    private void demoDeliverProducts()
    {
        // Show details of all of the products before delivery.
     manager.printAllProducts();
      
        // Take delivery of 5 items of one of the products.
        
	   manager.deliverProduct(210, 9);
        manager.deliverProduct(211, 12);
        manager.deliverProduct(212, 6);
        manager.deliverProduct(213, 8);
        manager.deliverProduct(214, 11);
        manager.deliverProduct(215, 7);
        manager.deliverProduct(216, 2);
        manager.deliverProduct(217, 9);
        manager.deliverProduct(218, 12);
        manager.deliverProduct(219, 8);
	           
        // Show the list of all products after delivery

        manager.printAllProducts();

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
