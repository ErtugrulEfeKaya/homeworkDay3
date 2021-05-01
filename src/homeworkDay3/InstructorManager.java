package homeworkDay3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getName() + " " + "e�itmenler aras�na ba�ar�yla eklendi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getName() + " " + "i�in e�itmen bilgileri ba�ar�yla g�ncellendi");
	}
	
	@Override 
	public void delete(User user) {
		System.out.println(user.getName() + " " + "e�itmenler aras�ndan ba�ar�yla silindi");
	}

	
}
