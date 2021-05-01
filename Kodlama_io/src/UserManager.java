
public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý kaydý gerçekleþtirildi: " + user.getFirstName() + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý kaydý silindi");
	}
}
