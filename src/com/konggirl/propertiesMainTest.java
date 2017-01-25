package com.konggirl;

import com.konggirl.common.utils.PropertiesUtil;

public class propertiesMainTest {

	private static final String propTest = PropertiesUtil.getStringProperties("local", "properties.test");
	
	public static void main(String[] args) {
		
		System.out.println("properties.test : " + propTest);
	}

}
