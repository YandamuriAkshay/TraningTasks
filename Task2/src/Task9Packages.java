import model.Student;
import service.StudentService;

public class Task9Packages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.name = "Akshay";
		st.age = 25;
		
		StudentService ss = new StudentService();
		ss.printStudent(st);

	}

}
