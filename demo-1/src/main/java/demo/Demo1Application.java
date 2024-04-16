package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.entity.Model;
import demo.repository.ModelReository;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Autowired
	private ModelReository modelRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Model model1 = new Model("Regconintion","Model1",50,16,0.01);
		//modelRepo.save(model1);
	}
	
	
}
