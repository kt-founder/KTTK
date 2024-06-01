package demo.service;

import org.springframework.stereotype.Service;

import demo.entity.Image;

@Service
public interface ImageService {
	
	public Image createImage(Image image);
	public Image view();
	public Image view2();
}
