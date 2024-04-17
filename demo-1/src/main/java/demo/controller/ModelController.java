package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import demo.entity.Model;
import demo.service.ModelService;

@Controller
public class ModelController {
	
	private ModelService modelService;

	public ModelController(ModelService modelService) {
		super();
		this.modelService = modelService;
	}
	
	@GetMapping("/models")
	public String listModel(org.springframework.ui.Model model) {
		model.addAttribute("models", modelService.getAllModels());
		//System.out.println("Hien thi" + model);
		return "models";
	}
	
	@GetMapping("/models/new")
	public String createModellForm(org.springframework.ui.Model model) {
		Model md = new Model();
		model.addAttribute("model", md);
		return "add_model";
	}
	@PostMapping("/models")
	public String saveModel(@ModelAttribute("model") Model model) {
		modelService.saveModel(model);
		return "redirect:/models";
	}
	
	// 
	@GetMapping("/models/edit/{id}")
	public String editModelForm(@PathVariable Long id, org.springframework.ui.Model model )
	{
		model.addAttribute("model", modelService.getModelByID(id));
		return "edit_model";
	}
	@PostMapping("models/{id}")
	public String updateModel(@PathVariable Long id, @ModelAttribute("model") Model md, org.springframework.ui.Model model) {
		
		// Lay model tu database
		Model existingModel = modelService.getModelByID(id);
		existingModel.setId(id);
		existingModel.setType(md.getType());
		existingModel.setName(md.getName());
		existingModel.setEpochs(md.getEpochs());
		existingModel.setBatchSize(md.getBatchSize());
		existingModel.setLearningRate(md.getLearningRate());
		
		// save
		
		modelService.updateModel(existingModel);
		return "redirect:/models";
		
	}
	
	// Delete
	@GetMapping("/models/{id}")
	public String deleteModel(@PathVariable Long id) {
		modelService.deleteModelByID(id);
		return "redirect:/models";
	}
}
