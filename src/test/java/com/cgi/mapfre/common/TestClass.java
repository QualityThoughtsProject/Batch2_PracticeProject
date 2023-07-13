package com.cgi.mapfre.common;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBufferedFileInputStream;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DesktopDriver;

public class TestClass extends CommonMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
//		DesktopDriver.remoteDriver = new ChromeDriver();
//		DesktopDriver.remoteDriver.get("https://css4.pub/2015/icelandic/dictionary.pdf");
//		//driver.findElement(By.linkText("PDF flyer")).click();
//		String getURL = DesktopDriver.remoteDriver.getCurrentUrl();
		//verifyPDFContent(getURL,"");

	}

public static void verifyPDFContent(String strURL, String reqTextInPDF) {
		
		boolean flag = false;
		
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String parsedText = null;

		try {
			URL url = new URL(strURL);
			InputStream is=url.openStream();
			RandomAccessBufferedFileInputStream file = new RandomAccessBufferedFileInputStream(is);
			PDFParser parser = new PDFParser(file);
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(1);
			
			pdDoc = new PDDocument(cosDoc);
			parsedText = pdfStripper.getText(pdDoc);
			System.out.println(parsedText);
		} catch (MalformedURLException e2) {
			System.err.println("URL string could not be parsed "+e2.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Unable to open PDF Parser. " + e.getMessage());
			try {
				if (cosDoc != null)
					cosDoc.close();
				if (pdDoc != null)
					pdDoc.close();
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+++++++++++++++++");
		System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

		if(parsedText.contains(reqTextInPDF)) {
			flag=true;
		}
		
		//return flag;
	}
	
}
