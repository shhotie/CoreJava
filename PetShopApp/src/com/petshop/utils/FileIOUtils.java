package com.petshop.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

import com.petshop.Pet;

public interface FileIOUtils {

	// save data in binary file oos -> fos
	public static void savePetData(List<Pet> petList, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			for (Pet pet : petList) {
				oos.writeObject(pet);
			}
			System.out.println("Binary File Created Suceessfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// read data from binary file

	public static void readPetData(String fileName) throws ClassNotFoundException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			List<Pet>petList = PetDataUtils.getPetData();
			for (Pet pet : petList) {
				pet = (Pet)ois.readObject();
				System.out.println(pet);
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException ce) {
		}
	}
	
	// write pet data in text file
	public static void saveData(List<Pet>petList,String fileName) {
		try (PrintWriter pw =new PrintWriter(new FileWriter(fileName))){
			petList.forEach(pw::println);
		} catch (IOException e) {

		e.printStackTrace();
		}
	}
	
//	// read from text file
//		public static void readData(String fileName) {
//			try (PrintWriter pw =new PrintWriter(new FileWriter(fileName))){
//				petList.stream().forEach(System.out::println);
//			} catch (IOException e) {
//
//			e.printStackTrace();
//			}
//		}
}