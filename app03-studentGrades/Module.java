
/**
 * This class is used for module to store module data
 *
 * Khayre Abdala
 * 31/10/2020
 */
public class Module
{
    // private variables are defined
    
    private int Marksofmodule;
    private String Nameofmodule;
    private boolean finish; 
    private String Codeofmodule;

    

    

    /**
     * Following code is showing the module class constructore
     */
    public Module(String Mname, String Mcode)
    {
        
        finish = false;
        Nameofmodule = Mname;
        Marksofmodule = 0;
        Codeofmodule = Mcode;
        
    }

    /**
     * this method is going to find out the validity of the marks
     * also will find out the marks status like fair or pass
     */
    public void changeMark(int addMarks)
    {
        if (addMarks < 101 && addMarks > 0)
        {
            Marksofmodule = addMarks;
            System.out.println("Marks for " + Nameofmodule + " are: " + Marksofmodule + "%");
            if (addMarks >= 40)
            {
                finish = true;
            }
            else
            {
                finish = false;
            }
        }
        else
        {
            System.out.println("kindly provide reliable marks");
        }
    }

    
    public int getMark()
    {
        return Marksofmodule;
    }

    
    public boolean getfinish()
    {
        return finish;
    }

    /**
     * getting the name of module through this method
     */
    public String getName()
    {
        return Nameofmodule;
    }
    public void print()
    {
        System.out.println("Following are module details:");
        System.out.println("Module Name is = " + Nameofmodule);
        System.out.println("Module ID code is = " + Codeofmodule);
        System.out.println("And Marks are = " + Marksofmodule + "%");
        
    }
    /**
     * the module is complete or incomplete is being chacked here 
     */
    public void printIfnotfinish()
    {
        if (finish == true)
        {
            System.out.println("Your Module: " + Nameofmodule + " has been finishd. And Marks are: " + Marksofmodule + "%");
        }
        else if (finish == false)
        {
            System.out.println("Your Module: " + Nameofmodule + " is not finish.Your Marks are:" + Marksofmodule + "%");
        }
    }
    
    
    
}
