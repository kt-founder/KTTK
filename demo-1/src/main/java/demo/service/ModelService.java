package demo.service;

import java.util.List;

import demo.entity.Model;

public interface ModelService {
	List<Model> getAllModels();
	
	Model saveModel(Model model);
	
	Model getModelByID(Long id);
	Model updateModel(Model model);
	
	void deleteModelByID(Long id);
}
