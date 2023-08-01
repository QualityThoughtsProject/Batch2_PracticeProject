package com.cgi.mapfre.stepdefinition;

import com.cgi.mapfre.Lobs.PropertyHelper;
import com.cgi.mapfre.Property.pom.PhonesApplication;
import com.cgi.mapfre.framework.DriverFactory;

import io.cucumber.java8.En;

public class PhonesStepsDef implements En  {

	PhonesStepsDef help=new PhonesStepsDef();
	 
	public 	PhonesStepsDef(){
	
	 Given("User Launch the Application", () -> {
		    DriverFactory.driverInit("browser");
		});

		When("User select the Phones & PDAs feature", () -> {
			PhonesApplication main = new PhonesApplication(DriverFactory.getCurrentDriver());
			main.clickPhonesOption("option");
		});

		Then("Phones Should be displayed", () -> {
			PhonesApplication main = new PhonesApplication(DriverFactory.getCurrentDriver());
			main.verifyPhonesResults();
			DriverFactory.closeDriver();
		});

		When("User select the Phones & PDAs\\(Htc) from the menu", () -> {
			PhonesApplication htc = new PhonesApplication(DriverFactory.getCurrentDriver());
			htc.clickHtcOption("option");
		});

		Then("HTC Touch HD phone Should be displayed", () -> {
			PhonesApplication htc = new PhonesApplication(DriverFactory.getCurrentDriver());
			htc.verifyHtcResults();
			DriverFactory.closeDriver();
		});

		When("User select the Phones & PDAs\\(iphone) from the menu", () -> {
			PhonesApplication iphone = new PhonesApplication(DriverFactory.getCurrentDriver());
			iphone.clickiphoneOption("option");
		});

		Then("iphone Should be displayed", () -> {
			PhonesApplication iphone = new PhonesApplication(DriverFactory.getCurrentDriver());
			iphone.verifyiphoneResults();
			DriverFactory.closeDriver();
		});

		When("User select the Phones & PDAs\\(plam)  from the menu", () -> {
			PhonesApplication plam = new PhonesApplication(DriverFactory.getCurrentDriver());
			plam.clickPlamOption("option");
		});

		Then("Palm Treo Pro Should be displayed", () -> {
			PhonesApplication plam = new PhonesApplication(DriverFactory.getCurrentDriver());
			plam.verifyPlamResults();
			DriverFactory.closeDriver();
		});

		When("User select the Product Comparison option", () -> {
			PhonesApplication product = new PhonesApplication(DriverFactory.getCurrentDriver());
			product.clickProductOption("option");
		});

		Then("Product Compare Should be displayed", () -> {
			PhonesApplication product = new PhonesApplication(DriverFactory.getCurrentDriver());
			product.verifyProductResults();
			DriverFactory.closeDriver();
		});

		When("User select the List option", () -> {
			PhonesApplication list = new PhonesApplication(DriverFactory.getCurrentDriver());
			list.clickListOption("option");
		});

		Then("Phones Should be displayed in list method", () -> {
			PhonesApplication list = new PhonesApplication(DriverFactory.getCurrentDriver());
			list.verifyListResults();
			DriverFactory.closeDriver();
		});

		When("User select the grid option", () -> {
			PhonesApplication grid = new PhonesApplication(DriverFactory.getCurrentDriver());
			grid.clickGridOption("option");
		});

		Then("Phones Should be displayed in grid method", () -> {
			PhonesApplication grid = new PhonesApplication(DriverFactory.getCurrentDriver());
			grid.verifyGridResults();
			DriverFactory.closeDriver();
		});

		When("User select the Add To Cart option for HTC phone", () -> {
			PhonesApplication cart = new PhonesApplication(DriverFactory.getCurrentDriver());
			cart.clickcartOption("option");
		});

		Then("Cart Scucess message Should be displayed", () -> {
			PhonesApplication cart = new PhonesApplication(DriverFactory.getCurrentDriver());
			cart.verifycartResults();
			DriverFactory.closeDriver();
		});

		When("User select the Wishlist option for HTC phone", () -> {
			PhonesApplication wishlist = new PhonesApplication(DriverFactory.getCurrentDriver());
			wishlist.clickwishListOption("option");
		});

		Then("WishList Scucess message Should be displayed", () -> {
			PhonesApplication wishlist = new PhonesApplication(DriverFactory.getCurrentDriver());
			wishlist.verifycartResults();
			DriverFactory.closeDriver();
		});

		When("User select the Exechange Alert option for HTC phone", () -> {
			PhonesApplication alert = new PhonesApplication(DriverFactory.getCurrentDriver());
			alert.clickExchangeOption("option");
		});

		Then("Exechange Scucess message Should be displayed", () -> {
			PhonesApplication alert = new PhonesApplication(DriverFactory.getCurrentDriver());
			alert.verifyExchangeResults();
			DriverFactory.closeDriver();
		});

		When("User select the SortBy option", () -> {
			PhonesApplication sort = new PhonesApplication(DriverFactory.getCurrentDriver());
			sort.clickSortOption("option");
		});

		Then("sorting should be happen", () -> {
			PhonesApplication sort = new PhonesApplication(DriverFactory.getCurrentDriver());
			sort.verifySortResults();
			DriverFactory.closeDriver();
		});

		When("User select the Dropdown option", () -> {
			PhonesApplication Default = new PhonesApplication(DriverFactory.getCurrentDriver());
			Default.clickDefaultOption(null, "option");
		});

		Then("Default value should be displayed", () -> {
			PhonesApplication Default = new PhonesApplication(DriverFactory.getCurrentDriver());
			Default.verifyDefaultResults();
			DriverFactory.closeDriver();
		});

		When("User select the Name\\(A - Z) value in Dropdown option", () -> {
			PhonesApplication name = new PhonesApplication(DriverFactory.getCurrentDriver());
			name.clickAtoZOption(null, "option");
		});

		Then("Name \\(A - Z) value should be displayed", () -> {
			PhonesApplication name = new PhonesApplication(DriverFactory.getCurrentDriver());
			name.verifyAtoZResults();
			DriverFactory.closeDriver();
		});

		When("User select the Name\\(Z-A) value in Dropdown option", () -> {
			PhonesApplication nameza = new PhonesApplication(DriverFactory.getCurrentDriver());
			nameza.clickZtoAOption("Name (Z - A)");
		});

		Then("Name \\(Z - A) value should be displayed", () -> {
			PhonesApplication nameza = new PhonesApplication(DriverFactory.getCurrentDriver());
			nameza.verifyZtoAResults();
			DriverFactory.closeDriver();
		});

		When("User select the  Price\\(Low>High) value in Dropdown option", () -> {
			PhonesApplication Pricelow = new PhonesApplication(DriverFactory.getCurrentDriver());
			Pricelow.clickPriceLowOption(null, "option");
		});

		Then("Price \\(Low > High) value should be displayed", () -> {
			PhonesApplication Pricelow = new PhonesApplication(DriverFactory.getCurrentDriver());
			Pricelow.verifyPriceLowResults();
			DriverFactory.closeDriver();
		});

		When("User select the Price\\(High>Low) value in Dropdown option", () -> {
			PhonesApplication Pricehigh = new PhonesApplication(DriverFactory.getCurrentDriver());
			Pricehigh.clickPriceHighOption(null, "option");
		});

		Then("Price \\(High > Low) value should be displayed", () -> {
			PhonesApplication Pricehigh = new PhonesApplication(DriverFactory.getCurrentDriver());
			Pricehigh.verifyPriceHighResults();
			DriverFactory.closeDriver();
		});

		When("User select the Rating\\(Highest) value in Dropdown option", () -> {
			PhonesApplication ratinghigh = new PhonesApplication(DriverFactory.getCurrentDriver());
			ratinghigh.clickRateHighOption(null, "option");
		});

		Then("Rating \\(Highest) value should be displayed", () -> {
			PhonesApplication ratinghigh = new PhonesApplication(DriverFactory.getCurrentDriver());
			ratinghigh.verifyRateHighResults();
			DriverFactory.closeDriver();
		});

		When("User select the Rating\\(Lowest) value in Dropdown option", () -> {
			PhonesApplication ratinglow = new PhonesApplication(DriverFactory.getCurrentDriver());
			ratinglow.clickRateLowOption(null, "option");
		});

		Then("Rating \\(Lowest) value should be displayed", () -> {
			PhonesApplication ratinglow = new PhonesApplication(DriverFactory.getCurrentDriver());
			ratinglow.verifyRateLowResults();
			DriverFactory.closeDriver();
		});

		When("User select the  Model\\(A - Z) value in Dropdown option", () -> {
			PhonesApplication model = new PhonesApplication(DriverFactory.getCurrentDriver());
			model.clickModelOption(null, "option");
		});

		Then("Model \\(A - Z) value should be displayed", () -> {
			PhonesApplication model = new PhonesApplication(DriverFactory.getCurrentDriver());
			model.verifyAtoZResults();
			DriverFactory.closeDriver();
		});

		When("User select the Model\\(Z - A) value in Dropdown option", () -> {
			PhonesApplication modelz = new PhonesApplication(DriverFactory.getCurrentDriver());
			modelz.clickModelZOption(null, "option");
		});

		Then("Model \\(Z - A) value should be displayed", () -> {
			PhonesApplication modelz = new PhonesApplication(DriverFactory.getCurrentDriver());
			modelz.verifyModelZResults();
			DriverFactory.closeDriver();
		});

		When("User select the Show option", () -> {
			PhonesApplication show = new PhonesApplication(DriverFactory.getCurrentDriver());
			show.clickShowOption("option");
		});

		Then("value should be displayed", () -> {
			PhonesApplication show = new PhonesApplication(DriverFactory.getCurrentDriver());
			show.verifyShowResults();
			DriverFactory.closeDriver();
		});

		When("User select the value Ten in Dropdown option", () -> {
			PhonesApplication ten = new PhonesApplication(DriverFactory.getCurrentDriver());
			ten.clickTenOption(null, "option");
		});

		Then("Ten should be displayed", () -> {
			PhonesApplication ten = new PhonesApplication(DriverFactory.getCurrentDriver());
			ten.verifyTenResults();
			DriverFactory.closeDriver();
		});

		When("User select the value TwentyFive in Dropdown option", () -> {
			PhonesApplication twenty = new PhonesApplication(DriverFactory.getCurrentDriver());
			twenty.clickTwentyOption(null, "option");
		});

		Then("TwentyFive should be displayed", () -> {
			PhonesApplication twenty = new PhonesApplication(DriverFactory.getCurrentDriver());
			twenty.verifyTwentyResults();
			DriverFactory.closeDriver();
		});

		When("User select the value FIfty in Dropdown option", () -> {
			PhonesApplication FIfty = new PhonesApplication(DriverFactory.getCurrentDriver());
			FIfty.clickFiftyOption(null, "option");
		});

		Then("FIfty should be displayed", () -> {
			PhonesApplication FIfty = new PhonesApplication(DriverFactory.getCurrentDriver());
			FIfty.verifyFiftyResults();
			DriverFactory.closeDriver();
		});

		When("User select the value Seventyfive in Dropdown option", () -> {
			PhonesApplication Seventyfive = new PhonesApplication(DriverFactory.getCurrentDriver());
			Seventyfive.clickSeventyOption(null, "option");
		});

		Then("Seventyfive should be displayed", () -> {
			PhonesApplication Seventyfive = new PhonesApplication(DriverFactory.getCurrentDriver());
			Seventyfive.verifyFiftyResults();
			DriverFactory.closeDriver();
		});

		When("User select the value Hundred in Dropdown option", () -> {
			PhonesApplication Hundred = new PhonesApplication(DriverFactory.getCurrentDriver());
			Hundred.clickHundredOption(null, "option");
		});

		Then("Hundred should be displayed", () -> {
			PhonesApplication Hundred = new PhonesApplication(DriverFactory.getCurrentDriver());
			Hundred.verifyHundredResults();
			DriverFactory.closeDriver();
		});



	
	}

}
