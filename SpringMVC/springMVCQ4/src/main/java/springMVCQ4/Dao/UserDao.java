package springMVCQ4.Dao;

import springMVCQ4.Model.User;

public interface UserDao {
	public int registerUser(org.apache.catalina.User user);
	public String loginUser(org.apache.catalina.User user);
}
