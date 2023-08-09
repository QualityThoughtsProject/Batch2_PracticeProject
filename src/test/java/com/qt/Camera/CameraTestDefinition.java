package com.qt.Camera;

import org.openqa.selenium.WebDriver;

import com.cgi.mapfre.framework.DriverFactory;

//import com.qt.CameraMain.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CameraTestDefinition {
	static WebDriver driver;
	
	@Given("i launch the application")
	public void i_launch_the_application() {
		DriverFactory.getCurrentDriver();
	   
	}

	@When("i select the Camera option")
	public void i_select_the_camera_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickCanonOption();
	   
	}

	@Then("i able to see the camera page")
	public void i_able_to_see_the_camera_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option to select the canon option")
	public void i_select_the_camera_option_to_select_the_canon_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
	   click.clickCanonOption();
	}

	@Then("i able to see the canon page option")
	public void i_able_to_see_the_canon_page_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option to select the Nikon option")
	public void i_select_the_camera_option_to_select_the_nikon_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		   click.clickNikonOption();
	   
	}

	@Then("i able to see the Nikon page option")
	public void i_able_to_see_the_nikon_page_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option and select the compare option")
	public void i_select_the_camera_option_and_select_the_compare_option() {
	   
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		   click.clickProductCompareOption();
	}

	@Then("i able to see the compare option page")
	public void i_able_to_see_the_compare_option_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Nikon and Reviews option")
	public void i_select_the_nikon_and_reviews_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		   click.clickReviewsOption();
	}
	   


	@Then("i able to see the Reviews page option")
	public void i_able_to_see_the_reviews_page_option() {
		DriverFactory.closeDriver();
	   
	}

	@Then("i able to see the updated the data")
	public void i_able_to_see_the_updated_the_data() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option and select the Nikon  and Add to cart button option")
	public void i_select_the_camera_option_and_select_the_nikon_and_add_to_cart_button_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickAddToCartOption();
	   
	}

	@Then("i able to  see the update the add to cart option")
	public void i_able_to_see_the_update_the_add_to_cart_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the block dropdown and view cart and Get Quotes option")
	public void i_select_the_block_dropdown_and_view_cart_and_get_quotes_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickEstimateShippingOption();
	   
	}

	@Then("i able to see the  update the Get Quotes buttonss")
	public void i_able_to_see_the_update_the_get_quotes_buttonss() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option to select the blcck dropdown view cart and Coupon option")
	public void i_select_the_camera_option_to_select_the_blcck_dropdown_view_cart_and_coupon_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickCouponCodeOption();
	   
	}

	@Then("i able tosee the update the Coupon button")
	public void i_able_tosee_the_update_the_coupon_button() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option to select the block dropdown and view cart Gift Certificate option")
	public void i_select_the_camera_option_to_select_the_block_dropdown_and_view_cart_gift_certificate_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickUseGiftCertificateOption();
	   
	}

	@Then("i able to see the update the Gift Certificate button")
	public void i_able_to_see_the_update_the_gift_certificate_button() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the Camera option to select the block dropdown and select Checkout option")
	public void i_select_the_camera_option_to_select_the_block_dropdown_and_select_checkout_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
	   click.clickCheckoutOption();
	}

	@Then("i able to see the checkout option page")
	public void i_able_to_see_the_checkout_option_page() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the camera option to select the Nikon and thumbnail and Next Right arrow key option")
	public void i_select_the_camera_option_to_select_the_nikon_and_thumbnail_and_next_right_arrow_key_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickleftarrowkeyButtonOption();
	   
	}

	@Then("i able to see on Next Right arrow key option")
	public void i_able_to_see_on_next_right_arrow_key_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the camera option to select the Nikon and thumbnail and Previous Left arrow key option")
	public void i_select_the_camera_option_to_select_the_nikon_and_thumbnail_and_previous_left_arrow_key_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickRightarrowkeyButtonOption();
	   
	}

	@Then("i able to see on Previous Left arrow key option")
	public void i_able_to_see_on_previous_left_arrow_key_option() {
	   
		DriverFactory.closeDriver();
	}

	@When("i select the camera option to select the image option")
	public void i_select_the_camera_option_to_select_the_image_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickimage();
	   
	}

	@Then("i able to see on image option")
	public void i_able_to_see_on_image_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the camera option to select the black dropdown and checkout and select the redio button option")
	public void i_select_the_camera_option_to_select_the_black_dropdown_and_checkout_and_select_the_redio_button_option() {
	   
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickradiobutton();
	}

	@Then("i able to see the redio button option")
	public void i_able_to_see_the_redio_button_option() {
		DriverFactory.closeDriver();
	   
	}

	@When("i select the camera option to select the black dropdown and checkout and select the logian option")
	public void i_select_the_camera_option_to_select_the_black_dropdown_and_checkout_and_select_the_logian_option() {
	   
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickloginPageOption();
	}

	@Then("i able to see the logian button option")
	public void i_able_to_see_the_logian_button_option() {
	   
		DriverFactory.closeDriver();
	}

	@When("i select the camera option to select the block dropdown and checkout and select the chick box option")
	public void i_select_the_camera_option_to_select_the_block_dropdown_and_checkout_and_select_the_chick_box_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickCheckBoxOption();
	   
	}

	@Then("i able to see the chick box button option")
	public void i_able_to_see_the_chick_box_button_option() {
	   
		DriverFactory.closeDriver();
	}

	@When("i select the black dropdown and checkout and enter the requrement data and select the Checkout Continue button Option")
	public void i_select_the_black_dropdown_and_checkout_and_enter_the_requrement_data_and_select_the_checkout_continue_button_option() {
		Camera click = new Camera(DriverFactory.getCurrentDriver());
		click.clickCheckoutOption();
	   
	}

	@Then("i able to uploded the Checkout Continue button Option")
	public void i_able_to_uploded_the_checkout_continue_button_option() {
	   
		DriverFactory.closeDriver();
	}
}


