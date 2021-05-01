package homeworkDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öğrenci eklendi: " + user.getName());
	}
	
	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
	@Override
	public void update(User user) {
		System.out.println("Öğrenci güncellendi: " + user.getName());
	}

	@Override
	public void delete (User user) {
		System.out.println("Öğrenci silindi: " + user.getName());
	}
}
