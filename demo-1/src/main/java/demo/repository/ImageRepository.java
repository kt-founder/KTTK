package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Image;

public interface ImageRepository extends JpaRepository<Image,Long>{

}
