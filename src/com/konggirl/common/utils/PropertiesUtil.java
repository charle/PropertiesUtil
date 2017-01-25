package com.konggirl.common.utils;

import java.util.HashMap;
import java.util.Properties;
import java.io.InputStream;

/**
 * <p>
 * 프로퍼티를 읽어들여 초기화하고 프로퍼티의 값을 불러오는 유틸이다.
 * 
 * @author konggirl
 * 
 */

@SuppressWarnings("unchecked")
public class PropertiesUtil {

	@SuppressWarnings("rawtypes")
	private static HashMap propMap = null;

	/**
	 * <p>
	 * 프로퍼티를 읽어와 초기화한다.
	 * 
	 * @param fileName
	 */
	@SuppressWarnings("rawtypes")
	private static void init(String fileName) {
		propMap = new HashMap();
		Properties prop = new Properties();
		String filePath = Constant.CONFIGURE_PATH + fileName + Constant.PROPERTIES_EXT;
		InputStream in = null;
		try {
			in = Class.forName("com.konggirl.common.utils.PropertiesUtil").getResourceAsStream(filePath);
			prop.load(in);
			propMap.put(fileName, prop);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}
	}

	/**
	 * <p>
	 * 프로퍼티를 읽어와 초기화한다.
	 * 
	 * @param fileName
	 */
	@SuppressWarnings("rawtypes")
	private static void init(String dir, String fileName) {
		propMap = new HashMap();
		Properties prop = new Properties();
		String filePath = Constant.CONFIGURE_PATH + dir + "/" + fileName + Constant.PROPERTIES_EXT;
		InputStream in = null;
		try {
			in = Class.forName("com.konggirl.common.utils.PropertiesUtil").getResourceAsStream(filePath);
			prop.load(in);
			propMap.put(fileName, prop);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}
	}

	/**
	 * <p>
	 * 프로퍼티 내용을 읽어와 String 값으로 반환해준다.
	 * <p>
	 * 첫번째 파라미터는 프로퍼티명(확장자제외), 두번째 파라미터는 프로퍼티파일에 지정된 키값을 의미한다.
	 * 
	 * @param propName
	 *            (프로퍼티명)
	 * @param propKey
	 *            (프로퍼티 키값)
	 * @return String 값
	 */
	public static String getStringProperties(String propName, String propKey) {
		// //new String( p.getProperty(key).getBytes("ISO-8859-1"), "euc-kr");
		String result = "";
		if (propMap == null || propMap.isEmpty()) {
			init(propName);
		}
		Properties prop = (Properties) propMap.get(propName);
		try {
			result = new String(prop.getProperty(propKey, "").trim().getBytes("ISO-8859-1"), "UTF-8");
		} catch (Exception e) {
		}
		return result; // 해당키값이 없다면 디폴드로 공백처리...
	}

	/**
	 * <p>
	 * 프로퍼티 내용을 읽어와 String 값으로 반환해준다.
	 * <p>
	 * 첫번째 파라미터는 프로퍼티명(확장자제외), 두번째 파라미터는 프로퍼티파일에 지정된 키값을 의미한다.
	 * 
	 * @param propName
	 *            (프로퍼티명)
	 * @param propKey
	 *            (프로퍼티 키값)
	 * @return String 값
	 */
	public static String getStringProperties(String path, String propName, String propKey) {
		// //new String( p.getProperty(key).getBytes("ISO-8859-1"), "euc-kr");
		String result = "";
		if (propMap == null || propMap.isEmpty()) {
			init(path, propName);
		}
		Properties prop = (Properties) propMap.get(propName);
		try {
			result = new String(prop.getProperty(propKey, "").trim().getBytes("ISO-8859-1"), "UTF-8");
		} catch (Exception e) {
		}
		return result; // 해당키값이 없다면 디폴드로 공백처리...
	}

	/**
	 * <p>
	 * 프로퍼티 내용을 읽어와 String 값으로 반환해준다.
	 * <p>
	 * 첫번째 파라미터는 프로퍼티명(확장자제외), 두번째 파라미터는 프로퍼티파일에 지정된 키값을 의미한다.
	 * 
	 * @param propName
	 *            (프로퍼티명)
	 * @param propKey
	 *            (프로퍼티 키값)
	 * @return String 값
	 */
	public static int getIntProperties(String propName, String propKey) {
		// //new String( p.getProperty(key).getBytes("ISO-8859-1"), "euc-kr");
		int result = 0;
		if (propMap == null || propMap.isEmpty()) {
			init(propName);
		}
		Properties prop = (Properties) propMap.get(propName);
		try {
			result = Integer.parseInt(new String(prop.getProperty(propKey, "").trim().getBytes("ISO-8859-1"), "UTF-8"));
		} catch (Exception e) {
		}
		return result; // 해당키값이 없다면 디폴드로 공백처리...
	}

	/**
	 * <p>
	 * 프로퍼티 내용을 읽어와 String 값으로 반환해준다.
	 * <p>
	 * 첫번째 파라미터는 프로퍼티명(확장자제외), 두번째 파라미터는 프로퍼티파일에 지정된 키값을 의미한다.
	 * 
	 * @param propName
	 *            (프로퍼티명)
	 * @param propKey
	 *            (프로퍼티 키값)
	 * @return String 값
	 */
	public static int getIntProperties(String dir, String propName, String propKey) {
		// //new String( p.getProperty(key).getBytes("ISO-8859-1"), "euc-kr");
		int result = 0;
		if (propMap == null || propMap.isEmpty()) {
			init(dir, propName);
		}
		Properties prop = (Properties) propMap.get(propName);
		try {
			result = Integer.parseInt(new String(prop.getProperty(propKey, "").trim().getBytes("ISO-8859-1"), "UTF-8"));
		} catch (Exception e) {
		}
		return result; // 해당키값이 없다면 디폴드로 공백처리...
	}

}
