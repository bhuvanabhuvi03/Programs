package com.objectoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FinalReport {
	
static public void result(JSONArray arr) throws Exception {
	try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/companystock.json")){
		file.write(arr.toJSONString());
		file.flush();
		System.out.println("successfully upagraded");
		
	}
	
}
static public void stockdetail(JSONArray arr) throws IOException {
	try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/stockdetails.json")){
		file.write(arr.toJSONString());
		file.flush();
		System.out.println("successfully upagraded");
		
}

}


static public void compstock() {
	 JSONObject json;
	 JSONObject json1;
 JSONObject st;
  Map<Object, Object> map=new HashMap<>();
  JSONArray arr=new JSONArray();
   JSONObject oo=new JSONObject();
	JSONParser parser = new JSONParser();
	try (FileReader fileread = new FileReader("/home/bridgeit/Desktop/2d/companystock.json")) 
	{
Object ob = parser.parse(fileread);
		JSONArray jarr = (JSONArray) ob;
		// System.out.println(jarr);
		//System.out.println(jarr.size());
		for (int i = 0; i < jarr.size(); i++) {
			// System.out.println(json);

			// System.out.println("stock name "+json.get("HP".g)+"\n no of stock
			// "+json.get("number of stock")+"\n share price "+json.get("share price"));

			// System.out.println(json.get("HP"));

			// System.out.println(st);
			if (i == 0) {
				json = (JSONObject) jarr.get(i);

				st = (JSONObject) json.get("HP");
			//	System.out.println(st);
				System.out.println("stock name " + st.get("stockname") + "\n no of stock "	+ st.get("number of stock") + "\n share price " + st.get("share price"));
		        map.put("HP", st);
		        arr.add(map);
	//	System.out.println(map);
			} else if (i == 1) {
				//System.out.println(i);
				json = (JSONObject) jarr.get(i);
				st = (JSONObject) json.get("MAC");
				System.out.println("stock name " + st.get("stockname") + "\n no of stock "+ st.get("number of stock") + "\n share price " + st.get("share price"));
				map.put( "MAC",st);
				arr.add(map);
			} else if (i == 2) {

				json = (JSONObject) jarr.get(i);

				st = (JSONObject) json.get("SONY");
				System.out.println("stock name " + st.get("stockname") + "\n no of stock "+ st.get("number of stock") + "\n share price " + st.get("share price"));
				map.put( "SONY",st);
				arr.add(map);
			}
		}
		//oo.putAll(map);
		arr.add(map);
		FinalReport.stockdetail(arr);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
static public void  CustomerDetail(JSONArray al) {
	System.out.println(al);
	
	
	try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/customerdetails.json")){
    	file.write(al.toString());
    	file.flush();
    	System.out.println("successfully upgraded" );
    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}



static public void PrintCustomerDetail()
{
	
	JSONParser  parser=new JSONParser();
	try{
	
		File file=new File("/home/bridgeit/Desktop/2d/customerdetails.json");
		if(file.length()==0) {
			System.out.println("file empty");
		}
		else
		{
		Object ob=parser.parse(new FileReader(file));
		
		JSONArray customerfile=(JSONArray) ob;
	//	System.out.println(customerfile.size());
	
		for(int i=0;i<customerfile.size();i++) {
			JSONObject json=(JSONObject) customerfile.get(i);
			System.out.println("customer "+(i+1)+"\n"+"id "+json.get("id")+"\nname "+json.get("cname")+"\ncontact "+json.get("mobile number")+ "\nemailid   "+json.get("emailid"));
		}
		System.out.println("Suceess");
	} 
		}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		System.out.println("file is empty ");
		//e.printStackTrace();
	}
	
}



static void USerStock() {
	JSONParser parser=new JSONParser();
	try {
		File file=new File("/home/bridgeit/Desktop/2d/userstock.json");
		if(file.length()==0) {
			System.out.println("file empty");
		}
		else
		{
		Object ob=parser.parse(new FileReader(file));
		
		JSONArray customerfile=(JSONArray) ob;
	//	System.out.println(customerfile.size());
	
		for(int i=0;i<customerfile.size();i++) {
			JSONObject json=(JSONObject) customerfile.get(i);
			System.out.println("customer "+(i+1)+"\n"+"ID "+json.get("Id")+"\nname "+json.get("customername")+"\ncontact "+json.get("contact")+ "\nemailid   "+json.get("emailid"));
		
		JSONObject st=(JSONObject)json.get("stock");
		System.out.println(st);
		JSONObject s=(JSONObject)st.get("stock1");
	//	System.out.println(s);
		System.out.println("my stock");
		System.out.println("stockname  "+s.get("stockname1")+"\nnumber of share"+s.get("number of stock"));
		JSONObject ss=(JSONObject)st.get("stock2");
	//	System.out.println(ss);
		
		
		System.out.println("stockname"+ss.get("stockname2")+"\nnumber of share"+ss.get("number of stock"));
		JSONObject sss=(JSONObject)st.get("stock3");
	//	System.out.println(s);
		
		System.out.println("stockname  "+sss.get("stockname3")+"\nnumber of share"+sss.get("number of stock"));

		
		
		
		
		
		}
		System.out.println("Suceess");
	} 
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		System.out.println("file is empty ");
		//e.printStackTrace();
	}
	
	
}


}