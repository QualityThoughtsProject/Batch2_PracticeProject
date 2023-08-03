package com.cgi.mapfre.stepdefinition;




import org.openqa.selenium.WebDriver;

import com.cgi.mapfre.framework.DriverFactory;

import Tablets.Tabletspage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tabletes {
	WebDriver driver;
	@Given("User launch the application")
	public void user_launch_the_application() {
		DriverFactory.driverInit("browser");
	}

	@When("User select the Tablets option")
	public void user_select_the_tablets_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
	
	}

	@Then("All tablets products is displayed")
	public void all_tablets_products_is_displayed() {
		System.out.println("tablets products is displayed");
		DriverFactory.closeDriver();
	   	}

	@When("User select the Product compare option")
	public void user_select_the_product_compare_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickProductCompareResulti();

	}

	@Then("All tablets product compare is displayed")
	public void all_tablets_product_compare_is_displayed() {
	DriverFactory.closeDriver();
        
	}

	@When("User select the List option")
	public void user_select_the_list_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
        page.clickTabletsoption();
        page.clickListResulti();
	}

	@Then("All List products is displayed")
	public void all_list_products_is_displayed() {
        DriverFactory.closeDriver();
	}

	@When("User select the Grid option")
	public void user_select_the_grid_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickGridResulti();

	    }

	@Then("All Grid products is displayed")
	public void all_grid_products_is_displayed() {
		DriverFactory.closeDriver();
	    	}

	@When("User select the Sort by option")
	public void user_select_the_sort_by_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clicksortbyResulti();
	}

	@Then("All Sort by options is displayed")
	public void all_sort_by_options_is_displayed() {
	    DriverFactory.closeDriver();
	}

	@When("User select the Show option")
	public void user_select_the_show_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickshowResulti();
	   	}

	@Then("All Show options is displayed")
	public void all_show_options_is_displayed() {

	  DriverFactory.closeDriver();
	}

	@When("User select the Samsung Galxy Tab {double}")
	public void user_select_the_samsung_galxy_tab(Double double1) {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clicksamsunggalaxytab();
	   	}

	@Then("All Samsung Galxy Tab {double} products is displayed")
	public void all_samsung_galxy_tab_products_is_displayed(Double double1) {
	    DriverFactory.closeDriver();
	}

	@When("User select the Add cart option")
	public void user_select_the_add_cart_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickAddtocartResulti();
	}

	@Then("All Add cart products is displayed")
	public void all_add_cart_products_is_displayed() {
		DriverFactory.closeDriver();
	    	}

	@When("User select the Add wish list option")
	public void user_select_the_add_wish_list_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickAddtowishlistResulti();
	   
	}

	@Then("All Add wish list products is displayed")
	public void all_add_wish_list_products_is_displayed() {
	   DriverFactory.closeDriver();
	}

	@When("User select the Comper this products option")
	public void user_select_the_comper_this_products_option() {
		Tabletspage page = new Tabletspage(DriverFactory.getCurrentDriver());
		page.clickTabletsoption();
		page.clickComparethisproductResulti();

	}

	@Then("All Comper this products detels is displayed")
	public void all_comper_this_products_detels_is_displayed() {
		DriverFactory.closeDriver();
	   	}



}
