package br.com.bytebank.bank.model;

public class TaxCalculator {
	private double totalTax;

	public void register(Taxable taxable) {
		this.totalTax += taxable.calculateTaxAmount();
	}

	public double getTotalTax() {
		return totalTax;
	}

}
