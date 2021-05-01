package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Ertuğrul Efe Kaya", "efekaya2334@gmail.com", 1001);
		Student student2 = new Student(2, "Zeynep Kaya", "zynpkaya@gmail.com", 1002);
		
		Instructor instructor = new Instructor(1, "Engin Demiroğ", "engin.demirog@gmail.com");
		System.out.println("------------------------------------------ \nSistemdeki kullanıcılar: ");
		System.out.println(student.getName()+" --> öğrenci numarası: "+student.getStudentNumber());
		System.out.println(student2.getName()+" --> öğrenci numarası: "+student2.getStudentNumber());
		System.out.println(instructor.getName());
		System.out.println("------------------------------------------ \nYapılan işlemler: ");
		
		//Öğrenci işlemleri
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student2);
		studentManager.update(student);
		
		//Eğitmen işlemleri
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);

		//Çoklu öğrenci ekleme işlemi
		Student[] students = {student,student2};
		studentManager.addMultiple(students);
		

}
}