
/**
 * Write a description of class tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends teacher 
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    public Tutor(int teacherId, String teacherName, String address, String workingType,String employmentStatus, int workingHours,double salary,String specialization, String academicQualifications, int performanceIndex)//
    // constructor 
        {
        super(teacherId,teacherName,address,workingType, employmentStatus,workingHours);
        setworkingHours(workingHours); // calling setter method
        this.salary= salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified= false ;// instance variable to parameters

    }
    public double getsalary()//getter method
    {
        return this.salary=salary;
    }
    public String getspecialization()
    {
        return this.specialization = specialization;
    }
    public String getacademicQualifications()
    {
        return this.academicQualifications = academicQualifications;
    }
    public int getperformanceIndex()
    {
        return this.performanceIndex = performanceIndex;
    }
    public boolean  getiscertified()
    {
        return this.isCertified;
    }
        
        public void setsalary(double salary)//setter method
        {
            this.salary = salary;
        }
        public void setperformanceIndex(int performanceIndex)
        {
            this.performanceIndex = performanceIndex;
        }
        
        public void updatesalary(double newsalary, int newperformanceIndex)
        {
            double appraisalPercent;
            double increasedsalary;
            
             if(newperformanceIndex>=5 && getWorkingHours()>20){
                 
                 if(newperformanceIndex <=7)
                 {
                     appraisalPercent =5;
                     increasedsalary = newsalary+(appraisalPercent/100)*newsalary;
                     this.salary=increasedsalary;
                 }
                 else if(newperformanceIndex>=8 && newperformanceIndex <=9)
                 {
                     appraisalPercent=10;
                     increasedsalary = newsalary+(appraisalPercent/100)*newsalary;
                     this.salary=increasedsalary;
                 }
                 else
                 {
                     
                     appraisalPercent=20;
                     increasedsalary = newsalary+(appraisalPercent/100)*newsalary;
                     this.salary=increasedsalary;
                 }
                 this.isCertified=true;
             }
             else
             {
                 System.out.println("Salary is not assigned");
             }
        }
        public void removetutor()
        {
            if(isCertified==false)
            {
                this.salary=0;
                this.specialization="";
                this.academicQualifications="";
                this.performanceIndex=0;
                isCertified=false;
            }
            else
            {
                System.out.println("Tutor can't be removed.Tutor is certified");
            }
        }
        public void display()
        {
            if(isCertified)
            {
                super.display();
                System.out.println("salary is"+this.salary);
                System.out.println("specialization is"+this.specialization);
                System.out.println("academicQualifications is"+this.academicQualifications);
                System.out.println("performanceIndex is"+this.performanceIndex);
            }
            else{
                super.display();
            }
        }
}


