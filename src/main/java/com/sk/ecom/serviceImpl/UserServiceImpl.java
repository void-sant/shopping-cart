package com.sk.ecom.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sk.ecom.model.UserDtls;
import com.sk.ecom.repository.UserRepository;
import com.sk.ecom.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDtls saveUser(UserDtls user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtls getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDtls> getUsers(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAccountStatus(Integer id, Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseFailedAttempt(UserDtls user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userAccountLock(UserDtls user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean unlockAccountTimeExpired(UserDtls user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetAttempt(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserResetToken(String email, String resetToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDtls getUserByToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtls updateUser(UserDtls user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtls updateUserProfile(UserDtls user, MultipartFile img) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtls saveAdmin(UserDtls user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
