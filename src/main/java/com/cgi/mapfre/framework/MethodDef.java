package com.cgi.mapfre.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;



public class MethodDef {
	static WebDriver driver;

	public static void click(By by) {
		CommonDef.waitForAngular();
		//CommonDef.waitVisible(by);
		//CommonDef.waitClickable(by);
		CommonDef.click(by);
	}
	public static void MobClick(By by)
	{
		CommonDef.click(by);
	}

	public static void click(By by, String elemname) {
		//CommonDef.waitVisible(by, elemname);
		//CommonDef.waitClickable(by, elemname);
		CommonDef.click(by, elemname);
	}
	public static void select(WebElement elem, String keysToSend) {
		CommonDef.waitVisible(elem, keysToSend);
		CommonDef.waitClickable(elem, keysToSend);	
		CommonDef.select(elem, keysToSend);
	}

	public static void dropdownValue(WebElement ele, String keysToSend) {
		try {
		if(!keysToSend.isEmpty() |!(keysToSend==null)){
		CommonDef.dropdown(ele, keysToSend);	
		CommonMethods.wait(1);
		}}catch (Exception e) {
			
		}
	}
	
	public static void selectJs(String id, String keysToSend) {	
		try {
			//CommonDef.waitVisible(by);
			CommonDef.getJSDropdown(id, keysToSend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void clickNoFail(By by, String elemname) {
		CommonDef.waitVisibleNoError(by);
		CommonDef.clickNoError(by, elemname);
	}

	public static void moveClickNoFail(By by, String elemname) {
		CommonDef.waitVisibleNoError(by);
		CommonDef.moveToElementClickNoFail(by, elemname);
	}

	public static void clickNoError(By by, String elemname) {
		CommonDef.clickNoError(by, elemname);
	}

	public static void click(WebElement elem) {
		CommonDef.waitVisible(elem);
		CommonDef.waitClickable(elem);
		CommonDef.click(elem);
	}

	public static void click(WebElement elem, String elemname) {
		CommonDef.click(elem, elemname);
		//CommonMethods.wait(2);
	}
	public static void clickwithWait(WebElement elem, String elemname) {
		CommonDef.click(elem, elemname);
		CommonMethods.wait(2);
	}

	public static void clickJS(By by) {
		CommonDef.waitVisible(by);
		CommonDef.waitClickable(by);
		CommonDef.clickJS(by);
	}

	public static void clickJS(WebElement elem) {
		CommonDef.waitVisible(elem);
		CommonDef.waitClickable(elem);
		CommonDef.clickJS(elem);
	}

	public static void clickJS(WebElement elem, String elemname) {
		CommonDef.waitVisible(elem, elemname);
		CommonDef.waitClickable(elem, elemname);
		CommonDef.clickJS(elem, elemname);
	}

	public static void clickJS(By by, String elemname) {
		CommonDef.waitVisible(by, elemname);
		CommonDef.waitClickable(by, elemname);
		CommonDef.clickJS(by, elemname);
	}

	public static void clickJSNoError(By by, String elemname) {
		// CommonDef.waitVisibleNoError(by);
		CommonDef.waitClickableNoError(by);
		CommonDef.clickJSNoError(by, elemname);
	}


	public static void clickJSNoError(By by, String elemname, int i) {
		CommonDef.waitClickableNoError(by, i);
		CommonDef.clickJSNoError(by, elemname);
	}

	public static void moveClick(By by, String elemname) {
		// CommonDef.waitClickable(by);
		CommonDef.moveClick(by, elemname);
	}

	public static void moveClick(WebElement elem, String elemname) {
		// CommonDef.waitClickable(by);
		CommonDef.moveClick(elem, elemname);
	}

	public static void sendKeys(By by, String keysToSend) {
		CommonDef.waitVisible(by, keysToSend);
		CommonDef.waitClickable(by, keysToSend);
		CommonDef.sendKeys(by, keysToSend);
	}

	public static void sendKeysEnter(By by, String keysToSend) {
		CommonDef.waitVisible(by, keysToSend);
		CommonDef.waitClickable(by, keysToSend);
		CommonDef.sendKeysEnter(by, keysToSend);
	}
	
	public static void sendKeys(WebElement elem, String keysToSend) {
		try {
		if(!keysToSend.isEmpty() |!(keysToSend==null)){
	//	CommonDef.clearText(elem);
		CommonDef.sendKeys(elem, keysToSend);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static String getText(WebElement policyStatus) {
		CommonDef.waitVisible(policyStatus);
		return CommonDef.getText(policyStatus);
	}
	
	public static String getattributeValue(WebElement ele) {
		//CommonDef.waitVisible(by);
		return CommonDef.getAttribute(ele, "value");
	}

	public static String getText(By by, String elem) {
		CommonDef.waitVisible(by, elem);
		return CommonDef.getText(by, elem);
	}

	public static void findElementsClick(By by) {
		CommonDef.waitVisible(by);
		CommonDef.waitClickable(by);
		CommonDef.findElementsClick(by);
	}

	public static void findElements(By by) {
		CommonDef.waitVisible(by);
		CommonDef.waitClickable(by);
	}

	public static void assertAttributeEquals(By by, String attr, String value) {
		CommonDef.assertEquals(CommonDef.getAttribute(by, attr), value);
	}

	public static void loadWaitIE() {
		try {
			Thread.sleep(3000);
			CommonDef.waitForPageLoad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean assertContains(By by, String string) {
		CommonDef.waitVisible(by, string);
		boolean b = CommonDef.assertContains(by, string);
		return b;
	}

	public static void assertContainsData(By by, String string) {
		CommonDef.waitVisible(by, string);
		CommonDef.assertContainsData(by, string);
	}

	public static boolean assertElemsContains(By by, String string) {
		CommonDef.waitVisible(by, string);
		boolean b = CommonDef.assertElemsContains(by, string);
		return b;
	}

	public static boolean assertElemsContainsWarn(By by, String string) {
		CommonDef.waitVisibleNoError(by);
		boolean b = CommonDef.assertElemsContainsWarn(by, string);
		return b;
	}

	public static boolean assertContainsNoError(By by, String string) {
		// CommonDef.waitVisibleNoError(by);
		boolean b = CommonDef.assertInnerHTMLContains(by, string);
		return b;
	}

	public static void assertContains(By by, String string, String passmsg) {
		//CommonDef.waitVisible(by, string);
		CommonDef.assertContains(by, string, passmsg);
	}

	private static boolean isWorkingDay(Calendar cal) {
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY)
			return false;
		// tests for other holidays here
		// ...
		return true;
	}

	/*public static String getIP() {
		WebDriver curr = DriverFactory.getCurrentDriver();
		String id = ((RemoteWebDriver) curr).getSessionId().toString();
		String ip = "";
		try {
			String hub = ProjectConfig.getPropertyValue("SelHost").split("/wd/hub")[0];
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(hub + "/grid/api/testsession?session=" + id);
			HttpResponse response = client.execute(request);
			JsonObject myjsonobject = extractObject(response);
			JsonElement urltest = myjsonobject.get("proxyId");
			ip = urltest.getAsString();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ip;
	}*/

	/*private static JsonObject extractObject(HttpResponse resp) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(resp.getEntity().getContent()));
		StringBuffer s = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			
			s.append(line);
		}
		rd.close();
		JsonParser parser = new JsonParser();
		JsonObject objToReturn = (JsonObject) parser.parse(s.toString());
		return objToReturn;
	}*/

	public static String convertHexToString(String hex) {

		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		// 49204c6f7665204a617661 split into two characters 49, 20, 4c...
		for (int i = 0; i < hex.length() - 1; i += 2) {

			// grab the hex in pairs
			String output = hex.substring(i, (i + 2));
			// convert hex to decimal
			int decimal = Integer.parseInt(output, 16);
			// convert the decimal to character
			sb.append((char) decimal);

			temp.append(decimal);
		}

		return sb.toString();
	}

	/*public static void launchURL() {
		WebDriver driver = DriverFactory.getCurrentDriver();
		driver.get(ProjectConfig.getPropertyValue("url"));
		ExReporter.log(LogStatus.INFO, "URL Loaded: " + ProjectConfig.getPropertyValue("url"));
		CommonDef.waitForPageLoad();
	}*/

/*	public static void getResponseCodes(By topNavBarLinks, String testItem) {
		ExReporter.logNoScreen(LogStatus.INFO, "Validating hyperlink in: " + testItem);
		for (WebElement web : CommonDef.findElements(topNavBarLinks))
			CommonDef.brokenLinkValidation(CommonDef.getAttribute(web, "href"));
		if (CommonDef.findElements(topNavBarLinks).size() < 1)
			ExReporter.logNoScreen(LogStatus.FAIL, "No Hyperlinks are found in: " + testItem);
	}*/
	
	public static String futureDate() throws ParseException{
		Calendar cal = Calendar.getInstance();
		Date curr = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(curr);
		cal.setTime(sdf.parse(date));    
		cal.add(Calendar.DATE, 1 );
		return sdf.format(cal.getTime());
	}
	
	public static void Action_sendKeys(By by, String keysToSend) {
		CommonDef.Action_sendkeys(by, keysToSend);
	}
	public static void clickcontinueButton(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
