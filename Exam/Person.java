public class Person {
    private int age;
    private double salary;

    public Person(int age,double salary){
        this.age = age;
        this.salary=salary;

    }
    // using getters to get the values
    public int getAge() {
        return age;
    }
   
    public double getSalary() {
        return salary;
    } 
    // using setters in order to modify data
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // methods or functions of the class
    public double calculateSalary(){
        return 0.0;
    }
   

    
    
}
