
/**
 * This class wil handle all workings of course data
 *
 * @author Khayre Abdala
 * @version 31/10/2020
 */
public class Course
{
    // for tile of the courese and for ID of the course
    private String titleofcourse;
    private String IDofcourse;
    
    // four modules are initiated here
    private Module modulefirst;
    private Module modulesecond;
    private Module modulethird;
    private Module moduleforth;
    
    // and integer is defined for the number of the module
    
    private int numberofModule;
    
    

    // for each module the marks will be saved in these variables
    private int modulefirstMarks;
    private int modulesecondMarks;
    private int modulethirdMarks;
    private int moduleforthMarks;
    
    //the total obtained marks and total grades will be saved in these variables
    private int obtainedMarks;
    private String obtainedGrades;

    /**
     * The ID of the course and title of the course are defined 
     */
    public Course(String titleofcourse, String ID)
    {
        this.titleofcourse = titleofcourse;
        IDofcourse = ID;
        numberofModule = 0;
    }

    /**
     * in this method the four modules are going to be added here
     */
    public void addmodule(String Nameofmodule, String Codeofmodule)
    {
        numberofModule ++;
        if (numberofModule == 1)
        {
            modulefirst = new Module(Nameofmodule, Codeofmodule);
        }
        else if (numberofModule == 2)
        {
            modulesecond = new Module(Nameofmodule, Codeofmodule);
        }
        else if (numberofModule == 3)
        {
            modulethird = new Module(Nameofmodule, Codeofmodule);
        }
        else if (numberofModule == 4)
        {
            moduleforth = new Module(Nameofmodule, Codeofmodule);
        }
        else if (numberofModule == 5)
        {
            System.out.println ("This Course is at maximum modules");
        }
    }

    /**
     * from this method the marks can be changed
     */
    public void changeMark(String Nameofmodule, int mark)
    {
        if (Nameofmodule == modulefirst.getName())
        {
            modulefirst.changeMark(mark);
            modulefirstMarks = mark;
        }
        else if (Nameofmodule == modulesecond.getName())
        {
            modulesecond.changeMark(mark);
            modulesecondMarks = mark;
        }
        else if (Nameofmodule == modulethird.getName())
        {
            modulethird.changeMark(mark);
            modulethirdMarks = mark;
        }
        else if (Nameofmodule == moduleforth.getName())
        {
            moduleforth.changeMark(mark);
            moduleforthMarks = mark;
        }
        setGrade();
    }

    /**
     * this method will find out the obtained marks and then accordingl the grades will be allocated
     */
    public void setGrade()
    {
        obtainedMarks = ((modulefirstMarks + modulesecondMarks + modulethirdMarks + moduleforthMarks) / 4);
        if (obtainedMarks <= 40)
        {
            obtainedGrades = "F";
        }
        else if ((obtainedMarks <= 49) && (obtainedMarks >= 41))
        {
            obtainedGrades = "D";
        }
        else if ((obtainedMarks <= 59) && (obtainedMarks >= 50))
        {
            obtainedGrades = "C";
        }
        else if ((obtainedMarks <= 69) && (obtainedMarks >= 60))
        {
            obtainedGrades = "B";
        }
        else if ((obtainedMarks <= 100) && (obtainedMarks >= 70))
        {
            obtainedGrades = "A";
        }
    }
    
    /**
     * here the modules information can be printed
     */
    public void printModualDetails(String Nameofmodule)
    {
        if (Nameofmodule == modulefirst.getName())
        {
            
            modulefirst.print();
        }
        else if (Nameofmodule == modulesecond.getName())
        {
                        modulesecond.print();
        }
        else if (Nameofmodule == modulethird.getName())
        {
                        modulethird.print();
        }
        else if (Nameofmodule == moduleforth.getName())
        {
                        moduleforth.print();
        }
    }
    
    /**
     * from here, the dtails are going to be printed for course and for module
     */
    public void print()
    {
        
        if (numberofModule <= 3)
        {
            System.out.println("A Course needs 4 moduals");
            System.out.println("Current number of modules: " + numberofModule);
        }
      
        else if (modulefirst.getfinish() == false || modulesecond.getfinish() == false || modulethird.getfinish() == false || modulethird.getfinish() == false)
        {
            System.out.println("Some modules are incomplete:");
            modulefirst.printIfnotfinish();
            modulesecond.printIfnotfinish();
            modulethird.printIfnotfinish();
            moduleforth.printIfnotfinish();
            
        }
        
        else
        { 
            System.out.println ("Course: " + titleofcourse + ", IDofcourse: " + IDofcourse);
            modulefirst.print();
            modulesecond.print();
            modulethird.print();
            moduleforth.print();
            System.out.println ("Your result in the form of grades is: " + obtainedGrades);
        }
    }
}