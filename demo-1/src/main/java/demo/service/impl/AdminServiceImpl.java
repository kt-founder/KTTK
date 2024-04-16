package demo.service.impl;

import java.util.Optional;

import org.hibernate.annotations.processing.Find;

import demo.entity.Admin;
import demo.repository.AdminRepository;
import demo.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	private AdminRepository adminRepo;

	public AdminServiceImpl(AdminRepository adminRepo) {
		super();
		this.adminRepo = adminRepo;
	}
	
	@Override
	public Boolean Checklogin(String username, String password) {
		//Optional<Admin> optionalAdmin = findById(username);
		
		return null;
	}

	@Override
	public Optional<Admin> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

//	@Override
//	public Optional<Admin> findById(String id) {
//		// TODO Auto-generated method stub
//		return adminRepo.findById(id);
//	}
//	
}
