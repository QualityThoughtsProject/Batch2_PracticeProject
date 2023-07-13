package com.cgi.mapfre.common;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;

import com.cgi.mapfre.Auto.pom.CreateClient;
import com.cgi.mapfre.Auto.pom.LoginPage;
import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.DriverFactory;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class GeneralMethods{
	
	public void loginToAgencyPortal(String userName,String password){
	new LoginPage(DriverFactory.getCurrentDriver()).login(userName, password);;
	}
	
	public void createCustomer() throws IOException{
		try {
			new CreateClient(DriverFactory.getCurrentDriver()).createNewClient();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
	}
@SuppressWarnings("deprecation")
public static void verifyPDFContent(String strURL, String premiumValue) {
		
		boolean flag = false;
		
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String output = null;

			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			Assert.assertTrue(strURL.contains(".pdf"));
			try{
	            URL url = new URL(strURL);
	            BufferedInputStream file = new BufferedInputStream(url.openStream());
	            PDDocument document = null;
	            try {
	                document = PDDocument.load(file);
	                 output = new PDFTextStripper().getText(document);
	               while(output != null){
	            	   if(output.contains(premiumValue)){
	            		   TestReport.log(LogStatus.PASS, "Premium value in PDF and Coverages page is matched "+premiumValue);
	            	   }
	            	   else{
	       				TestReport.log(LogStatus.FAIL, "Premium value in PDF and Coverages page is matched "+output);
	            	   }
	               }
	            } finally {
	                if (document != null) {
	                    document.close();
	                }
	            }
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        if(output.contains(premiumValue)){
	            flag =  true;
	        }
		
		//return flag;
}	
}
