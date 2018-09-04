package dao;


import org.apache.ibatis.session.SqlSession;


import entity.Dev_User;
import util.MyBaitsUtil;



public class TestDao implements Dev_LoginDao{

	
	@Override
	public Dev_User dev_Login(Dev_User user) {
		SqlSession sqlSession =null;
		Dev_User us =new Dev_User();
		try {
			sqlSession =MyBaitsUtil.createSqlSession();
			us =sqlSession.getMapper(dao.Dev_LoginDao.class).dev_Login(user);
		} catch (Exception e) {
			MyBaitsUtil.closeSqlSession(sqlSession);
		}
		return us;
	}
}
