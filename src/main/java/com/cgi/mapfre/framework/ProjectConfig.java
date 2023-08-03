package com.cgi.mapfre.framework;


import java.io.FileInputStream;


import java.util.Properties;


public class ProjectConfig {
	public static Properties prop = new Properties();
	public static String filepath;
	static {
		try {
			filepath = System.getProperty("user.dir");
				System.out.println(filepath);
				filepath = filepath + "\\src\\main\\java\\com\\cgi\\mapfre\\framework\\ProjectConfig.properties";
				prop.load(new FileInputStream(filepath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getPropertyValue(String key) {
		return prop.getProperty(key);
	}
}
