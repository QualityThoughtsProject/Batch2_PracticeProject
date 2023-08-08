package com.cgi.mapfre.stepdefinition;

import java.sql.Driver;

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

@When("User Identify the Desktops Option")
public void user_identify_the_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption();

}

@Then("User is Able to See the Desktops Option")
public void user_is_able_to_see_the_desktops_option() {
    DriverFactory.closeDriver();
}

@When("User Select the Desktops Option")
public void user_select_the_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption();
    
}
@When("User select the PC Option")
public void user_select_the_pc_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption();
	menupage.clickPcoption();
	menupage.clickContinueoption();
    
}

@Then("User is able to see the PC Page")
public void user_is_able_to_see_the_pc_page() {
	DriverFactory.closeDriver();
}

@When("User select the MAC Option")
public void user_select_the_mac_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption();
	menupage.clickMacoption();
    
}

@Then("User is able to see the MAC Page")
public void user_is_able_to_see_the_mac_page() {
	DriverFactory.closeDriver();
}

@When("User select  iMac from MAC Option")
public void user_select_i_mac_from_mac_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
    menupage.clickMacoption();
	menupage.clickiMacoption();  
}

@Then("User is able to see the iMac Page")
public void user_is_able_to_see_the_i_mac_page() {
	DriverFactory.closeDriver();
}

@When("User select the Show All Desktops from Desktops Option")
public void user_select_the_show_all_desktops_from_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickDesktopsoption();
	menupage.clickShowAlldesktopsoption();
}

@Then("User is able to see the Desktops Page")
public void user_is_able_to_see_the_desktops_page() {
	DriverFactory.closeDriver();
}

@When("User select on the List Option from Show All Desktop Option")
public void user_select_on_the_list_option_from_show_all_desktop_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.clickListoption();
}

@Then("Products should be displayed in LIST format")
public void products_should_be_displayed_in_list_format() {
   DriverFactory.closeDriver();
}

@When("User select on the Grid Option from Show All Desktop Option")
public void user_select_on_the_grid_option_from_show_all_desktop_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.clickGridoption();
    
}


@Then("Products should be displayed in Grid Format")
public void products_should_be_displayed_in_grid_format() {
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


@When("select  Apple Cinema {int}&quot Button from Show All Desktops Option")
public void select_apple_cinema_quot_button_from_show_all_desktops_option(Integer int1) {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.applecinimaoption();
}

@Then("User is able to see the Apple Cinema {int}&quot Page")
public void user_is_able_to_see_the_apple_cinema_quot_page(Integer int1) {
    DriverFactory.closeDriver();
}

@When("User select  the Canon EOS 5D from Show All Desktops Option")
public void user_select_the_canon_eos_5d_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.canonEOSoption();
   
}

@Then("User is able to see the Canon EOS 5D Page")
public void user_is_able_to_see_the_canon_eos_5d_page() {
    DriverFactory.closeDriver();
}

@When("User select the HP LP3065 from Show All Desktops Option")
public void user_select_the_hp_lp3065_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.hpLP3option();
    
}

@Then("User is able to see the HP LP3065 Page")
public void user_is_able_to_see_the_hp_lp3065_page() {
    DriverFactory.closeDriver();
}

@When("User select the HTC Touch from Show All Desktops Option")
public void user_select_the_htc_touch_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.htcTouchoption();  
}

@Then("User is able to see the HTC Touch HD Page")
public void user_is_able_to_see_the_htc_touch_hd_page() {
   DriverFactory.closeDriver();
}

@When("User select the iPhone from Show All Desktops Option")
public void user_select_the_i_phone_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.iPhoneclick();
    
}

@Then("User is able to see the iPhone Page")
public void user_is_able_to_see_the_i_phone_page() {
    DriverFactory.closeDriver();
}

@When("User select the iPod from Show All Desktops Option")
public void user_select_the_i_pod_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.iPadClassisoption();
   
}

@Then("User is able to see the iPod Classic Page")
public void user_is_able_to_see_the_i_pod_classic_page() {
   DriverFactory.closeDriver();
}

@When("User select the MacBook from Show All Desktops Option")
public void user_select_the_mac_book_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.macBookClickoption();
    
}


@Then("User is able to see the MacBook Page")
public void user_is_able_to_see_the_mac_book_page() {
   DriverFactory.closeDriver();
}

@When("User select the MacBook Air from Show All Desktops Option")
public void user_select_the_mac_book_air_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.macbookAiroption();
   
}

@Then("User is able to see the MacBook Air Page")
public void user_is_able_to_see_the_mac_book_air_page() {
   DriverFactory.closeDriver();
}

@When("User select the Palm Treo Pro from Show All Desktops Option")
public void user_select_the_palm_treo_pro_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.plamtreProoption();
  
}
@Then("User is able to see the Palm Treo Pro Page")
public void user_is_able_to_see_the_palm_treo_pro_page() {
    DriverFactory.closeDriver();
}

@When("User select the Product8 from Show All Desktops Option")
public void user_select_the_product8_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.product8option();
}
@Then("User is able to see the Product8 Page")
public void user_is_able_to_see_the_product8_page() {
  DriverFactory.closeDriver();
}

@When("User select the Samsung SyncMaster941BW from Show All Desktops Option")
public void user_select_the_samsung_sync_master941bw_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.samsungSyncMasteroption();
   
}
@Then("User is able to see the Samsung SyncMaster941BW Page")
public void user_is_able_to_see_the_samsung_sync_master941bw_page() {
	 DriverFactory.closeDriver();
}

@When("User select the Sony VAIO from Show All Desktops Option")
public void user_select_the_sony_vaio_from_show_all_desktops_option() {
	DesktopsFindPaths menupage=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
	menupage.clickShowAlldesktopsoption();
	menupage.sonyVaiooption();    
} 

@Then("User is able to see the Sony VAIO Page")
public void user_is_able_to_see_the_sony_vaio_page() {
  DriverFactory.closeDriver();
}

}
