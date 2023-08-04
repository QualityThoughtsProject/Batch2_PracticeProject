package com.cgi.mapfre.stepdefinition;

import com.cgi.mapfre.Property.pom.DesktopsFindPaths;
import com.cgi.mapfre.framework.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopsSteps {

@Given("User Launch The Application")
public void user_launch_the_application() {
    DriverFactory.driverInit("browser");
}

@When("User Identify the Desktops Option")
public void user_identify_the_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();

}

@Then("User is Able to See the Desktops Option")
public void user_is_able_to_see_the_desktops_option() {
    DriverFactory.closeDriver();
}

@When("User select the PC Option")
public void user_select_the_pc_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickPcOption();
    
}

@Then("User is able to see the PC Page")
public void user_is_able_to_see_the_pc_page() {
	DriverFactory.closeDriver();
}

@When("User select the MAC Option")
public void user_select_the_mac_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickMacOption();
    
}

@Then("User is able to see the MAC Page")
public void user_is_able_to_see_the_mac_page() {
	DriverFactory.closeDriver();
}

@When("User select  iMac from MAC Option")
public void user_select_i_mac_from_mac_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickiMacOption();  
}

@Then("User is able to see the iMac Page")
public void user_is_able_to_see_the_i_mac_page() {
	DriverFactory.closeDriver();
}

@When("User select the Show All Desktops from Desktops Option")
public void user_select_the_show_all_desktops_from_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
}

@Then("User is able to see the Desktops Page")
public void user_is_able_to_see_the_desktops_page() {
	DriverFactory.closeDriver();
}

//@When("User Select the Show All Desktops from Desktops Option")
//public void user_select_the_show_all_desktops_from_desktops_option() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
//}

@When("select on the List Option")
public void select_on_the_list_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.clickListOption();
}

@Then("Products should be displayed in LIST format")
public void products_should_be_displayed_in_list_format() {
   DriverFactory.closeDriver();
}

@When("select on the Grid Option")
public void select_on_the_grid_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.clickGridOption();
}

@Then("Products should be displayed in Grid Format")
public void products_should_be_displayed_in_grid_format() {
    DriverFactory.closeDriver();
}

@When("User search for the desktops products")
public void user_search_for_the_desktops_products() {
   DriverFactory.driverInit("browser");
}

@When("User sort with {string}")
public void user_sort_with(String string) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickSortingOption(null, string);
    
}

@Then("User is able to sort the products")
public void user_is_able_to_sort_the_products() {
    DriverFactory.closeDriver();
}

//@When("User select  the Show All Desktops from Desktops Option")
//public void user_select_the_show_all_desktops_from_desktops_option() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
//}

@When("select  Apple Cinema {int}&quot Button")
public void select_apple_cinema_quot_button(Integer int1) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.applecinimaoption();
}

@Then("User is able to see the Apple Cinema {int}&quot Page")
public void user_is_able_to_see_the_apple_cinema_quot_page(Integer int1) {
    DriverFactory.closeDriver();
}

@When("select Canon EOS 5D Option")
public void select_canon_eos_5d_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.canonEOSoption();
}

@Then("User is able to see the Canon EOS 5D Page")
public void user_is_able_to_see_the_canon_eos_5d_page() {
    DriverFactory.closeDriver();
}

@When("select HP LP3065 Option")
public void select_hp_lp3065_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.hpLP3Option();
    
}

@Then("User is able to see the HP LP3065 Page")
public void user_is_able_to_see_the_hp_lp3065_page() {
    DriverFactory.closeDriver();
}

@When("select HTC Touch HD Option")
public void select_htc_touch_hd_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.htcTouchOption();
}

@Then("User is able to see the HTC Touch HD Page")
public void user_is_able_to_see_the_htc_touch_hd_page() {
   DriverFactory.closeDriver();
}

@When("select  iPhone Option")
public void select_i_phone_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.iPhoneclick();
   
}

@Then("User is able to see the iPhone Page")
public void user_is_able_to_see_the_i_phone_page() {
    DriverFactory.closeDriver();
}

@When("select on the iPod Classic Option")
public void select_on_the_i_pod_classic_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.iPadClassisoption();
}

@Then("User is able to see the iPod Classic Page")
public void user_is_able_to_see_the_i_pod_classic_page() {
   DriverFactory.closeDriver();
}

@When("select on the MacBook Option")
public void select_on_the_mac_book_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.macBookClickOption();
}

@Then("User is able to see the MacBook Page")
public void user_is_able_to_see_the_mac_book_page() {
   DriverFactory.closeDriver();
}

@When("select on the MacBook Air Option")
public void select_on_the_mac_book_air_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.macbookAiroption();
    
}

@Then("User is able to see the MacBook Air Page")
public void user_is_able_to_see_the_mac_book_air_page() {
   DriverFactory.closeDriver();
}

@When("select on the Palm Treo Pro Air Option")
public void select_on_the_palm_treo_pro_air_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.plamtreProOption();
    
}

@Then("User is able to see the Palm Treo Pro Page")
public void user_is_able_to_see_the_palm_treo_pro_page() {
    DriverFactory.closeDriver();
}

@When("select on the Product {int} Option")
public void select_on_the_product_option(Integer int1) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.product8Option();
   
}

@Then("User is able to see the Product {int} Page")
public void user_is_able_to_see_the_product_page(Integer int1) {
    DriverFactory.closeDriver();
}

@When("select on the Samsung SyncMaster 941BW Option")
public void select_on_the_samsung_sync_master_941bw_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.samsungSyncMasterOption();
}

@Then("User is able to see the Samsung SyncMaster 941BW Page")
public void user_is_able_to_see_the_samsung_sync_master_941bw_page() {
    DriverFactory.closeDriver();
}

@When("select on the Sony VAIO Option")
public void select_on_the_sony_vaio_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsOption();
	menupage.clickShowAlldesktopsOption();
	menupage.sonyVaioOption();
    
}

@Then("User is able to see the Sony VAIO Page")
public void user_is_able_to_see_the_sony_vaio_page() {
  DriverFactory.closeDriver();
}

}
