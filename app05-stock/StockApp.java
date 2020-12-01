
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Khayre Abdala
 * @version 1.2
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;
    private StockManager manager;
    private StockDemo demo;    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }

    /**
     * runs program
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * displays menu and handals initial user requests
     */
    private void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printMenuChoices();
            
            String choice = input.getInput();
            choice = choice.toUpperCase();
            if(choice.equals("QUIT"))
            {
                finished = true;
            }
            else
            {
                menuChoice(choice);
            }
        }
    }
    
    /** 
     * takes user input and runs appropriate information
     */
    private void menuChoice(String choice)
    {
        if (choice.equals("ADD"))
        {
           addProduct();
        }
        else if (choice.equals("REMOVE"))
        {
           removeProduct();
        }
        else if (choice.equals("PRINTALL"))
        {
            manager.printAll();
        }
        else if (choice.equals("SEARCH"))
        {
           searchList();
        }
        else if (choice.equals("LOWSTOCK"))
        {
            listLowStock();
        }
        else if (choice.equals("RESTOCK"))
        {
            restockLowStock();
        }
        else if (choice.equals("DELIVERY"))
        {
            takeDelivery();
        }
        else if (choice.equals("SELL"))
        {
            sellProduct();
        }
        else if (choice.equals("DEMO"))
        {
            Demo();
        }
    }
    
    /** 
     * method to add products from the menu. Converts inputs appropriatly and adds to stock list.
     */
    private void addProduct()
    {
        System.out.println("\n Please enter Product Details:");
        //Entry for name of product. chacks if blank
        System.out.println("\n Product Name:");
        String name = input.getInput();
        if(name.isBlank())
        {
            System.out.println("Name cannot be blank");
            return;
        }
        //Entry for ID of product.
        System.out.println("\n Product ID:");
        String value = input.getInput();
        // converts ID to int, and checks for duplicate ID
        int id = Integer.parseInt(value);
        if (manager.chackDuplicateID(id))
        {
            System.out.println("ID already exsists");
        }
        else
        {
            Product product = new Product (id, name);
            manager.addProduct(product);
        }
    }
    
    /** 
     * Method to remove products. gets product id from user and removes specified product
     */
    private void removeProduct()
    {
        int id = getPoductID();
        manager.removeProduct(id);
    }
    
    /** 
     * Method to list low stock under a specified level. also gets level from user
     */
    private void listLowStock()
    {
        int level = getMinStockLevel();
        manager.listLowStock(level);
    }
    
    /** 
     * Method to restock products under a specified level, allows user to determine the reorder amount
     */
    private void restockLowStock()
    {
        int level = getMinStockLevel();
        int amount = getProductQuantity();
        manager.restockLowStock(level, amount);
    }
    
    /** 
     * allows user to search the product list for a product.
     * allows incomplete search information, will display all possible resaults
     */
    private void searchList()
    {
        System.out.println("\n Please enter Product Details:");
        System.out.println("\n Product Name:");
        String details = input.getInput();
        manager.printPartialName(details);
    }
    
    /** 
     * increases stock amount by a specified value
     */
    private void takeDelivery()
    {
        int id = getPoductID();
        int amount = getProductQuantity();
        
        manager.delivery(id, amount);
    }
    
    /** 
     * reduces stock amount by a specified value, based on sales
     */
    private void sellProduct()
    {
        int id = getPoductID();
        int amount = getProductQuantity();
        
        if (amount < 0) 
        {
            System.out.println("\n Please enter a posative value");
        }
        else
        {
            manager.sellProduct(id, amount);
        }
    }
    
    /** 
     * takes users input and converts to an ID.
     * Then Returns ID for a getProduct method
     */
    public int getPoductID()
    {
        System.out.println("\n Please enter product ID:");
        String ID = input.getInput();
        int id = Integer.parseInt(ID);
        return id;
    }
    
    /** 
     * gets user input and converts to integer for a stock level method
     */
    public int getMinStockLevel()
    {
        System.out.println("\n Please enter minimum stock level:");
        String sLevel = input.getInput();
        int level = Integer.parseInt(sLevel);
        return level;
    }
    
    /** 
     * gets user input to find a quantity for use in several methods
     */
    public int getProductQuantity()
    {
        System.out.println("\n Please enter Quantity:");
        String Quantity = input.getInput();
        int quantity = Integer.parseInt(Quantity);
        return quantity;
    }
    
    /**
     * Menu print out for choosing the required action
     */
    private void printMenuChoices()
    {
        System.out.println("***********************************************************************");
        System.out.println("    Add:         For adding a new product");
        System.out.println("    Remove:      For removing old product");
        System.out.println("    LowStock:    For listing down the low stock");
        System.out.println("    Search:      For Searching out a producuct");
        System.out.println("    Restock:     For chaning the stock level");
        System.out.println("    Delivery:    For chaning or increasing the prodcut stock level");
        System.out.println("    Sell:        For selling out the product from stock");
        System.out.println("    PrintAll:    For printing all products");
        System.out.println("    Quit:        For stoping or to quite the programe");
        System.out.println();        
    }
    
    /**
     * Name of the author and the title of the application is printed here.
     */
    private void printHeading()
    {
        System.out.println("**************************************************************");
        System.out.println(" App05 for Management of Stock *==* developed by Khayre Abdala ");
        System.out.println("**************************************************************");
    }
    
    /** 
     *this method is allowing to load products to the list of stock
      */
    private void Demo()
    {
        demo = new StockDemo(manager);
    }
}
