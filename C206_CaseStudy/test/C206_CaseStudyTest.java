import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Currency c1;
	private Currency c2;
	private MoneyHolding mh1;
	private MoneyHolding mh2;
	private Transaction t1;
	private Transaction t2;
	private Transaction t3;
	private Transaction t4;
	private LocalDateTime time = LocalDateTime.now();
	
	private ArrayList<Currency> currencyList;
	private ArrayList<MoneyHolding> moneyHoldingList;
	private ArrayList<Transaction> transactionList;

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		//prepare test data
		//change accordingly -->
		c1 = new Currency("USD","US Dollar",0.7315,0.7283);
		c2 = new Currency("EUR","Euro",0.6191,0.6161);
		mh1 = new MoneyHolding("USD",50000);
		mh2 = new MoneyHolding("EUR",50000);
		//date, type, ccyIn, amtIn, ccyOut, amtOut, rate
		t1 = new Transaction(time,"BUY","SGD",5000,"EUR",3080.50,0.6191);
		t2 = new Transaction(time,"BUY","EUR",5000,"SGD",8076.24,0.6191);
		t3 = new Transaction(time,"SELL","SGD",5000,"USD",3641.50,0.7283);
		t4 = new Transaction(time,"SELL","USD",5000,"SGD",6835.27,0.7283);
		
		currencyList = new ArrayList<Currency>();
		moneyHoldingList = new ArrayList<MoneyHolding>();
		transactionList = new ArrayList<Transaction>();
		
	}

	//REMOVE "//" WHEN YOU FINISHED THE METHOD AND WANT TO TEST
	
	//@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	//@Test
	//JiaJin user story ID 1.1 - SPRINT 1 
	public void addCurrencyTest(ArrayList<Currency> currencyList,Currency c) {
		
	}
	
	//JiaJin user story ID 1.2 
	public String retrieveAllCurrencyTest(ArrayList<Currency> currencyList) {
		return null;
	}
	
	//JiaJin user story ID 1.2
	public void viewAllCurrencyTest(ArrayList<Currency> currencyList) {
		
	}
	
	//JiaJin user story ID 1.3 
	public void deleteCurrencyTest(ArrayList<Currency> currencyList, String d) {
		
	}
	
	//@Test
	//YY user story ID 2.1 - SPRINT 1 
	public MoneyHolding inputMoneyHoldingTest() {
		return null;
	}
	
	//YY user story ID 2.1
	public void addMoneyHoldingTest(ArrayList<MoneyHolding> moneyHoldinglist, MoneyHolding add) {
		
	}
	
	@Test
	//Mandy story ID 3.1 & 3.2 - SPRINT 1 / 2
	public String retrieveAllMoneyHoldingTest(ArrayList<MoneyHolding> moneyHoldingList) {
		return null;
	}
	
	//YY user story 2.2 
	public void viewAllMoneyHoldingTest(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//YY user story ID 2.3
	public void deleteMoneyHoldingTest(ArrayList<MoneyHolding>moneyHoldingList, String d) {
		
	}
	
	//@Test
	//Mandy user story ID 3.1 & 3.2 - SPRINT 1 / 2
	public void retrieveAllHoldingAndSgdValueTest(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//@Test
	//Mandy point story ID 3.1 & 3.2 - SPRINT 1 / 2
	public void viewAllHoldingAndSgdValueTest(ArrayList<MoneyHolding>moneyHoldingList) {
		
	}
	
	//NA
	public void searchRateByCurrencyTest(ArrayList<Currency>currencyList, String c) {
		
	}
	
	//NA
	public void convertCurrencyTest(ArrayList<Currency>currencyList) {
		
	}
	
	//Jiamei user story ID 5.1 - SPRINT 1 
	public void addTransactionTest(ArrayList<Transaction>transactionList, Transaction a) {
		//item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid transactionList arraylist to add to", transactionList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addTransaction(transactionList, t1);
		assertEquals("Check that Transaction arraylist size is 1", 1, transactionList.size());
		assertSame("Check that Transaction is added", t1, transactionList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Check that Transaction arraylist size is 2", 2, transactionList.size());
		assertSame("Check that Camcorder is added", t2, transactionList.get(1));
		
	}
	
	//Jiamei user story ID 5.1 - SPRINT 1 
	public void updateMoneyHoldingTest(String isoIn,String isoOut, double amtIn,double amtOut) {
		//boundary
		assertNotNull("Test if there is valid MoneyHolding arraylist to add to", moneyHoldingList);
		C206_CaseStudy.updateMoneyHolding(t1.getCcyIn(),t1.getCcyOut(),t1.getAmtIn(),t1.getAmtOut());
		
	}
	
	//Jiamei user story ID 5.2 
	public String retrieveAllTransactionTest(ArrayList<Transaction>transactionList) {
		return null;
	}
	
	//Jiamei user story ID 5.2 
	public void viewAllTransactionTest(ArrayList<Transaction>transactionList) {
		
	}
	
	//Jiamei user story ID 5.3 
	public void doDeleteTransactionTest(ArrayList<Transaction>TransactionList, String d) {
		
	}
	
	@After
	public void tearDown() throws Exception {
		c1=null;
		c2=null;
		mh1=null;
		mh2=null;
		t1=null;
		t2=null;
		
		currencyList = null;
		moneyHoldingList = null;
		transactionList = null;
	}


}
