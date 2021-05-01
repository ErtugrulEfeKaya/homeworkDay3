package homeworkDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi: " + user.getName());
	}
	
	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
	@Override
	public void update(User user) {
		System.out.println("��renci g�ncellendi: " + user.getName());
	}

	@Override
	public void delete (User user) {
		System.out.println("��renci silindi: " + user.getName());
	}
}
