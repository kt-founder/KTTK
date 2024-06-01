package demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.entity.Admin;

@Service
public interface AdminService {
	Boolean checkAdminByUsername(String username);
	Boolean checkPassword(String username, String password);
	List<Admin> findAll();
	
}
