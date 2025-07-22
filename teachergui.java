
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;


public class teachergui extends JFrame implements ActionListener{
    private ArrayList<teacher> teacher = new ArrayList<>();
    private JTextField teacheridField , teacherNameField , addressField , employmentStatusField, workingHoursField, workingTypeField,
            DepartmentField , yearsofExperienceField, gradedScoreField, salaryField , academicQualificationField,
            specializationField, performanceIndexField;
            
    public teachergui(){
        setTitle("Educators");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0 , 4 , 10,10));
        getContentPane().setBackground(new Color(140 , 200 ,250));
        
        //Lables and Text Fields
        JLabel teacherIdLabel = new JLabel("Teacher id:");
        teacheridField = new JTextField();
        add(teacherIdLabel);
        add(teacheridField);
        
        JLabel teacherNameLabel = new JLabel("Teacher name:");
        teacherNameField = new JTextField();
        add(teacherNameLabel);
        add(teacherNameField);
        
        JLabel addressLabel = new JLabel("address:");
        addressField = new JTextField();
        add(addressLabel);
        add(addressField);
        
        JLabel employmentStatusLabel = new JLabel("employment status:");
        employmentStatusField = new JTextField();
        add(employmentStatusLabel);
        add(employmentStatusField);
        
        JLabel workingTypeLabel = new JLabel("Working type:");
        workingTypeField = new JTextField();
        add(workingTypeLabel);
        add(workingTypeField);
        
        JLabel workingHoursLabel = new JLabel("working Hours:");
        workingHoursField = new JTextField();
        add(workingHoursLabel);
        add(workingHoursField);
        
        JLabel DepartmentLabel = new JLabel("Department:");
        DepartmentField = new JTextField();
        add(DepartmentLabel);
        add(DepartmentField);
        
        JLabel yearsofExperienceLabel = new JLabel("YearsofExperience:");
        yearsofExperienceField = new JTextField();
        add(yearsofExperienceLabel);
        add(yearsofExperienceField);
        
        JLabel gradedScoreLabel = new JLabel("gradedScore:");
        gradedScoreField = new JTextField();
        add(gradedScoreLabel);
        add(gradedScoreField);
        
        
        JLabel specializationLabel = new JLabel("specialization:");
        specializationField = new JTextField();
        add(specializationLabel);
        add(specializationField);
        
        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField();
        add(salaryLabel);
        add(salaryField);
        
        JLabel performanceIndexLabel = new JLabel("PerformanceIndex:");
        performanceIndexField = new JTextField();
        add(performanceIndexLabel);
        add(performanceIndexField);
        
        JLabel academicQualificationLabel = new JLabel("Academic Qualification:");
        academicQualificationField = new JTextField();
        add(academicQualificationLabel);
        add(academicQualificationField);
        
        //Buttons 
        JButton addLecturerButton = new JButton("Add lecturer");
        add(addLecturerButton);
        addLecturerButton.addActionListener(this);
        
        JButton addTutorButton = new JButton("Add Tutor");
        add(addTutorButton);
        addTutorButton.addActionListener(this);
        
        JButton gradeAssigmentsButton = new JButton("grade assigments");
        add(gradeAssigmentsButton);
        gradeAssigmentsButton.addActionListener(this);
        
        JButton setsalaryButton = new JButton("set salary of Tutor");
        add(setsalaryButton);
        setsalaryButton.addActionListener(this);
        
        JButton removetutorButton = new JButton("Remove Tutor");
        add(removetutorButton);
        removetutorButton.addActionListener(this);
        
        JButton displayButton = new JButton("Display");
        add(displayButton);
        displayButton.addActionListener(this);
        
        JButton clearButton = new JButton("Clear");
        add(clearButton);
        clearButton.addActionListener(this);
        
        setVisible(true);
        
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command)
        {
            case "Add lecturer":
                try
                {
                    addlecturer();
                    JOptionPane.showMessageDialog(this,"Please input accurate numerical value for YearsofExperience and GradedScore.");

                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(this,"lecturer has been successful.");
                    
                }
                break;
            case "Add Tutor":
                try
                {
                    addTutor();
                    JOptionPane.showMessageDialog(this,"Please enter valid numbers for Salary, PerformanceIndex , working Hours");
                    
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(this,"Tutor has been successful");
        
                }
                try
                {
                    double workingHours = Double.parseDouble(workingHoursField.getText());
                }
                catch (NumberFormatException n)
                {
                    //Display the error message
                    JOptionPane.showMessageDialog(this,"Invalid value of working Hours. Please enter a valid number ");
                    
                }
                break;
            case "Grade Assignment":
                try
                {
                    gradeAssigments();
                    JOptionPane.showMessageDialog(this,"please enter a valye for gradedScore");   
                }
                catch (NumberFormatException ex)
                {
                    
                    JOptionPane.showMessageDialog(this,"Grade successful");
                    
                }
                 break;
            case "set salary of Tutor":
                try
                {
                    setTutorsalary();
                    JOptionPane.showMessageDialog(this,"salary assigned successfully");   
                }
                catch (NumberFormatException ex)
                {
                    
                    JOptionPane.showMessageDialog(this,"Please input valid number for salary and PerformanceIndex");
                }
                 break;
            case "Remove tutor":
                try
                {
                    removetutor();
  
                }
                catch (NumberFormatException ex)
                {
                    
                    JOptionPane.showMessageDialog(this,"Tutor removed sucessfully");
                    
                }
                 break;
            case "Display":
                try
                {
                    display();
      
                }
                catch (NumberFormatException ex)
                {
                    
                    JOptionPane.showMessageDialog(this,"Error display ");
                    
                }
                 break;
            case "Clear":
                try
                {
                    clearFields();
                      
                }
                catch (NumberFormatException ex)
                {
                    
                    JOptionPane.showMessageDialog(this,"Error clear");
                    
                }
                break;
                    
            }
    }
    private void addlecturer()
    {
        int teacherId = Integer.parseInt(teacheridField.getText());
        String teacherName = teacherNameField.getText();
        String address = addressField.getText();
        String workingType = workingTypeField.getText();
        String employmentStatus = employmentStatusField.getText();
        int yearsofExperience = Integer.parseInt(yearsofExperienceField.getText());
        String Department= DepartmentField.getText();
        int gradedScore = Integer.parseInt(gradedScoreField.getText());
        lecturer lecturer = new  lecturer (teacherId  ,  teacherName ,address , workingType,Department ,
         yearsofExperience, employmentStatus,gradedScore);
        lecturer.setgradedScore(gradedScore);
        teacher.add(lecturer);
        JOptionPane.showMessageDialog(this,"Lecturer assigned successful");
    }
    private void addTutor()
    {
        int  teacherId = Integer.parseInt(teacheridField.getText());
        String teacherName = teacherNameField.getText();
        String address = addressField.getText();
        String workingType = workingTypeField.getText();
        String employmentStatus = employmentStatusField.getText();
        double salary = Double.parseDouble(salaryField.getText());
        String specialization= specializationField.getText();
        int  workingHours = Integer.parseInt(workingHoursField.getText());
        String academicQualification= academicQualificationField.getText();
        int performanceIndex = Integer.parseInt(performanceIndexField.getText());
        Tutor tutor = new Tutor ( teacherId   ,  teacherName ,  address , workingType, employmentStatus, workingHours,
         salary, specialization ,academicQualification, performanceIndex);
        JOptionPane.showMessageDialog(this,"Tutor assigned successful");
    }
     private void gradeAssigments()
    {
        String teacherId = teacheridField.getText();
        int gradedScore = Integer.parseInt(gradedScoreField.getText());
        String Department = DepartmentField.getText();
        int yearsofExperience = Integer.parseInt(yearsofExperienceField.getText());
        
        for (teacher teacher : teacher)
        {
            if (String.valueOf(teacher.getTeacherId()).equals(teacherId) && teacher instanceof lecturer)
            {
                
                JOptionPane.showMessageDialog(this,"Assignments graded successfully");
                return;
            }
        }
        JOptionPane.showMessageDialog(this,"Invalid teacherid or teacher is not a lecturer");
    }
    private void setTutorsalary()
    {
        String  teacherId = teacheridField.getText();
        double salary = Double.parseDouble(salaryField.getText());
        int performanceIndex = Integer.parseInt(performanceIndexField.getText());
        
        for (teacher teacher : teacher)
        {
           
            {
                ((Tutor) teacher).setsalary(salary);
                ((Tutor) teacher).setperformanceIndex(performanceIndex);
                JOptionPane.showMessageDialog(this,"Salary successfully");
                return;
            }
            
        }
        JOptionPane.showMessageDialog(this,"Invalid teacherid or teacher is not a Tutor");
        
    }
    private void removetutor()
    {
        String teacherId = teacheridField.getText();
       
        for (teacher teacher : teacher)
        {
            
            {
                
                JOptionPane.showMessageDialog(this,"Tutor removed successfully");
                return;
            }
            
        }
        JOptionPane.showMessageDialog(this,"Invalid teacherid or teacher is not a Tutor");
    }
    private void display()
    {
        StringBuilder displayText = new StringBuilder();
        for (teacher teacher : teacher)
        {
            displayText.append(teacher.toString()).append("\n"); 
           
        }
                JOptionPane.showMessageDialog(this,displayText.toString());
        }
        
            
    private void clearFields()
    {
        Component[] components = getContentPane().getComponents();
        for (Component component : components)
        {
            if (component instanceof JTextField)
            {
                ((JTextField) component).setText("");
            }
        }
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            teachergui gui = new teachergui();
            gui.setLocationRelativeTo(null);
        });
    }
}

    
    
    
    
    
    
