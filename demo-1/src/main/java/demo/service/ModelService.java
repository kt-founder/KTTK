package demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.entity.Model;

@Service
public interface ModelService {
	List<Model> getAllModels();
	
	Model saveModel(Model model);
	
	Model getModelByID(Long id);
	Model updateModel(Model model);
	
	void deleteModelByID(Long id);
}
