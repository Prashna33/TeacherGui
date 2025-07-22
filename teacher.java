
/**
 * Write a description of class teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class teacher
{
    private int teacherId;//instance variable
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    public teacher(int teacherId,String teachername,String address,String workingtype,String employmentstatus, int workinghours)
        {
            this.teacherId = teacherId;
            this.teacherName = teacherName;
            this.address = address;
            this.workingType = workingType;
            this.employmentStatus = employmentstatus;
            this.workingHours = 0;// assigned values with parameter
        }
        
        public int getTeacherId()// getter method
        {
            return this.teacherId;
        }
        public String getTeacherName()
        {
            return this.teacherName;
        }
         
        public String getAddress()
        {
            return this.address;
        }
        public String getWorkingType()
        {
            return this.workingType;
        }
        public String getemploymentstatus()
        {
            return this.employmentStatus;
        }
        public int getWorkingHours()
        {
            return this.workingHours;
        }
        public void setworkingHours(int workingHours)//setter method
        {
            this.workingHours = workingHours;
        }
        public void display()
        {
            System.out.println("teacherId"+this.teacherId);
            System.out.println("teacherName is"+this.teacherName);
            System.out.println("address is"+address);
            System.out.println("workingType is"+this.workingType);
            System.out.println("employmentstatus is"+this.employmentStatus);
            
            if(workingHours==0)
            {
                System.out.println("working Hours is not assigned");
            }
            else
            {
                System.out.println("workingHours is"+this.workingHours);
            }
        }
    }


