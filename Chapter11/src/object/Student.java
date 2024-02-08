package object;

public class Student {
	
	String name;
	int studentId;
	public Student (String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return name + "  " + studentId;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentId == student.studentId) {
				return true;
			}else return false;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	

}
