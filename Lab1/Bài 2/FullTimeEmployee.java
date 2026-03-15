package Lab1_Bai2;

public class FullTimeEmployee extends Employee {
	private double bonus;
	private double penalty;

	public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
		super(id, name, basicSalary);
		this.bonus = bonus;
		this.penalty = penalty;
	}

	public double getBonus() {
		return bonus;
	}

	public double getPenalty() {
		return penalty;
	}

	public boolean setBonus(double bonus) {
		if (bonus >= 0) {
			this.bonus = bonus;
			return true;
		} else {
			return false;
		}
	}

	public boolean setPenalty(double penalty) {
		if (penalty >= 0) {
			this.penalty = penalty;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double income() {
		return super.income() + this.bonus - this.penalty;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [bonus=" + String.format("%.0f", bonus) + ", penalty=" + String.format("%.0f", penalty)
				+ ", income = " + String.format("%.0f", super.income()) + "]";
	}

}
