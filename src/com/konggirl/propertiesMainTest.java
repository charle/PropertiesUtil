package com.konggirl;

import com.konggirl.common.utils.PropertiesUtil;

public class propertiesMainTest {

	private static final String propTest = PropertiesUtil.getStringProperties("local", "properties.test");
	private static final int propInt = PropertiesUtil.getIntProperties("local", "properties.int.test");
	
	public static void main(String[] args) {
		
		System.out.println("properties.test : " + propTest);
		System.out.println("properties.int.test : " + propInt);
	}

}
