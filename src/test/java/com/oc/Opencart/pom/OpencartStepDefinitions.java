package com.oc.Opencart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;

public class OpencartStepDefinitions {
	WebDriver driver;

	@FindBy(xpath = "//*[text()='Laptops & Notebooks']")
	WebElement laptopslink;
	@FindBy(xpath = "//*[text()='Show All Laptops & Notebooks']")
	WebElement Showalllink;
	@FindBy(xpath = "//*[text()='Macs (0)']")
	WebElement maclink;
	@FindBy(xpath = "//*[text()='Continue']")
	WebElement macContinuelink;
	@FindBy(xpath = "//*[text()='Windows (0)']")
	WebElement Windowslink;
	@FindBy(xpath = "//*[text()='Continue']]")
	WebElement windowscontinuelink;
	@FindBy(xpath = "//a[@id='compare-total']")
	WebElement comparelink;
	@FindBy(xpath = "//i[@class='fas fa-th-list']")
	WebElement listlink;
	@FindBy(xpath = "//button[@id='button-grid']")
	WebElement gridlink;
	@FindBy(xpath = "//select[@id='input-sort']")
	WebElement sortbylink;
	@FindBy(xpath = "//select[@id='input-limit']")
	WebElement valuelink;
	@FindBy(xpath = "//*[text()='HP LP3065']")
	WebElement hp3065link;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement addtocartlink;
	@FindBy(xpath = "(//button[@aria-label='Add to Wish List'])[1]")
	WebElement whishlistlink;
	@FindBy(xpath = "//a[@id='description-tab']")
	WebElement descriptionlink;
	@FindBy(xpath = "//a[@id='specification-tab']")
	WebElement specificationlink;
	@FindBy(xpath = "//a[@id='review-tab']")
	WebElement reviewlink;
	@FindBy(xpath = "//i[@class='fas fa-calendar']")
	WebElement deliverylink;
	@FindBy(xpath = "//*[text()='MacBook']")
	WebElement macbooklink;
	@FindBy(xpath = "(//img[@title='MacBook'])[1]")
	WebElement topviewlink;

	public OpencartStepDefinitions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LaptopsNotebooks() {
		CommonDef.click(laptopslink);
	}

	public void Showalllaptops() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
	}

	public void Mac() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(maclink);
	}

	public void Maccontinue() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(maclink);
	}

	public void Window() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(Windowslink);
	}

	public void Windowscontinue() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(Windowslink);
	}

	public void Compare() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(comparelink);
	}

	public void List() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(listlink);
	}

	public void Grid() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(gridlink);
	}

	public void sortby() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(sortbylink);
	}

	public void Value() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(valuelink);
	}

	public void Hp3065() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(hp3065link);
	}

	public void Addtocart() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(hp3065link);
		CommonDef.click(addtocartlink);

	}
	public void Addtowhishlist() {
		CommonDef.click(laptopslink);
		CommonDef.click(Showalllink);
		CommonDef.click(hp3065link);
		CommonDef.click(whishlistlink);
	}
public void Description() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(hp3065link);
	CommonDef.click(descriptionlink);
}
public void Specification() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(hp3065link);
	CommonDef.click(specificationlink);
}
public void Review() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(hp3065link);
	CommonDef.click(reviewlink);
}
public void Delivery() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(hp3065link);
	CommonDef.click(deliverylink);
}
public void Macbook() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(macbooklink);
}
public void Topview() {
	CommonDef.click(laptopslink);
	CommonDef.click(Showalllink);
	CommonDef.click(macbooklink);
	CommonDef.click(topviewlink);
}
}


