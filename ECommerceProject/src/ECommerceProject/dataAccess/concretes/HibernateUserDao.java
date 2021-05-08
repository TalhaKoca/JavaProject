package ECommerceProject.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý veritabanýna kaydedildi. " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý veritabanýndan silindi. " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi. " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		User admin = new User (1,"TALHA","KOCA","talha@talha","12345"); 
		User member = new User(2,"Talha","Koca","talha@talha.com","12345");
		
		List<User> list = new ArrayList<User>();
		list.add(admin);
		list.add(member);
		return list;
	}


}
