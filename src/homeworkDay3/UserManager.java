package homeworkDay3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("User eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("User güncellendi: " + user.getName());
	}
	
	public void delete(User user) {
		System.out.println("User silindi: " + user.getName());
	}
}