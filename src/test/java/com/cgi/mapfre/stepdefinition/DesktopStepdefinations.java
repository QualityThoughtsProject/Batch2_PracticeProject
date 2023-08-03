package com.cgi.mapfre.stepdefinition;



import com.cgi.mapfre.Property.pom.DesktopsFindPaths;
import com.cgi.mapfre.framework.DriverFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopStepdefinations {
	@Given("User Launch The Application")
	public void user_launch_the_application() {
	    DriverFactory.driverInit("browser");
	}

	@When("User Identify the Desktops Option")
	public void user_identify_the_desktops_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickPCoption();
	}

	@Then("User is Able to See the Desktops Option")
	public void user_is_able_to_see_the_desktops_option() {
		DriverFactory.closeDriver();
	   
	}


	@When("User select the PC Option")
	public void user_select_the_pc_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickPCoption();
	}

	@Then("User is able to see the PC Page")
	public void user_is_able_to_see_the_pc_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("User select the MAC Option")
	public void user_select_the_mac_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickMacOption();
	    
	}

	@Then("User is able to see the MAC Page")
	public void user_is_able_to_see_the_mac_page() {
		DriverFactory.closeDriver();
	}

	@When("User select  iMac from MAC Option")
	public void user_select_i_mac_from_mac_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickMacOption();
		page.clickiMacOption();
	    
	}

	@Then("User is able to see the iMac Page")
	public void user_is_able_to_see_the_i_mac_page() {
	    DriverFactory.closeDriver();
	}

	@When("User select the Show All Desktops from Desktops Option")
	public void user_select_the_show_all_desktops_from_desktops_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
	}

	@Then("User is able to see the Desktops Page")
	public void user_is_able_to_see_the_desktops_page() {
		DriverFactory.closeDriver();
	}

	@When("select on the List Option")
	public void select_on_the_list_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickListOption();
	   
	}

	@Then("Products should be displayed in LIST format")
	public void products_should_be_displayed_in_list_format() {
		DriverFactory.closeDriver();
	    
	}

	@When("select on the Grid Option")
	public void select_on_the_grid_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickGridOption();
	   
	}

	@Then("Products should be displayed in Grid Format")
	public void products_should_be_displayed_in_grid_format() {
		DriverFactory.closeDriver();
	   
	}

	@When("Select the Name \\(A - Z)  Option from Sort By")
	public void select_the_name_a_z_option_from_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickAtoZmodelOption(null);
	    
	}

	@Then("User is able to sort based on Name \\(A - Z)")
	public void user_is_able_to_sort_based_on_name_a_z() {
		DriverFactory.closeDriver();
	}

	@When("select the Name \\(Z - A) Option from the sort By")
	public void select_the_name_z_a_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickNameZtoAOption(null);
	 
	}

	@Then("User is able to sort based on Name \\(Z - A)")
	public void user_is_able_to_sort_based_on_name_z_a() {
		DriverFactory.closeDriver();
	}

	@When("Select the Price \\(Low > High) Option from the Sort By")
	public void select_the_price_low_high_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.LowtoHeighOption(null);
	    
	}

	@Then("User is able to sort based on Price \\(Low > High)")
	public void user_is_able_to_sort_based_on_price_low_high() {
		DriverFactory.closeDriver();
	}

	@When("Select the Price \\(High > Low) Option from the Sort By")
	public void select_the_price_high_low_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HightolowOption(null);
	    
	}

	@Then("User is able to sort based on Price \\(High > Low)")
	public void user_is_able_to_sort_based_on_price_high_low() {
		DriverFactory.closeDriver();
	}

	@When("Select the Rating \\(Highest) Option from the sort By")
	public void select_the_rating_highest_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickRatingHigstOption(null);
	    
	}

	@Then("User is able to sort based on Rating \\(Highest)")
	public void user_is_able_to_sort_based_on_rating_highest() {
		DriverFactory.closeDriver();
	    
	}

	@When("Select the Rating \\(Lowest) Option from the Sort By")
	public void select_the_rating_lowest_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickLowestOption(null);
	    
	}

	@Then("User is able to sort based on Rating \\(Lowest)")
	public void user_is_able_to_sort_based_on_rating_lowest() {
		DriverFactory.closeDriver();
	   
	}

	@When("Select the Model \\(A - Z) Option from the sort By")
	public void select_the_model_a_z_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickAtoZmodelOption(null);
	    
	}

	@Then("User is able to sort based on Model \\(A - Z)")
	public void user_is_able_to_sort_based_on_model_a_z() {
		DriverFactory.closeDriver();
	}

	@When("Select the Model \\(Z - A) Option from Sort By")
	public void select_the_model_z_a_option_from_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickZtomodelAOption(null);
	    
	}

	@Then("User is able to Sort based on Model \\(Z - A)")
	public void user_is_able_to_sort_based_on_model_z_a() {
		DriverFactory.closeDriver();
	}

	@When("select {int} from the Show dropdown")
	public void select_from_the_show_dropdown1(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickvalue10option(0);
	   
	}

	@Then("User is able to see {int} products")
	public void user_is_able_to_see_products1(Integer int1) {
		DriverFactory.closeDriver();
	}

	@When("Select {int} from the Show Dropdown")
	public void select_from_the_show_dropdown3(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickvalue25option(0);
	   
	}

	@When("Select {int} from the show Dropdown")
	public void select_from_the_show_dropdown4(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickvalue50option(0);
	   
	}

	@When("Select {int} from the show dropdown")
	public void select_from_the_show_dropdown(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickvalue75option(0);
	}
	

	@When("select  Apple Cinema {int}&quot Button")
	public void select_apple_cinema_quot_button(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.applecinimaoption();
	    
	}

	@Then("User is able to see the Apple Cinema {int}&quot Page")
	public void user_is_able_to_see_the_apple_cinema_quot_page(Integer int1) {
	    DriverFactory.closeDriver();
	}

	@When("select Canon EOS 5D Option")
	public void select_canon_eos_5d_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.CanonEOSoption();
	    
	}

	@Then("User is able to see the Canon EOS 5D Page")
	public void user_is_able_to_see_the_canon_eos_5d_page() {
	    DriverFactory.closeDriver();
	}

	@When("select HP LP3065 Option")
	public void select_hp_lp3065_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HPLP3Option();
	    
	}

	@Then("User is able to see the HP LP3065 Page")
	public void user_is_able_to_see_the_hp_lp3065_page() {
		DriverFactory.closeDriver();
	}

	@When("select HTC Touch HD Option")
	public void select_htc_touch_hd_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HTCTouchOption();
	   
	}

	@Then("User is able to see the HTC Touch HD Page")
	public void user_is_able_to_see_the_htc_touch_hd_page() {
		DriverFactory.closeDriver();
	    
	}

	@When("select  iPhone Option")
	public void select_i_phone_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.iPadClassisoption();
	    
	}

	@Then("User is able to see the iPhone Page")
	public void user_is_able_to_see_the_i_phone_page() {
		DriverFactory.closeDriver();
	}

	@When("select on the iPod Classic Option")
	public void select_on_the_i_pod_classic_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.iPadClassisoption();
	    
	}

	@Then("User is able to see the iPod Classic Page")
	public void user_is_able_to_see_the_i_pod_classic_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("select on the MacBook Option")
	public void select_on_the_mac_book_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.MacBookClickOption();
	}

	@Then("User is able to see the MacBook Page")
	public void user_is_able_to_see_the_mac_book_page() {
		DriverFactory.closeDriver();
	}

	@When("select on the MacBook Air Option")
	public void select_on_the_mac_book_air_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.MacbookAiroption();
	}

	@Then("User is able to see the MacBook Air Page")
	public void user_is_able_to_see_the_mac_book_air_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("select on the Palm Treo Pro Air Option")
	public void select_on_the_palm_treo_pro_air_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.PlamtreProOption();
	}

	@Then("User is able to see the Palm Treo Pro Page")
	public void user_is_able_to_see_the_palm_treo_pro_page() {
		DriverFactory.closeDriver();
	    
	}

	@When("select on the Product {int} Option")
	public void select_on_the_product_option(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.Product8Option();
	}

	@Then("User is able to see the Product {int} Page")
	public void user_is_able_to_see_the_product_page(Integer int1) {
		DriverFactory.closeDriver();
	}

	@When("select on the Samsung SyncMaster 941BW Option")
	public void select_on_the_samsung_sync_master_941bw_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.SamsungSyncMasterOption();

	}

	@Then("User is able to see the Samsung SyncMaster 941BW Page")
	public void user_is_able_to_see_the_samsung_sync_master_941bw_page() {
		DriverFactory.closeDriver();
	}

	@When("select on the Sony VAIO Option")
	public void select_on_the_sony_vaio_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		page.clickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.SonyVaioOption();
	   
	}

	@Then("User is able to see the Sony VAIO Page")
	public void user_is_able_to_see_the_sony_vaio_page() {
		DriverFactory.closeDriver();
	   
	}



}
