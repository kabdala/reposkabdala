
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String CodeNumber;
    private String Title;
    /**
     * Constructor for objects of class Course
     */
    public Course()
    {
        // initialise instance variables
        CodeNumber="";
        Title="";
    }

    public Course(String codeNumber,String title)
    {
        CodeNumber=codeNumber;
        Title=title;
    }
    
    public String getTitle()
    {
        return Title;
    }
    
    public String getCodeNumber(){
        return CodeNumber;
    }
    
}
