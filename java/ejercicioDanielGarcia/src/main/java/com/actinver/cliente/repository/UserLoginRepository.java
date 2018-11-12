package com.actinver.cliente.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.actinver.cliente.entity.UserLoginEntity;

@Repository
public class UserLoginRepository {

	public List<UserLoginEntity>findUser(String user, String password) throws Exception{
		
		List<UserLoginEntity> users = generateUser();
		List<UserLoginEntity> result = new ArrayList<UserLoginEntity>();
		for(UserLoginEntity l: users) {
			if(l.getUser().equals(user) && l.getPassword().equals(password)) {
				result.add(l);
			}
		}
	
		return result;
	}
	
	private List<UserLoginEntity>generateUser(){
		List<UserLoginEntity> list = new ArrayList<UserLoginEntity>();
		list.add(new UserLoginEntity(0,"Daniel","Garcia","Valdez","admin","admin","root"));
		list.add(new UserLoginEntity(0,"Javier","Lopez","Martinez","operador","123","operador"));
		
		return list;
	}
	
}
