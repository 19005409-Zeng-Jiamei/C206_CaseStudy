
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19005409, Aug 17, 2020 8:04:46 PM
 */

public class Currency {
	private String iso;
	private String currencyName;
	private double buyRate;
	private double sellRate;
	
	public Currency(String iso, String currencyName, double buyrate, double sellRate) {
		this.iso=iso;
		this.currencyName=currencyName;
		this.buyRate=buyrate;
		this.sellRate=sellRate;
	}

	public String getIso() {
		return iso;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public double getBuyRate() {
		return buyRate;
	}

	public double getSellRate() {
		return sellRate;
	}
	
	
}
