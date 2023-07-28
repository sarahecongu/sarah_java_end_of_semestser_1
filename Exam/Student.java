import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Double> grade = new ArrayList<Double>();
    private String course;

    // constructor\
    public Student (String name,String course){
        this.course = course;
        this.name = name;

        


    }
    public ArrayList<Double> getGrade() {
        return grade;
    }
    // getters 
    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
    // setters
    public void setCourses(String course) {
        this.course = course;
    }
    public void setGrade(ArrayList<Double> grade) {
        this.grade = grade;
    }
    
    public void setName(String name) {
        this.name = name;
    }
//    sub class timetable

   
    
    
    
}
