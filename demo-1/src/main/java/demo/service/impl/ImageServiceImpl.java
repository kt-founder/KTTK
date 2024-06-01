package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Image;
import demo.repository.ImageRepository;
import demo.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository imageRepo;

	@Override
	public Image createImage(Image image) {
		// TODO Auto-generated method stub
		return imageRepo.save(image);
	}

	@Override
	public Image view() {
		// TODO Auto-generated method stub
		return imageRepo.findById((long) 1).get();
	}

	@Override
	public Image view2() {
		// TODO Auto-generated method stub
		return imageRepo.findById((long) 5).get();
	}
	
}
