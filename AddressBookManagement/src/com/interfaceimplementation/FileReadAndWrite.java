package com.interfaceimplementation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import com.module.PersonDetail;

public class FileReadAndWrite {
	static JSONParser parser=new JSONParser();
	static ObjectMapper mapper=new ObjectMapper();
	static JSONArray jsona=new JSONArray();
   public static void fileWrite(PersonDetail person,String filename) {
	//System.out.println(jsnarray);
	
	String json="[";
	File file =new File(filename);
	try {
		if(file.length()==0)
			json=json+mapper.writeValueAsString(person)+"]";
		else {
			Object ob=parser.parse(new FileReader(file));
			jsona=(JSONArray)ob;
			for(int i=0;i<jsona.size();i++) {
				
				json=json+jsona.get(i)+",";
				
				
				
			}
			json=json+mapper.writeValueAsString(person)+"]";
			
		}
		FileWriter filewrite=new FileWriter(filename);

		filewrite.write(json);
		filewrite.flush();
	}catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	
	

		
/*    	System.out.println("successfully upgraded" );
    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	
*/}

   public static void fileWrites(ArrayList<Object> person,String filename) {
	   
String filen="/home/bridgeit/Desktop/2d/address/"+filename;
		String json=null;
		File file =new File(filen);
		try {
			/*if(file.length()==0)
				json=json+mapper.writeValueAsString(person.get(0))+"]";
	   
	   
	   
	   
	   
	   
			else {
		*/		/*Object ob=parser.parse(new FileReader(file));
				jsona=(JSONArray)ob;*/
				int temp=0;
				for(int i=0;i<jsona.size()-1;i++) {
					temp=i;

					json=mapper.writeValueAsString(person.get(0))+",";
					
					
				}
				if(jsona.size()>1) {
					json=mapper.writeValueAsString(person.get(temp+1));
				}
				//temp++;
				if(jsona.size()==0) {
				json=mapper.writeValueAsString(person);
				
				}
			
			FileWriter filewrite=new FileWriter(filen);

			filewrite.write(json);
			filewrite.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

   }
}
