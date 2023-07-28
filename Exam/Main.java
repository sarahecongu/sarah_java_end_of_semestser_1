public class Main {
    public static void main(String[] args) {
        // class employee instances
        Person person = new Person(34, 123000);
        Person person1 = new Person(23,125000);
        System.out.println("The age is " + person.getAge() + "\n" +"The salary is " + person.getSalary());
        System.out.println("The age is " + person1.getAge() + "\n" +"The salary is " + person1.getSalary());
// box instance 

        Box box  = new Box(1.99F);
        Box box1  = new Box(1.0F);
        Box box2  = new Box(2.9F);
// printing the width
        System.out.println("The width is: " + box.getWidth());
        System.out.println("The width is: " + box1.getWidth());
        System.out.println("The width is: " + box2.getWidth());
// updating the width of the box
        box.setWidth(0.9F);
        box1.setWidth(0.19F);
        box2.setWidth(0.29F);
        
        // printing the updated width
        System.out.println("The new width is: " + box.getWidth());
        System.out.println("The new width is: " + box1.getWidth());
        System.out.println("The new width is: " + box2.getWidth());
        
// Restaurant instances
Restaurant restaurant = new Restaurant();
        
// Adding menu items with prices
restaurant.addItem("BeefBurger", 9000);
restaurant.addItem("Pizza", 280000);
restaurant.addItem("Chicken", 15000);

// Displaying the menu
restaurant.displayMenu();

// Adding ratings for items
restaurant.addRating("BeefBurger", 4);
restaurant.addRating("Pizza", 5);

// Calculating and displaying average rating
double averageRating = restaurant.getAverageRating();
System.out.println("Average Rating: " + averageRating);

// Removing an item from the menu
restaurant.removeItem("Chicken");


// Displaying the updated menu
restaurant.displayMenu();



// Student class
Timetable timetable = new Timetable();
Student student  = new Student("sarah","subMath");

// adding a course
Timetable.addCourse("submath");
Timetable.addCourse("java");
Timetable.addCourse("Python");

System.out.println("The course is " + student.getCourse() + "\n"  +"The name of the student offering the course is" +
student.getName());











    }
}
