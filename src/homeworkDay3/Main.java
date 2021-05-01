package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Ertu�rul Efe Kaya", "efekaya2334@gmail.com", 1001);
		Student student2 = new Student(2, "Zeynep Kaya", "zynpkaya@gmail.com", 1002);
		
		Instructor instructor = new Instructor(1, "Engin Demiro�", "engin.demirog@gmail.com");
		System.out.println("------------------------------------------ \nSistemdeki kullan�c�lar: ");
		System.out.println(student.getName()+" --> ��renci numaras�: "+student.getStudentNumber());
		System.out.println(student2.getName()+" --> ��renci numaras�: "+student2.getStudentNumber());
		System.out.println(instructor.getName());
		System.out.println("------------------------------------------ \nYap�lan i�lemler: ");
		
		//��renci i�lemleri
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student2);
		studentManager.update(student);
		
		//E�itmen i�lemleri
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);

		//�oklu ��renci ekleme i�lemi
		Student[] students = {student,student2};
		studentManager.addMultiple(students);
		

}
}