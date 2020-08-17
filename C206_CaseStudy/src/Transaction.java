import java.time.LocalDateTime;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19005409, Aug 17, 2020 8:05:04 PM
 */

public class Transaction {
	private LocalDateTime txnDate;
	private String type;
	private String ccyIn;
	private String ccyOut;
	private double amtIn;
	private double amtOut;
	private double rate;
	
	public Transaction(LocalDateTime txnDate, String type, String ccyIn, double amtIn, String ccyOut, double amtOut, double rate ) {
		this.txnDate=txnDate;
		this.type=type;
		this.ccyIn=ccyIn;
		this.amtIn=amtIn;
		this.ccyOut=ccyOut;
		this.amtOut=amtOut;
		this.rate=rate;
	}

	public LocalDateTime getTxnDate() {
		return txnDate;
	}

	public String getType() {
		return type;
	}

	public String getCcyIn() {
		return ccyIn;
	}

	public String getCcyOut() {
		return ccyOut;
	}

	public double getAmtIn() {
		return amtIn;
	}

	public double getAmtOut() {
		return amtOut;
	}

	public double getRate() {
		return rate;
	}
	
	
}
