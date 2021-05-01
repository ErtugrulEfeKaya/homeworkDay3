package homeworkDay3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getName() + " " + "eðitmenler arasýna baþarýyla eklendi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getName() + " " + "için eðitmen bilgileri baþarýyla güncellendi");
	}
	
	@Override 
	public void delete(User user) {
		System.out.println(user.getName() + " " + "eðitmenler arasýndan baþarýyla silindi");
	}

	
}
