package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = 0;
		for (int i = 0; i < population; i++) {
			bonus+= 0.50;
		}
		double moneyPerPerson = population * growthRate; 
		double taxesToBeCollected = moneyPerPerson + bonus;
		return taxesToBeCollected;
	}

}
