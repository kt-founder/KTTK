package demo.service;

import java.util.Optional;

import demo.entity.Admin;

public interface AdminService {
	Boolean Checklogin(String username, String password);
	Optional<Admin> findById(String id);
	
}
