package Lab1_Bai2;

public class PartTimeEmployee extends Employee {
	private double workingHour;
	private double hourRate;

	public PartTimeEmployee(String id, String name, double basicSalary, double workingHour, double hourRate) {
		super(id, name, basicSalary);
		this.workingHour = workingHour;
		this.hourRate = hourRate;
	}

	public double getWorkingHour() {
		return workingHour;
	}

	public boolean setWorkingHour(double workingHour) {
		if (workingHour >= 0) {
			this.workingHour = workingHour;
			return true;
		} else {
			return false;
		}
	}

	public double getHourRate() {
		return hourRate;
	}

	public boolean setHourRate(double hourRate) {
		if (hourRate >= 0) {
			this.hourRate = hourRate;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double income() {
		return this.workingHour * this.hourRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [workingHour=" + workingHour + ", hourRate=" + hourRate + ", income = " + this.income()
				+ "]";
	}

}
