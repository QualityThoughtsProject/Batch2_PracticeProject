package com.cgi.mapfre.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.cgi.mapfre.Property.pom.DesktopsFindPaths;
import com.cgi.mapfre.framework.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopsSteps {
	WebDriver driver;

@Given("User Launch The Application")
public void user_launch_the_application() {
    DriverFactory.driverInit("CHROME");
}

@When("User Identify the Desktops {string}")
public void user_identify_the_desktops(String Option) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption(Option);
	
    }

@Then("User is Able to See the Desktops Option")
public void user_is_able_to_see_the_desktops_option() {
    DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
    menupage.validateDesktopcount();
    DriverFactory.closeDriver();
}

@When("User Select the iMac from MAC Option")
public void user_select_the_i_mac_from_mac_option(String Option) {
DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
menupage.addProductToCart(Option);
    
}

@Then("User is able to see the iMac Page")
public void user_is_able_to_see_the_i_mac_page() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.addiMacProduct();
	DriverFactory.closeDriver();
}

@When("User search for the desktops products")
public void user_search_for_the_desktops_products() {
   DriverFactory.driverInit("CHROME");
}

@When("User sort with {string}")
public void user_sort_with(String sortByDropDown) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.sortTheItems();
    menupage.showTheItems();
}

@Then("User is able to sort the products")
public void user_is_able_to_sort_the_products() {
	DriverFactory.closeDriver();
   
}

@When("User search for the {string}\" from Show All Desktop")
public void user_search_for_the_from_show_all_desktop(String Option) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.selectProduct(Option);
}
@Then("User is able to Search the products List")
public void user_is_able_to_search_the_products_list() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.verifyTheProducts();
	DriverFactory.closeDriver();
    
}

}
