package main;

public class AnimalNEU {
	
	String name;
	int age;
	double weight;
	String kind;
	
	
	
	public AnimalNEU(String name, int age, double weight, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

}
