
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    // instance variables - replace the example below with your own
    private double amount;

    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        // initialise instance variables
        amount = 0;
    }
    
    public Coin(double amount)
    {
        this.amount=amount;
    }
    public void addAmount(double coins)
    {
        amount+=coins;
    }
    
    public void subtractAmount(double coins)
    {
        amount-=coins;
    }
    public void Print()
    {
        System.out.println("Coin : "+ amount);
    }
    public double getAmount()
    {
        return this.amount;
    }
    
    public void setAmount(double amount)
    {
        this.amount=amount;
    }
    
   }
