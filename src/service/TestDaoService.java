package service;



import dao.TestDao;
import entity.Dev_User;


public class TestDaoService{
	private TestDao testDao =new TestDao();
	
	
	public Dev_User dev_Login(Dev_User user){
		return testDao.dev_Login(user);
	}
	
	
	
}
	
