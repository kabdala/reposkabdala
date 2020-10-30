import java.util.Date;

/**
 * This class would represent Ticket Object
 */
public class Ticket
{
        
    private String ticketDestination;
    
    private double cost;
    
    private Date ticketPurDate;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String td, double cost)
    {
        this.ticketDestination = td;
        this.cost = cost;
        ticketPurDate = new Date();
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public String getDestination()
    {
        return ticketDestination;
    }
    public void PrintTicketInfo()
    {
        System.out.println("Destination:"+ticketDestination +" ,Cost :"+cost+" pence" );
    }
    public void print()
    {
        System.out.println();
        System.out.println("Ticket for the :" + ticketDestination);
        System.out.println("Ticket Cost :  " + cost + " pence ");
        System.out.print("Date Purchased: "+ticketPurDate);
        System.out.println();
    }

}