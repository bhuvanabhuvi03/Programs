package com.interfaceimplementation;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.module.PersonAddressDetail;
import com.module.PersonDetail;

public class AddressBookImplementation implements AdderssBook{
	JSONArray jsonarray=new JSONArray();
	JSONObject jsonp=new JSONObject();
    JSONObject jsona=new JSONObject();
Scanner scanner=new  Scanner(System.in);
	

@Override
	public ArrayList<Object> addPerson(String filename) {
	String choice="yes";
	boolean b=false;
	
	
	
	
	ArrayList<Object>alist=new ArrayList<Object>();
	
	
	
	
	
		while(b==false) {
    PersonDetail person=new PersonDetail();
    PersonAddressDetail personaddress=new PersonAddressDetail();
    System.out.println("enter the firstname");
    String firstName=scanner.next();
    person.setFirstName(firstName);
    System.out.println("enter the lastName");
    String lastName=scanner.next();
   person.setLastName(lastName);
   System.out.println("enter the mobile number");
   String phonenumber=scanner.next();
   personaddress.setPhonenumber(phonenumber);

    System.out.println("enter city name");
    String city=scanner.next();
    personaddress.setCity(city);
    System.out.println("enter state name");
    String state=scanner.next();
    personaddress.setState(state);
    System.out.println("enter zipcode");
    String zipcode=scanner.next();
    personaddress.setZipcode(zipcode);
 
    person.setPersonaddress(personaddress);
    alist.add(person);
    System.out.println(alist);
    //FileReadAndWrite.fileWrite(person,filename);
  /*  jsona.put("phonenmber", personaddress.getPhonenumber());
    jsona.put("city", personaddress.getCity());
    jsona.put("state", personaddress.getState());
    jsona.put("zipcode", personaddress.getZipcode());
    jsonp.put("firstname", person.getFirstName());
    jsonp.put("lastname", person.getLastName());
    jsonp.put("address", jsona);
*/	//JSONParser parser=new JSONParser();

    
/*	try{
 		File file=new File(filename);
 		if(file.length()==0) {
 			//System.out.println("ll");
    		
    			jsonarray.add(jsonp);
    	    	//DataStore.datastore(jsonarray);
    			FileReadAndWrite.fileWrite(jsonarray);

    	//		FinalReport.CustomerDetail(json);
 		}
 			else {
 		Object obj=parser.parse(new FileReader(file));
    	JSONArray ar=(JSONArray)obj;
 		JSONObject json1=(JSONObject)ar.get(0);
 		
    if(ar.size()!=0)
    {
    	
			ar.add(jsonp);
    }
	FileReadAndWrite.fileWrite(ar);

			
 			}
*/			
	
	
/*	
}catch (Exception e) {
	// TODO: handle exception
}*/
    
	System.out.println("do you want one more person detail");
	choice=scanner.next();
    if(choice.equals("yes")) {
    	b=false;
    }else {
    	b=true;
    	break;
    }
    
		}
		System.out.println(alist);
	    return alist;

    
    
	}

	@Override
	public void editPersonDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePesonDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

}
