import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Khayre Abdala) 
 * @version 3.0
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {

	Product product = findProduct (id);
        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Congratulations product has been delivered : " + 	product);
        }
        else
        {
            System.out.println("The entered ID of the Product" + id + " Can't be located or matched!!!");
        }
    }

    
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }

    
	/**
     * going to sell product with ID,print details of hte product
     */

    public void sellProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            printDetails(id);
            product.sellOne();
            printDetails(id);
        }
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
                
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
}
