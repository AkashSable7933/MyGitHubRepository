package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertyFile6 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call get(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\SONY\\\\Downloads\\\\Testing\\\\Automation\\\\TestData.properties");
	
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		String pAmount=prop.getProperty("principleAmount");
		System.out.println(pAmount);
		//convert String into int		
		int amount=Integer.parseInt(pAmount);
		int res=amount/10;
		System.out.println("Result: "+res);
		double roi=Double.parseDouble(prop.getProperty("roi"));
		System.out.println("ROI: "+roi);		
	}

}