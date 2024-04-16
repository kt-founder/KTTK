package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Model;

public interface ModelReository extends JpaRepository<Model, Long>{
 
}
