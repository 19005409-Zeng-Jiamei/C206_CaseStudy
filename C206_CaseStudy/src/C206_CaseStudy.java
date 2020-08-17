import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_ADD = 1;
	private static final int OPTION_DELETE = 2;
	private static final int OPTION_VIEW = 3;
	private static final int OPTION_SEARCH = 4;
	private static final int OPTION_QUIT = 5;
	
	private static final int OPTION_CURRENCY = 1;
	private static final int OPTION_HOLDING = 2;
	private static final int OPTION_TRANSACTION = 3;
	
	
	public static void main(String[] args) {
		ArrayList<Currency> currencyList = new ArrayList<Currency>();
		ArrayList<MoneyHolding> moneyHoldingList = new ArrayList<MoneyHolding>();
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		
		int option = 0;
		while(option!=OPTION_QUIT) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option==OPTION_ADD) {
				C206_CaseStudy.setHeader("ADD");				
				itemTypeMenu();

				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == OPTION_CURRENCY) {
					C206_CaseStudy.addCurrency(currencyList, inputCurrency());
				}
				else if (itemType == OPTION_HOLDING) {
					C206_CaseStudy.addMoneyHolding(moneyHoldingList, inputMoneyHolding());
				}
				else if (itemType == OPTION_TRANSACTION) {
					C206_CaseStudy.addTransaction(transactionList, inputTransaction());
				}
				else {
					System.out.println("Invalid type");
				}
				

			}
			else if(option==OPTION_DELETE) {
				C206_CaseStudy.setHeader("DELETE");				
				itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == OPTION_CURRENCY) {
					C206_CaseStudy.viewAllCurrency(currencyList);
					String c = Helper.readString("Enter a currency name > ");
					C206_CaseStudy.deleteCurrency(currencyList, c);
				}
				else if (itemType == OPTION_HOLDING) {
					C206_CaseStudy.viewAllMoneyHolding(moneyHoldingList);
					String h = Helper.readString("Enter a holding name > ");
					C206_CaseStudy.deleteMoneyHolding(moneyHoldingList, h);
				}
				else if (itemType == OPTION_TRANSACTION) {
					C206_CaseStudy.viewAllTransaction(transactionList);
					String t = Helper.readString("Enter a transaction name > ");
					C206_CaseStudy.deleteTransaction(transactionList, t);
				}
				else {
					System.out.println("Invalid type");
				}
				
				
			}
			else if(option==OPTION_VIEW) {
				C206_CaseStudy.setHeader("VIEW ALL");				
				itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == OPTION_CURRENCY) {
					C206_CaseStudy.viewAllCurrency(currencyList);
				}
				else if (itemType == OPTION_HOLDING) {
					C206_CaseStudy.viewAllMoneyHolding(moneyHoldingList);
				}
				else if (itemType == OPTION_TRANSACTION) {
					C206_CaseStudy.viewAllTransaction(transactionList);
				}
				else {
					System.out.println("Invalid type");
				}
				
				
				
			}
			else if(option==OPTION_SEARCH) {
				C206_CaseStudy.setHeader("SEARCH");				
				
				String c = Helper.readString("Enter a currency name > ");
				C206_CaseStudy.searchRateByCurrency(currencyList, c);
				
			}
			else if(option==OPTION_QUIT) {
				System.out.println("Bye!");
			}
			else {
				System.out.println("Invalid option");
			}
		}
		

	}
	
	public static void itemTypeMenu() {
		C206_CaseStudy.setHeader("ITEM TYPES");
		System.out.println("1. Currency");
		System.out.println("2. Holding");
		System.out.println("3. Transaction");
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("Money Exchange Management System");
		System.out.println("1. Add item");
		System.out.println("2. Delete item");
		System.out.println("3. View all item");
		System.out.println("4. Search rate by currency");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
	}
	
	public static Currency inputCurrency() {
		return null;
	}
	
	//JiaJin user story ID 1.1 - SPRINT 1 
	public static void addCurrency(ArrayList<Currency> currencyList,Currency c) {
		
	}
	
	//JiaJin user story ID 1.2 
	public static String retrieveAllCurrency(ArrayList<Currency> currencyList) {
		return null;
	}
	
	//JiaJin user story ID 1.2
	public static void viewAllCurrency(ArrayList<Currency> currencyList) {
		
	}
	
	//JiaJin user story ID 1.3 
	public static void deleteCurrency(ArrayList<Currency> currencyList, String d) {
		
	}
	
	//YY user story ID 2.1 - SPRINT 1 
	public static MoneyHolding inputMoneyHolding() {
		return null;
	}
	
	//YY user story ID 2.1
	public static void addMoneyHolding(ArrayList<MoneyHolding> moneyHoldinglist, MoneyHolding add) {
		
	}
	
	//Mandy story ID 3.1 & 3.2 - SPRINT 1 / 2
	public static String retrieveAllMoneyHolding(ArrayList<MoneyHolding> moneyHoldingList) {
		return null;
	}
	
	//YY user story 2.2 
	public static void viewAllMoneyHolding(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//YY user story ID 2.3
	public static void deleteMoneyHolding(ArrayList<MoneyHolding>moneyHoldingList, String d) {
		
	}
	
	//Mandy user story ID 3.1 & 3.2 - SPRINT 1 / 2
	public static void retrieveAllHoldingAndSgdValue(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//Mandy point story ID 3.1 & 3.2 - SPRINT 1 / 2
	public static void viewAllHoldingAndSgdValue(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//NA
	public static void searchRateByCurrency(ArrayList<Currency>currencyList, String c) {
		
	}
	
	//NA
	public static void convertCurrency(ArrayList<Currency>currencyList) {
		
	}
	
	//Jiamei user story ID 5.1 - SPRINT 1 
	public static Transaction inputTransaction() {
		return null;
	}
	
	//Jiamei user story ID 5.1 - SPRINT 1 
	public static void addTransaction(ArrayList<Transaction>transactionList, Transaction a) {
		
	}
	
	//Jiamei user story ID 5.2 
	public static String retrieveAllTransaction(ArrayList<Transaction>transactionList) {
		return null;
	}
	
	//Jiamei user story ID 5.2 
	public static void viewAllTransaction(ArrayList<Transaction>transactionList) {
		
	}
	
	//Jiamei user story ID 5.3 
	public static void deleteTransaction(ArrayList<Transaction>TransactionList, String d) {
		
	}
	

}
