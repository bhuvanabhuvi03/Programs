package com.interfaceimplementation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.module.PersonDetail;

public class AddressBookManagerImplem  implements AddressBookManager{
	Scanner s=new Scanner(System.in);

	@Override
	public ArrayList<Object> createAddressBook(String filename) {
		
		AddressBookImplementation addressbook=new AddressBookImplementation();
		
		
		return addressbook.addPerson(filename);
	}

	@Override
	public void open(String filename) {
		System.out.println(filename);
		JSONParser jsonParser=new JSONParser();
		File f=new File(filename);
		try {
			Object o=(Object)jsonParser.parse(new FileReader(f));
			
			JSONArray jsonArray=(JSONArray)o;
			System.out.println(jsonArray);
			JSONObject jb=(JSONObject)jsonArray.get(0);
			System.out.println(jb);
		} catch (IOException | ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArrayList<Object>list=new ArrayList<>();
		ObjectMapper mapper=new ObjectMapper();
		JsonFactory jfactory = new JsonFactory();
        JsonParser jParser;
		try {
			jParser = jfactory.createJsonParser(new File(filename));
		//     list= Arrays.asList(mapper.readValue(jParser, PersonDetail.class));
System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void save(ArrayList< Object>list,String file) {
		// TODO Auto-generated method stub
			FileReadAndWrite.fileWrites(list, file);

	}

	@Override
	public void saceAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
