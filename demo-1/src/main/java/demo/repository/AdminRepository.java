package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
