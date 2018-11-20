package com.addressbookmanagementprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.interfaceimplementation.AddressBookManagerImplem;
import com.interfaceimplementation.FileReadAndWrite;

public class AddressBookManager {
public static void main(String[] args) {
	String say;
	int count=0;
	String files[]=new String[10];
	Scanner s=new Scanner(System.in);
	boolean b=false;
	int choice;
	ArrayList< Object>list =new ArrayList<>();
	AddressBookManagerImplem addressbookmanager=new AddressBookManagerImplem();

	while(b==false) {
		
		System.out.println("1.createbook\n2.open\n3.save\n4.save as\n5.quit");
		System.out.println("enter your choice");
		choice=s.nextInt();
		switch(choice) {
		case 1:
			String ch;
		System.out.println("wellcome create a new address book ");
		System.out.println("enter the name of the file");
		String filename=s.next();
		
		files[count]=filename;
		++count;
		
		String path="/home/bridgeit/Desktop/2d/address/"+filename;
		File f=new File("/home/bridgeit/Desktop/2d/address/");
		int i=0;
		//String filess[]=new String[files.length];
		
		File file=new File(path);
		try {
			
			if(file.createNewFile()) {
				System.out.println("created");
				if(f.listFiles().length==1) {
				list=addressbookmanager.createAddressBook(path);
				System.out.println(list);
				}
				else {
					if(f.length()!=0) {
				//	File[] files=f.listFiles();
					String filepath=null;

					System.out.println("close the pervious one");
					ch=s.next();
						
					if(ch.equalsIgnoreCase("yes")) {
						/*for (File file2 : files) {
							File file1=new File("/home/bridgeit/Desktop/2d/address/"+file2.getName());

						if(file1.length()==0) {
							
					filepath=file2.getName();}
					i++;
					}*/
					System.out.println("aa"+list);
					System.out.println();
				//	FileReadAndWrite.fileWrites(list, filess[filess.length-1]);
			addressbookmanager.save(list,files[count-2]);
			System.out.println(files[count-2]);
					list=addressbookmanager.createAddressBook(path);
					
					}
					else {
						list=addressbookmanager.createAddressBook(path);	
						addressbookmanager.save(list,filename);

}

				}
				
			}}
			else
			{
				System.out.println("file alredy existed");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("sucess");
			
			
		

			//	createNewBook();
			break;
		case 2:
			System.out.println("openbook");
			File ff=new File("/home/bridgeit/Desktop/2d/address/");
			File[] fi=ff.listFiles();
	//		int i=0;
	for (File file2 : fi) {
		file2.getName();
		System.out.println(file2.getName());
	}
//		int choice;
		System.out.println("enter your choice");

		String filee="/home/bridgeit/Desktop/2d/address/"+s.next();
			addressbookmanager.open(filee);
			
			
			break;
		case 3:
			System.out.println("save ");
			//save();
			break;
		case 4:
			//saveAs();
			break;
		case 5:
			System.exit(0);
			break;
		}
		if(b==false) {
			System.out.println("do yu want perfrom anything");
			say=s.next();
		}else {
			b=true;
			break;
		}

		
		
		
		
	}
}
}
