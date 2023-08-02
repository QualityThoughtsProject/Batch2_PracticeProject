package com.cgi.mapfre.stepdefinition;

import com.cgi.mapfre.Property.pom.DesktopsFindPaths;
import com.cgi.mapfre.framework.DesktopMainClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopStepdefinations {
	@Given("User Launch The Application")
	public void user_launch_the_application() {
	    DesktopMainClass.LaunchBrowser();
	}

	@When("User Identify the Desktops Option")
	public void user_identify_the_desktops_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
	}

	@Then("User is Able to See the Desktops Option")
	public void user_is_able_to_see_the_desktops_option() {
	   DesktopMainClass.closeDriver();
	}


	@When("User select the PC Option")
	public void user_select_the_pc_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickPCoption();
	}

	@Then("User is able to see the PC Page")
	public void user_is_able_to_see_the_pc_page() {
		DesktopMainClass.closeDriver();
	   
	}

	@When("User select the MAC Option")
	public void user_select_the_mac_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickMacOption();
	    
	}

	@Then("User is able to see the MAC Page")
	public void user_is_able_to_see_the_mac_page() {
		DesktopMainClass.closeDriver();
	}

	@When("User select  iMac from MAC Option")
	public void user_select_i_mac_from_mac_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickMacOption();
		page.clickiMacOption();
	    
	}

	@Then("User is able to see the iMac Page")
	public void user_is_able_to_see_the_i_mac_page() {
	    DesktopMainClass.closeDriver();
	}

	@When("User select the Show All Desktops from Desktops Option")
	public void user_select_the_show_all_desktops_from_desktops_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
	}

	@Then("User is able to see the Desktops Page")
	public void user_is_able_to_see_the_desktops_page() {
		DesktopMainClass.closeDriver();
	}

	@When("select on the List Option")
	public void select_on_the_list_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickListOption();
	   
	}

	@Then("Products should be displayed in LIST format")
	public void products_should_be_displayed_in_list_format() {
		DesktopMainClass.closeDriver();
	    
	}

	@When("select on the Grid Option")
	public void select_on_the_grid_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickGridOption();
	   
	}

	@Then("Products should be displayed in Grid Format")
	public void products_should_be_displayed_in_grid_format() {
		DesktopMainClass.closeDriver();
	   
	}

	@When("Select the Name \\(A - Z)  Option from Sort By")
	public void select_the_name_a_z_option_from_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickNameAtoZOption();
	    
	}

	@Then("User is able to sort based on Name \\(A - Z)")
	public void user_is_able_to_sort_based_on_name_a_z() {
		DesktopMainClass.closeDriver();
	}

	@When("select the Name \\(Z - A) Option from the sort By")
	public void select_the_name_z_a_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickNameZtoAOption();
	 
	}

	@Then("User is able to sort based on Name \\(Z - A)")
	public void user_is_able_to_sort_based_on_name_z_a() {
		DesktopMainClass.closeDriver();
	}

	@When("Select the Price \\(Low > High) Option from the Sort By")
	public void select_the_price_low_high_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.LowtoHeighOption();
	    
	}

	@Then("User is able to sort based on Price \\(Low > High)")
	public void user_is_able_to_sort_based_on_price_low_high() {
		DesktopMainClass.closeDriver();
	}

	@When("Select the Price \\(High > Low) Option from the Sort By")
	public void select_the_price_high_low_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HightolowOption();
	    
	}

	@Then("User is able to sort based on Price \\(High > Low)")
	public void user_is_able_to_sort_based_on_price_high_low() {
		DesktopMainClass.closeDriver();
	}

	@When("Select the Rating \\(Highest) Option from the sort By")
	public void select_the_rating_highest_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickRatingHigstOption();
	    
	}

	@Then("User is able to sort based on Rating \\(Highest)")
	public void user_is_able_to_sort_based_on_rating_highest() {
		DesktopMainClass.closeDriver();
	    
	}

	@When("Select the Rating \\(Lowest) Option from the Sort By")
	public void select_the_rating_lowest_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickLowestOption();
	    
	}

	@Then("User is able to sort based on Rating \\(Lowest)")
	public void user_is_able_to_sort_based_on_rating_lowest() {
		DesktopMainClass.closeDriver();
	   
	}

	@When("Select the Model \\(A - Z) Option from the sort By")
	public void select_the_model_a_z_option_from_the_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickAtoZmodelOption();
	    
	}

	@Then("User is able to sort based on Model \\(A - Z)")
	public void user_is_able_to_sort_based_on_model_a_z() {
		DesktopMainClass.closeDriver();
	}

	@When("Select the Model \\(Z - A) Option from Sort By")
	public void select_the_model_z_a_option_from_sort_by() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.clickZtomodelAOption();
	    
	}

	@Then("User is able to Sort based on Model \\(Z - A)")
	public void user_is_able_to_sort_based_on_model_z_a() {
		DesktopMainClass.closeDriver();
	}

	@When("select {int} from the Show dropdown")
	public void select_from_the_show_dropdown2(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is able to see {int} products")
	public void user_is_able_to_see_products(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select {int} from the Show Dropdown")
	public void select_from_the_show_dropdown1(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select {int} from the show Dropdown")
	public void select_from_the_show_dropdown4(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select {int} from the show dropdown")
	public void select_from_the_show_dropdown(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("select  Apple Cinema {int}&quot Button")
	public void select_apple_cinema_quot_button(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.applecinimaoption();
	    
	}

	@Then("User is able to see the Apple Cinema {int}&quot Page")
	public void user_is_able_to_see_the_apple_cinema_quot_page(Integer int1) {
	    DesktopMainClass.closeDriver();
	}

	@When("select Canon EOS 5D Option")
	public void select_canon_eos_5d_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.CanonEOSoption();
	    
	}

	@Then("User is able to see the Canon EOS 5D Page")
	public void user_is_able_to_see_the_canon_eos_5d_page() {
	    DesktopMainClass.closeDriver();
	}

	@When("select HP LP3065 Option")
	public void select_hp_lp3065_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HPLP3Option();
	    
	}

	@Then("User is able to see the HP LP3065 Page")
	public void user_is_able_to_see_the_hp_lp3065_page() {
		DesktopMainClass.closeDriver();
	}

	@When("select HTC Touch HD Option")
	public void select_htc_touch_hd_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.HTCTouchOption();
	   
	}

	@Then("User is able to see the HTC Touch HD Page")
	public void user_is_able_to_see_the_htc_touch_hd_page() {
		DesktopMainClass.closeDriver();
	    
	}

	@When("select  iPhone Option")
	public void select_i_phone_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.iPadClassisoption();
	    
	}

	@Then("User is able to see the iPhone Page")
	public void user_is_able_to_see_the_i_phone_page() {
		DesktopMainClass.closeDriver();
	}

	@When("select on the iPod Classic Option")
	public void select_on_the_i_pod_classic_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.iPadClassisoption();
	    
	}

	@Then("User is able to see the iPod Classic Page")
	public void user_is_able_to_see_the_i_pod_classic_page() {
		DesktopMainClass.closeDriver();
	   
	}

	@When("select on the MacBook Option")
	public void select_on_the_mac_book_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.MacBookClickOption();
	}

	@Then("User is able to see the MacBook Page")
	public void user_is_able_to_see_the_mac_book_page() {
		DesktopMainClass.closeDriver();
	}

	@When("select on the MacBook Air Option")
	public void select_on_the_mac_book_air_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.MacbookAiroption();
	}

	@Then("User is able to see the MacBook Air Page")
	public void user_is_able_to_see_the_mac_book_air_page() {
		DesktopMainClass.closeDriver();
	   
	}

	@When("select on the Palm Treo Pro Air Option")
	public void select_on_the_palm_treo_pro_air_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.PlamtreProOption();
	}

	@Then("User is able to see the Palm Treo Pro Page")
	public void user_is_able_to_see_the_palm_treo_pro_page() {
		DesktopMainClass.closeDriver();
	    
	}

	@When("select on the Product {int} Option")
	public void select_on_the_product_option(Integer int1) {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.Product8Option();
	}

	@Then("User is able to see the Product {int} Page")
	public void user_is_able_to_see_the_product_page(Integer int1) {
		DesktopMainClass.closeDriver();
	}

	@When("select on the Samsung SyncMaster 941BW Option")
	public void select_on_the_samsung_sync_master_941bw_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.SamsungSyncMasterOption();

	}

	@Then("User is able to see the Samsung SyncMaster 941BW Page")
	public void user_is_able_to_see_the_samsung_sync_master_941bw_page() {
		DesktopMainClass.closeDriver();
	}

	@When("select on the Sony VAIO Option")
	public void select_on_the_sony_vaio_option() {
		DesktopsFindPaths page=new DesktopsFindPaths(DesktopMainClass.getcurrentDriver());
		page.ClickdesktopsOption();
		page.clickShowAlldesktopsOption();
		page.SonyVaioOption();
	   
	}

	@Then("User is able to see the Sony VAIO Page")
	public void user_is_able_to_see_the_sony_vaio_page() {
		DesktopMainClass.closeDriver();
	   
	}



}
