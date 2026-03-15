package Lab1;

public class ImportedProduct extends Product {
	private double importTaxRate;
	private double shippingFee;

	public ImportedProduct(String id, String name, double basePrice, double importedTaxRate, double shippingFee) {
		super(id, name, basePrice);
		this.importTaxRate = importedTaxRate;
		this.shippingFee = shippingFee;
	}

	public double getImportTaxRate() {
		return importTaxRate;
	}

	public boolean setImportTaxRate(double importTaxRate) {
		if (importTaxRate >= 0 && importTaxRate <= 1) {
			this.importTaxRate = importTaxRate;
			return true;
		} else {
			return false;
		}

	}

	public double getShippingFee() {
		return shippingFee;
	}

	public boolean setShippingFee(double shippingFee) {
		if (shippingFee >= 0) {
			this.shippingFee = shippingFee;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double finalPrice() {
		return super.finalPrice() + super.finalPrice() * this.importTaxRate + this.shippingFee;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "Tax: " + importTaxRate + " | " + "Shipping Fee: " + shippingFee;
	}
}
