package homeworkDay3;

public class Student extends User{
	private int studentNumber;

	public Student(int id, String name, String email, int studentNumber) {
		super(id,name, email);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
