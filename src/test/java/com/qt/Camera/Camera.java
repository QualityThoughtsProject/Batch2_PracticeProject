package com.qt.Camera;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Camera {
		
	 WebDriver driver;
	
	@FindBy(xpath="//a[text()='Cameras']")WebElement cameraLnk;
	@FindBy(xpath="//a[text()='Canon EOS 5D']")WebElement canonLnk;
	@FindBy(xpath="//a[text()='Nikon D300']")WebElement NikonLnk;
	@FindBy(xpath="( //button[@type='submit'])[3]")WebElement CanonProductCompareLnk;
	@FindBy(xpath="( //button[@type='submit'])[6]")WebElement NikonProductCompareLnk;
	@FindBy(xpath="//a[text()='Product Compare (0)']")WebElement ProductCompareLnk;
	@FindBy(xpath="//a[text()='Reviews (0)']")WebElement ReviewsLnk;
	@FindBy(xpath="(//input[@class='form-control'])[2]")WebElement textarea1Lnk;
	@FindBy(xpath="//textarea[@class='form-control']")WebElement textarea2Lnk;
	@FindBy(xpath="(//input[@type='radio'])[4]")WebElement RatingButtonLnk;
	@FindBy(xpath="//button[text()='Continue']")WebElement ContinueLnk;// reviews option
	
	@FindBy(xpath="//button[@id='button-list']")WebElement ListButtonLnk;
	@FindBy(xpath="//button[@id='button-grid']")WebElement gridButtonLnk;
	
	@FindBy(xpath="(//img[@class='img-thumbnail'])[2]")WebElement thumbnailLnk; //image dowen show image
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']")WebElement PreviousButtonLnk;
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")WebElement nextButtonLnk;// ime close
	@FindBy(xpath="//button[@title='Close (Esc)']")WebElement CloseXLnk;
	
	@FindBy(xpath="//button[@id='button-cart']")WebElement AddToCartLnk;// use click the number of times
	
	@FindBy(xpath="(//button[@type='button'])[2]")WebElement BlackdropdownLnk; // ofter click the add to cart
	
	@FindBy(xpath="(//a[@href='https://demo.opencart.com/index.php?route=checkout/cart&language=en-gb'])[2]")WebElement ViewCartLnk;
	
	@FindBy(xpath="//button[text()='Estimate Shipping & Taxes']")WebElement EstimateShippingLnk;
	@FindBy(xpath="(//option[text()=' --- Please Select --- '])[1]")WebElement PleaseSelect1Lnk;
	@FindBy(xpath="//option[@value='99']")WebElement CountryLnk;
	@FindBy(xpath="(//option[text()=' --- Please Select --- '])[2]")WebElement PleaseSelect2Lnk;
	@FindBy(xpath="//option[@value='1476']")WebElement StateLnk;
	@FindBy(xpath="//input[@name='postcode']")WebElement postcodeLnk;
	@FindBy(xpath="//button[text()='Get Quotes']")WebElement GetQuotesLnk;
	
	@FindBy(xpath="//button[text()='Use Coupon Code']")WebElement UseCouponCodeLnk;
	@FindBy(xpath="//input[@name='coupon']") WebElement couponLnk;
	@FindBy(xpath="//button[text()='Apply Coupon']") WebElement ApplyCouponLnk;//
	
	@FindBy(xpath="//button[text()='Use Gift Certificate']")WebElement UseGiftCertificateLnk;
	@FindBy(xpath="//input[@name='voucher']") WebElement voucherLnk;
	@FindBy(xpath="//button[text()='Apply Gift Certificate']") WebElement ApplyGiftCertificateLnk;
	
	@FindBy(xpath="(//a[@href='https://demo.opencart.com/index.php?route=checkout/checkout&language=en-gb'])[2]")WebElement checkoutLnk;
	@FindBy(xpath="//input[@type='radio']")WebElement radioLnk;
	@FindBy(xpath="//input[@name='firstname']")WebElement firstnameLnk;
	@FindBy(xpath="//input[@name='lastname']")WebElement lastnameLnk;
	@FindBy(xpath="//input[@name='email']")WebElement emailLnk;
	@FindBy(xpath="//input[@name='payment_company']")WebElement payment_companyLnk;
	@FindBy(xpath="//input[@name='payment_address_1']")WebElement payment_address_1Lnk;
	@FindBy(xpath="//input[@name='payment_address_2']")WebElement payment_address_2Lnk;
	@FindBy(xpath="//input[@name='payment_city']")WebElement payment_cityLnk;
	@FindBy(xpath="//input[@name='payment_postcode']")WebElement payment_postcodeLnk;
	@FindBy(xpath="//option[text()=' --- Please Select --- ']")WebElement payment_CountryLnk;
	@FindBy(xpath="//option[@value='99']") WebElement Payment_indiaLnk;
	@FindBy(xpath="//select[@name='payment_zone_id']")WebElement payment_StateLnk;
	@FindBy(xpath="//option[@value='1476']")WebElement payment_State_CodeLnk;
	@FindBy(xpath="//input[@type='password']")WebElement payment_passwordLnk;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")WebElement checkbox1Lnk;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")WebElement checkbox2Lnk;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")WebElement checkbox3Lnk;
	@FindBy(xpath="//button[text()='Continue']")WebElement payment_ContinueLnk;
	//@FindBy(xpath="(//button[@type='button'])[6]")WebElement ConformOrderLnk;
	//@FindBy(xpath="(//a[@href='https://demo.opencart.com/index.php?route=common/home&language=en-gb'])[3]")WebElement ShoopingCortLnk;
	
	public  Camera(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickCameraOption() {
		cameraLnk.click();
	}
	public void ClickCanonOption() {
		canonLnk.click();
		
	}
	public void ClickNikonOption() {
		NikonLnk.click();
		
	}
	public void ClickCanonProductCompareOption() {
		CanonProductCompareLnk.click();
	}
	public void ClickNikonProductCompareOption() {
		NikonProductCompareLnk.click();
		   
	}
	public void ClickProductCompareOption() {
		ProductCompareLnk.click();
		
	}
	public void ClickReviewsOption() {
		ReviewsLnk.click();
		
	}
	public void Clicktextarea1Option() {
		textarea1Lnk.sendKeys("rajagopal");
		
	}
	public void Clicktextarea2Option() {
		textarea2Lnk.sendKeys("Address");
		
	}
	public void ClickRatingButtonOption() {
		RatingButtonLnk.click();
		
	}
	public void ClickContinueOption() {
		ContinueLnk.click();
		
	}
	public void ClickListButtonOption() {
		ListButtonLnk.click();
	}
	public void ClickgridButtonOption() {
		gridButtonLnk.click();
	}
	public void ClickthumbnailOption() {
		thumbnailLnk.click();
		
	}
	public void ClickPreviousButtonOption() {
		PreviousButtonLnk.click();
		
	}
	public void ClicknextButtonOption() {
		nextButtonLnk.click();
		
	}
	public void ClickCloseXOption() {
		CloseXLnk.click();
		
	}
	public void ClickAddToCartOption() {
		AddToCartLnk.click();
		
	}
	public void ClickBlackdropdownOption() {
		BlackdropdownLnk.click();
		
	}
	public void ClickViewCartOption() {
		ViewCartLnk.click();
	}
	public void ClickEstimateShippingOption() {
		EstimateShippingLnk.click();
		ViewCartLnk.click();
		PleaseSelect1Lnk.click();
		CountryLnk.click();
		PleaseSelect2Lnk.click();
		StateLnk.click();
		postcodeLnk.click();
		GetQuotesLnk.click();
	}
	public void ClickCouponCodeOption() {
		UseCouponCodeLnk.click();
		couponLnk.sendKeys("very good");
		ApplyCouponLnk.click();
	}
	public void ClickUseGiftCertificateOption() {
		UseGiftCertificateLnk.click();
		voucherLnk.click();
		ApplyGiftCertificateLnk.click();
			}

	public void ClickCheckoutOption() {
		checkoutLnk.click();
		radioLnk.click();
		firstnameLnk.sendKeys("raja");
		lastnameLnk.sendKeys("gopal ");
		emailLnk.sendKeys("rajagopal@gmail.com");
		payment_companyLnk.sendKeys(" TQ softweare ");
		payment_address_1Lnk.sendKeys("Engineered with pro-level features and performance, nce combined with agility.\r\n ");
		payment_address_2Lnk.sendKeys("Engineered with pro-level features and performance, nce combined with agility.\\r\\n");
		payment_cityLnk.sendKeys("vijayawada");
		payment_postcodeLnk.sendKeys("245876");
		payment_CountryLnk.click();
		Payment_indiaLnk.click();
		payment_StateLnk.click();
		payment_State_CodeLnk.click();
		payment_passwordLnk.sendKeys("hasd54 ");
		checkbox1Lnk.click();
		checkbox2Lnk.click();
		checkbox3Lnk.click();
		payment_ContinueLnk.click();
		
		
			}
	
}
