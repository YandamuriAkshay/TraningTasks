interface Printable {
    void printDetails();
}

abstract class User {
    abstract void login();
}

class Person {
    String name;
    int age;
}

class Student extends Person implements Printable {
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void printDetails() {
        System.out.println(name + " | Age: " + age + " | Grade: " + grade);
    }
}

class Admin extends User {
    void login() {
        System.out.println("Admin logged in");
    }
}

public class StudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Arun", 20, "A"));
        students.add(new Student("Bala", 21, "B"));
        students.add(new Student("Ajay", 22, "A"));

        for (Student s : students)
            s.printDetails();

        System.out.println("Students with grade A:");
        students.stream()
            .filter(s -> s.getGrade().equals("A"))
            .forEach(Student::printDetails);

        Admin admin = new Admin();
        admin.login();
    }
}
