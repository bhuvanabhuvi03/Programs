package com.bridgelab.creationalpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class Test implements Serializable{
	static void useSingleton() {
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}
public static void main(String[] args)  {
	
	
	/*
	
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
Class clazz;
try {
	clazz = Class.forName("com.bridgelab.creationalpattern.Singleton");
	 Constructor<Singleton> ctor=clazz.getDeclaredConstructor();
	    ctor.setAccessible(true);
	    Singleton s3=ctor.newInstance();
	    
	System.out.println(s3.hashCode());    


} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (NoSuchMethodException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalArgumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InvocationTargetException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   




*/
	
	
	
	
	//serializable
/*	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	try {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/home/bridgeit/Desktop/2d/tmt.txt"));
		oos.writeObject(s2);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/home/bridgeit/Desktop/2d/tmt.txt"));
		Singleton s3=(Singleton)ois.readObject();
		
		System.out.println(s3.hashCode());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	
	
	
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	ExecutorService executorService=Executors.newFixedThreadPool(2);
	executorService.submit(Test::useSingleton);
	executorService.submit(Test::useSingleton);
	executorService.shutdown();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
