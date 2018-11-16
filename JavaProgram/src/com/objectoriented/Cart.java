package com.objectoriented;


import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Cart {
	static JSONObject json;
	static JSONObject st;
	static Scanner s = new Scanner(System.in);
	static JSONObject name;

	public static void sell(Object ob, JSONObject symbol) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void buy(Object ob, JSONObject symbol,JSONObject customerfile ) throws Exception {
		
		
		long customerstock=0;
		long customershare=0;

		  System.out.println(customerfile);
		  JSONObject cust=new JSONObject();
			cust.put("customername", customerfile.get("cname"));
			cust.put("Id", customerfile.get("id"));
			cust.put("emailid", customerfile.get("emailid"));
			cust.put("contact", customerfile.get("mobile number"));
			System.out.println(cust);
			JSONObject stock=new JSONObject();
			JSONObject product1=new JSONObject();
			JSONObject product2=new JSONObject();
		    JSONObject product3=new JSONObject();
		   // System.out.println("aa");
	  		String name= (String)symbol.get("stockname");

		JSONArray jarr = (JSONArray) ob;
		System.out.println(jarr);
//name=(JSONObject)symbol.get("stockname");
		System.out.println("those are the my stock in "+symbol.get("stockname"));
   		//System.out.println("what you want to buy");
		//System.out.println("1.HP\n2.MAc\n3.SONY");
	//	int ch;
		String stt = "yes";
		boolean b = false;
		while (b == false) {
		//	System.out.println("enter the product what you want");
		//	ch = s.nextInt();
			long noofstock = 0;
			long newstock = 0;
			long newamount = 0;
			long totalstockamount = 0;
		//	symbol = (JSONObject) jarr.get(ch - 1);
			
			System.out.println("selected stock is" + symbol.get("stockname"));
			// System.out.println("enter no of stock you want");
			System.out.println("total number of stock i have" + symbol.get("number of stock"));

			System.out.println("enter number of stock you want");
			
			noofstock = s.nextLong();
			System.out.println("total number of stock i have" + symbol.get("number of stock"));
			long stocknum = (long) symbol.get("number of stock");
		
			while (noofstock > stocknum)
			{
				if (noofstock > stocknum) {
					System.out.println("only i have  this much" + symbol.get("number of stock"));

					System.out.println("enter number of stock you want");
					noofstock = s.nextLong();
				} else {
					break;
				}			
				}
			customerfile.put("stockname",symbol.get("stockname") );
			System.out.println(customerfile);
		customerstock=customerstock+noofstock;
			
			System.out.println(customerfile);

				newstock = stocknum - noofstock;
				symbol.put("number of stock", newstock);
				long amount = (long) symbol.get("total amount");
				long price = (long) symbol.get("share price");
				totalstockamount = noofstock * price;
				customershare=customershare+totalstockamount;
				//customerfile.put("sharevalue", customershare);
	      //      product.put("c, value)
				System.out.println(customerfile);
				newamount = amount - totalstockamount;
				symbol.put("total amount", newamount);
//			
//				JSONObject j=new JSONObject();
//				j.put("stock", customerfile);
				product1.put("stockname1",symbol.get("stockname") );
				product2.put("stockname2","SONY" );
				product3.put("stockname3","MAC" );

				
				if(symbol.get("stockname").equals(name)) {
					System.out.println("11");

					product1.put("number of stock", customerstock);

				}
					else if(symbol.get("stockname").equals(name)) {

						product2.put("number of stock", customerstock);

					}
					else if(symbol.get("stockname").equals(name))
					{		
						product3.put("number of stock", customerstock);

					}
				
				stock.put("stock1", product1);
				stock.put("stock2", product2);
				stock.put("stock3", product3);

				cust.put("stock", stock);
				
			JSONArray a=new JSONArray();
				a.add(cust);
				
				
				
				
				
				try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/2d/userstock.json")) {
					file.write(a.toString());
					file.flush();
					System.out.println("sucess");
				}
				
				if (b == false) {
					System.out.println("you want purchase one more time ");
					stt = s.next();
					if (stt.equalsIgnoreCase("yes")) {
						b = false;
					} else {
						b = true;
						break;
					}
				}		}
System.out.println(jarr);
				
				for (int i = 0; i < jarr.size(); i++) {
					// System.out.println(json);

					// System.out.println("stock name "+json.get("HP".g)+"\n no of stock
					// "+json.get("number of stock")+"\n share price "+json.get("share price"));

					// System.out.println(json.get("HP"));

					// System.out.println(st);
					if (i == 0) {
						json = (JSONObject) jarr.get(i);

						st = (JSONObject) json.get("HP");
						System.out.println(st);
						System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
								+ "\n share price " + st.get("share price"));
					} else if (i == 1) {
					s	json = (JSONObject) jarr.get(i);
						st = (JSONObject) json.get("MAC");
						System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
								+ "\n share price " + st.get("share price"));

					} else if (i == 2) {

						json = (JSONObject) jarr.get(i);

						st = (JSONObject) json.get("SONY");
						System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
								+ "\n share price " + st.get("share price"));

					}
				}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
/*			}
 * 
 * 
		System.out.println(ob);
		JSONArray aa=new JSONArray();
		aa=(JSONArray) ob;
		
		JSONObject jj=new JSONObject();
		int t;
		for(int i=0;i<aa.size();i++) {
			jj=(JSONObject)aa.get(i);
			if(symbol.get("stockname").equals(jj.get("stockname"))) {
				t=i;
				
				
				
				
				
			}
					*/
			
			
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		System.out.println(symbol);
		
		
	JSONArray arrr=new JSONArray();
	
		
		arrr.add(symbol);
		System.out.println(arrr);
		System.out.println(customerfile);
		FinalReport.result(arrr);
		System.out.println("stock name " + symbol.get("stockname") + "\n no of stock " + symbol.get("number of stock")
		+ "\n share price " + symbol.get("share price"));
		CompanyStock.map.put(symbol.get("stockname"), symbol);
		System.out.println();
		CompanyStock.oo.put(symbol.get("stockname"), symbol);
		CompanyStock.arr.add(CompanyStock.oo);
		if(CompanyStock.arr.size()!=0)
		{
			//System.out.println("ll");
		
			CompanyStock.arr.add(CompanyStock.oo);
		}else {
			CompanyStock.arr.add(CompanyStock.oo);
		}
		CompanyStock.arr.add(CompanyStock.oo);

		
		
		FinalReport.PrintCustomerDetail();*/
	
	
	
	}


}