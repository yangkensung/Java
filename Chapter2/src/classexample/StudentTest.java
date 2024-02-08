package classexample;

public class StudentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentHong = new Student();
		studentHong.studentId = 202344011;
		studentHong.grade = 2;
		studentHong.studentName = "Hong";
		
		System.out.println(studentHong.showStudentInfo());
		System.out.println(studentHong);

		

	}
}
