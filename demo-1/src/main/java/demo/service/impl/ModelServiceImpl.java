package demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.entity.Model;
import demo.repository.ModelReository;
import demo.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService {
	
	private ModelReository modelRepo;
	
	
	
	public ModelServiceImpl(ModelReository modelRepo) {
		super();
		this.modelRepo = modelRepo;
	}



	@Override
	public List<Model> getAllModels() {
		// TODO Auto-generated method stub
		return modelRepo.findAll();
	}



	@Override
	public Model saveModel(Model model) {
		// TODO Auto-generated method stub
		return modelRepo.save(model);
	}



	@Override
	public Model getModelByID(Long id) {
		// TODO Auto-generated method stub
		return modelRepo.findById(id).get();
	}



	@Override
	public Model updateModel(Model model) {
		// TODO Auto-generated method stub
		return modelRepo.save(model);
	}



	@Override
	public void deleteModelByID(Long id) {
		// TODO Auto-generated method stub
		modelRepo.deleteById(id);
		
	}
}
