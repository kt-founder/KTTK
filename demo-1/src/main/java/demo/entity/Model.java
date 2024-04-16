package demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "models")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "type", nullable  = false)
	private String type;
	
	@Column(name = "name", nullable  = false)
	private String name;
	
	@Column(name = "epochs", nullable  = false)
	private int epochs;
	
	@Column(name = "batchsize", nullable  = false)
	private int batchSize;
	
	@Column(name = "learningrate", nullable  = false)
	private double learningRate;
	
	public Model() {
		
	}
	
	public Model( String type, String name, int epochs, int batchSize, double learningRate) {
		super();
		this.type = type;
		this.name = name;
		this.epochs = epochs;
		this.batchSize = batchSize;
		this.learningRate = learningRate;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEpochs() {
		return epochs;
	}
	public void setEpochs(int epochs) {
		this.epochs = epochs;
	}
	public int getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
	public double getLearningRate() {
		return learningRate;
	}
	public void setLearningRate(double learningRate) {
		this.learningRate = learningRate;
	}
	
}
