import java.util.*;

/**
 * This class is gonig to carry on student data and information
 * Edited: Khayre Abdala
 * Version 31/10/2020
 */
public class Student
{
    // attributes for the student name and student ID is defined in the form of attributes
    private String nameofstudent;

    private String idofstudent;
    
    private int credits;
    
    private Course course;
       

    /**
     * here, the student name, student ID and credits details are created
     */
    public Student(String completeName, String sID)
    {
        nameofstudent = completeName;
        idofstudent = sID;
        credits = 0;
    }
    
    /**
     * a particular course name is allocated to the new course added
     */
    public void addCourse(Course coursename)
    {
        this.course = coursename;
    }
    
    /**
     * This will return the full or complete student name
     */
    public String getcompleteName()
    {
        return nameofstudent;
    }

    /**
     * here we can gave a new name to the student or we can change the student name
     */
    public void changeName(String alterName)
    {
        nameofstudent = alterName;
    }

    /**
     * To get or to return the ID of the student (sID)
     */
    public String getsID()
    {
        return idofstudent;
    }

    /**
     * here, the extra points or extra marks can given to credits
     */
    public void addCredits(int extraMarks)
    {
        credits += extraMarks;
    }

    /**
     * to get total number of credets, we use following block of code
     */
    public int getCredits()
    {
        return credits;
    }

    
    public String getLoginName()
    {
        return nameofstudent.substring(0,4) + idofstudent.substring(0,3);
    }

    /**
     * Following code will print out the student name, student ID and total credits
     */
    public void print()
    {
        System.out.println(nameofstudent + ", sID: " + idofstudent + ", credits: " + credits);
        course.print();
    }
}

