package br.com.bytebank.bank.model;

/**
 * Class that represents a customer of the Bytebank bank
 * @author wagnermarques00
 * @version 0.1
 */

public class Customer {
	private String name;
	private String clientId;
	private String profession;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
