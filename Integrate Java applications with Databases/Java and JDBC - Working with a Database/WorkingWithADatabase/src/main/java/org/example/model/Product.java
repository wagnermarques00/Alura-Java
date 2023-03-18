package org.example.model;

public class Product {

	private final String name;
	private final String description;
	private Integer id;

	public Product(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Product(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return String.format("The product is: %d, %s, %s", this.id, this.name, this.description);
	}
}
