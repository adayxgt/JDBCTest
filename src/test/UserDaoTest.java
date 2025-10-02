package test;

public class UserDaoTest {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.insert(1, null, null, false, 34);
		
		userDao.delete(1);
	}
}
