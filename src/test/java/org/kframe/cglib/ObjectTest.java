package org.kframe.cglib;

import net.sf.cglib.core.KeyFactory;

public class ObjectTest {
	
	public static void main(String[] args) {
		  
		  ObjectFactory f = (ObjectFactory) KeyFactory.create(ObjectFactory.class);
		 
		  Object obj = f.newInstance(80, "test", "DDD");
		 
		  System.out.println(obj);
	}

}

