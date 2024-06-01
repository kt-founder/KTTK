package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Admin;
import demo.repository.AdminRepository;
import demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;
	@Override
	public Boolean checkAdminByUsername(String username) {
		Admin admin = adminRepo.findByUsername(username);
		if(admin == null) return false;
		return true;
	}

	@Override
	public Boolean checkPassword(String username, String password) {
		Admin admin = adminRepo.findByUsername(username);
		if(admin.getPassword().equals(password)) return true;
		return false;
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

}
