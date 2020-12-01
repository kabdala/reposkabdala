import java.util.ArrayList;
import java.lang.System;

/**
 * it is managing the list of products sold by store, stock delivered, stock can be sold, stock added, stock can be edited
 * 
 * @author Khayre Abdala
 * @version 1.2
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stockList;

    private Product product;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stockList = new ArrayList<>();
    }
    
    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stockList.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
        }
    }

    /**
     * method to alter a products name
     */
    public void changeProductName(int id, String name)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.setName(name);
        }
        else
        {
            printInvalidId(id);
        }
    }    

    /**
     * remove specific product from the stock list based on the ID
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            stockList.remove(product);
            System.out.println("Product ID: " + id + " removed from stock list");
        }
        else
        {
            printInvalidId(id);
        }
    }      

    /**
     * locates and returns product details from the given ID
     */
    public Product findProduct(int id)
    {
        for (Product product : stockList)
        {
            if (product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }

    /**
     * Checks if a new ID currently exsists, and returns appropriate value
     */
    public boolean chackDuplicateID(int id)
    {
        Product product = findProduct(id);
        if (product == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * locates products that have the given details in their name. (Samsung will list all Samsung products
     */
    public void printPartialName(String partialName)
    {
        printHeading();
        System.out.println("Products containing '" + partialName + "':");
        System.out.println("------------------------------------------");
        for (Product product : stockList)
        {
            if (product.getName().contains(partialName))
            {
                System.out.println(product.toString());
            }
        }
    }

    /**
     * Method to locate and provide given details of a product based on the ID
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Method to list all products whos quantity is below a given amount (10)
     */
    public void listLowStock(int level)
    {
        printLowStockHeading(level);
        for (Product product : stockList)
        {
            if (product.getQuantity() <= level)
            {
                System.out.println(product.toString());
            }
        }
    }

    /**
     * restock productes below a specified amount, by a specified amount
     */
    public void restockLowStock(int level, int amount)
    {
        for (Product product : stockList)
        {
            if (product.getQuantity() <= level)
            {
                product.increaseQuantity(amount);
            }
        }
    }

    /**
     * sell a custom amount of a product
     */
    public void sellProduct(int id, int quantitiy)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.sell(quantitiy);
        }
        else
        {
            printInvalidId(id);
        }
    }

    /**
     * Print details of all the products.
     */
    public void printAll()
    {
        printHeading();
        for (Product product : stockList)
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print heading for heading of list methods
     */
    public void printHeading()
    {
        System.out.println("***************************");
        System.out.println("Stock List of Khayre Abdala");
        System.out.println("***************************");
    }

    /**
     * Print heading for Low stock method
     */
    public void printLowStockHeading(int level)
    {
        System.out.println("***************************");
        System.out.println("Stock List of Khayre Abdala");
        System.out.println("Low Stock (under " + level + ")");
        System.out.println("****************************");
    }

    /**
     * Print output for when a search is invalid based on the ID
     */
    public void printInvalidId(int id)
    {
        System.out.println("********************");
        System.out.println("No item with ID: " + id + " exsists");
        System.out.println("********************");
    }

}
