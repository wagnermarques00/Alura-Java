package org.example.model;

public class Product {

	private Integer id;
	private String name;
	private String description;
	private Integer categoryId;

	public Product(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Product(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return String.format("The product is: %d, %s, %s", this.id, this.name, this.description);
	}
}
