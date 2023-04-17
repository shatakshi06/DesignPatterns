package com.corepatterns.Creational.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		DateUtil dateUtil = DateUtil.getInstance();
		DateUtil newDateUtil = DateUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("/Users/shatakshijain/Documents/SingletonFiles/DateUtil.ser")));
		oos.writeObject(dateUtil);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("/Users/shatakshijain/Documents/SingletonFiles/DateUtil.ser")));
		newDateUtil = (DateUtil) ois.readObject();
		
		System.out.println(dateUtil == newDateUtil);

	}

}
