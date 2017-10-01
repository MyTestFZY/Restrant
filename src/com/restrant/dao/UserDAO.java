package com.restrant.dao;

import java.util.List;

import com.restrant.entity.Admin;
import com.restrant.entity.Users;

public interface UserDAO {
	//�û���¼��֤
	public List search(Users condition);
	
	//�����û�
	public void addUsers(Users users);
	
	//����Ա��¼��֤
	public List search(Admin condition);
	
	//�޸ĸ�����Ϣ
	public void modifyUsers(Users users);
}