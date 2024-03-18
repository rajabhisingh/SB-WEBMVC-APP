package in.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhi.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("UserService :: Constractor");
	}
	
	
//	@Autowired
//	public UserService(UserDao userdao) {
//		System.out.println("UserSerice :: param - Constractor");
//		this.userdao = userdao;
//	}



//	@Autowired
//  public void setUserdao(UserDao userdao) {
//	  System.out.println("SetUserDao() - called....");
//		this.userdao = userdao;
//	}

@Autowired
private UserDao userdao;
  public void getName(int id) {
	  String findname = userdao.findName(id);
	  System.out.println("Name:"+findname);
  }
}
