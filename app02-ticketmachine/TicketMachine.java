

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Kheyre Abdala
 */
import java.util.*;
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private Coin balance;
    // The total amount of money collected by this machine.
    private Coin total;
    private ArrayList<Ticket> tickets;
    private ArrayList<Ticket> purchasedTickets;
    private int price;
    
    
    public TicketMachine(int coin)
    {
        balance=new Coin(coin);
        total=new Coin(0);
        setAvaibleTickets();
    }
    public void buyTicket(int price,int index)
    {
        Ticket t=tickets.get(index);
        if(t.getCost()<=price)
        {
            total.addAmount(price);
            balance.subtractAmount(price);
            if(purchasedTickets==null)
            {
                purchasedTickets=new ArrayList<Ticket>();
            }
            purchasedTickets.add(t);
            t.print();
        }
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public double getBalance()
    {
        return balance.getAmount();
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(double amount)
    {
        if(amount > 0) 
        {
            balance.addAmount(amount);
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    /*
     * First call this method to set available tickets
     */
    private void setAvaibleTickets()
    {
        if(tickets==null)
        {
            tickets=new ArrayList<Ticket>();
            Ticket t1=new Ticket("Aylesbury",2.2);
            Ticket t2=new Ticket("Amersham ",3.0);
            Ticket t3=new Ticket("High Wycombe",3.3);
            tickets.add(t1);
            tickets.add(t2);
            tickets.add(t3);
            
        }
    }
    private void PrintPurchasedTickets()
    {
        int i=1;
        
        for(Ticket ticket : purchasedTickets) 
        {
            System.out.println(i+" - "+ticket.getDestination()+", "+ ticket.getCost()+" pence");
        }
    }
    private void PrintAvailableTickets()
    {
        int i=1;
        
        for(Ticket ticket : tickets) 
        {
            System.out.println(i+" - "+ticket.getDestination()+", "+ ticket.getCost()+" pence");
        }
    }
    
    

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public double refundBalance()
    {
        double amountToRefund;
        amountToRefund = balance.getAmount();
        balance = new Coin(0);
        return amountToRefund;
    }
}
