class Student {
    String name;
    int rollNumber;
    double percentage;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double percentage) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + " | Name: " + name + " | Percentage: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating 10 student objects (representing top 10 students of Class 10)
        Student student1 = new Student("Sam", 1, 98.5);
        Student student2 = new Student("Tom", 2, 98.0);
        Student student3 = new Student("Alice", 3, 96.5);
        Student student4 = new Student("Bob", 4, 95.5);
        Student student5 = new Student("Charlie", 5, 94.0);
        Student student6 = new Student("Diana", 6, 93.5);
        Student student7 = new Student("Ethan", 7, 92.0);
        Student student8 = new Student("Fiona", 8, 91.5);
        Student student9 = new Student("George", 9, 90.0);
        Student student10 = new Student("Hannah", 10, 89.5);

        System.out.println("--- Top 10 Students Details ---");
        
        // Displaying details for each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
        student6.displayDetails();
        student7.displayDetails();
        student8.displayDetails();
        student9.displayDetails();
        student10.displayDetails();
    }
}
