
/**
 * Write a description of class lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lecturer extends teacher 
{
   private String Department;//instance variable 
    private int yearsofExperience;
    private int gradedScore;
    private boolean hasgraded;
    
    public lecturer(int teacherId, String teacherName, String address, String workingType , String employmentstatus , int workingHours,String Department, int yearsofExperience)//constructor
    {
        super(teacherId,teacherName,address,workingType, employmentstatus,workingHours);
        setworkingHours(workingHours);// calling setter method
        this.Department = Department;
        this.yearsofExperience = yearsofExperience;
        this.gradedScore = 0;
        this.hasgraded = false ;// instance variable to parameters
    }
    public String getDepartment()//getter method
    {
        return this.Department;
        
    }
    public int getyearsofExperience()
    {
        return this. yearsofExperience;
    }
    public int gradedScore()
    {
    return this.gradedScore;
    }
    public boolean gethasgraded()
    {
        return this.hasgraded;
    }
    
    public void setgradedScore(int gradedScore)// setter method
    {
        this.gradedScore = gradedScore;
    }
    public void gradeAssignment(int gradeToScore , String Department , int yearsofExperience)
    {
        setgradedScore(gradeToScore);
        if( this.hasgraded==false && yearsofExperience >=5 && this.Department == Department){
        if(this.gradedScore >=70)
        {
          System.out.println("Grade A");
        } else if(this.gradedScore >=60)
        {
          System.out.println("Grade B");
        }else if(this.gradedScore >=50)
        {
          System.out.println("Grade C");
        } else if(this.gradedScore >=40)
        {
            System.out.println("Grade D");
        }else
        {
            System.out.println("Grade E");
        }
        hasgraded = true;
    }else 
    {
        System.out.println("lecturer has not graded");
    }        
    } 
    public void display()
    {
        super.display();
        System.out.println("Department is"+this.Department);
        System.out.println("yearsofExperience is"+this.yearsofExperience);
        
        if(hasgraded)
        {
            System.out.println("GradedScore is "+this.gradedScore);
        }else
        {
            System.out.println("Grades is not assigned");
        }
    }
}


