
public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� kayd� ger�ekle�tirildi: " + user.getFirstName() + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� kayd� silindi");
	}
}
