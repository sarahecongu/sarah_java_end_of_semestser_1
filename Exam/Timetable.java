import java.util.*;
public class Timetable {

  private List <Student> courses;

// constructor
  public Timetable() {
    courses = new ArrayList <Student > ();
  }
// methods
  public  void addCourse( Student course) {
    courses.add(course);
  }

  public void removeCourse(Student course) {
    courses.remove(course);
  }

  public void Timetable() {
    for (Student s: courses) {
    System.out.println(s.getName() +   s.getCourse()+ s.getGrade());
      
    
  }
}
public static void addCourse(String string) {
}

    
}
