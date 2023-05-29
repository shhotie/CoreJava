package com.hrushu.reflection;

import java.lang.reflect.Field;

public class ReflectionExample {
	
	public static void main(String[] args) throws Exception {
        
		MyClass obj = new MyClass();

        // Access private field using reflection
        Field privateField = MyClass.class.getDeclaredField("prFild");
        /*
         In Java, Field is a class in the java.lang.reflect package that represents 
         a field of a class or interface. 
         It provides methods to get information about and manipulate 
         fields dynamically at runtime, even if they are 
         
         private or inaccessible by normal means.
         */
        privateField.setAccessible(true);
        String fieldValue = (String) privateField.get(obj);
        System.out.println("Private field value: " + fieldValue);

        // Modify private field using reflection
        privateField.set(obj, "Goodbye, world!");
        System.out.println("New private field value: " + obj.toString());
    }

}

/*
 OUTPUT:
 Private field value: Hello, world!
New private field value: MyClass [prFild=Goodbye, world!]
 */
