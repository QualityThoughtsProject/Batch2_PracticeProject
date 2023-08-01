package com.qt.Camera;

import org.openqa.selenium.WebDriver;

import com.qt.CameraMain.CameraMainDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CameraTestDefinition {
	static WebDriver driver;
	
	@Given("User launch the application")
	public void user_launch_the_application() {
		CameraMainDriver.LaunchBrowsear();
	   
	}

	@When("User select the Camera option")
	public void user_select_the_camera_option() {
	    Camera click = new Camera(CameraMainDriver.getcurrentDriver());
	    click.ClickCameraOption();
	}

	@Then("User able to see the camera page")
	public void user_able_to_see_the_camera_page() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
	    click.ClickCameraOption();
	    if (click.equals(click)) {
	    	System.out.println("User able to see the camera page");
	    } else {
	    	System.out.println("User not able to see the camera page");
	    }
	 }
	

	@When("User select the canon option")
	public void user_select_the_canon_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
	    click.ClickCanonOption();
	}

	@Then("User able to see the canon page option")
	public void user_able_to_see_the_canon_page_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
	    click.ClickCanonOption();
	    if (click.equals(click)) {
	    	System.out.println("User able to see the canon page");
	    } else {
	    	System.out.println("User not able to see the canon page");
	    }
	}

	@When("User select the Nikon option")
	public void user_select_the_nikon_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
	    click.ClickNikonOption();
	    }

	@Then("User able to see the Nikon page option")
	public void user_able_to_see_the_nikon_page_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
	    click.ClickNikonOption();
	    if (click.equals(click)) {
	    	System.out.println("User able to see the Nikon page");
	    } else {
	    	System.out.println("User not able to see the Nikon page");
	    }
	}

	@When("User select the compare option")
	public void user_select_the_compare_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		 click.ClickCameraOption();
		 click.ClickCanonProductCompareOption();
		 click.ClickNikonProductCompareOption();
		 click.ClickProductCompareOption();
	    
	}

	@Then("User able to see the compare option page")
	public void user_able_to_see_the_compare_option_page() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
	    click.ClickProductCompareOption();
	    if (click.equals(click)) {
	    	System.out.println("User able to see the compare page");
	    } else {
	    	System.out.println("User not able to see the compare page");
	    }
	}

	@When("User select the Nikon and Reviews option")
	public void user_select_the_nikon_and_reviews_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickReviewsOption();
	}

	@Then("User able to see the Reviews page option")
	public void user_able_to_see_the_reviews_page_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickReviewsOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Reviews page");
	    } else {
	    	System.out.println("User not able to see the Reviews page");
	    }
	}

	@When("user select the Reviews  and enter a data and also select the continue button option")
	public void user_select_the_reviews_and_enter_a_data_and_also_select_the_continue_button_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickReviewsOption();
		click.Clicktextarea1Option();
		click.Clicktextarea2Option();
		click.ClickRatingButtonOption();
		click.ClickContinueOption();
	}

	@Then("User able to updated the data")
	public void user_able_to_updated_the_data() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickContinueOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Reviews data updated Button");
	    } else {
	    	System.out.println("User not able to see the Reviews data updated Button");
	    }
	}

	@When("User select the Nikon  and Add to cart button option")
	public void user_select_the_nikon_and_add_to_cart_button_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickAddToCartOption();
	}

	@Then("User able to se the update the add to cart option")
	public void user_able_to_se_the_update_the_add_to_cart_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickAddToCartOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the AddToCart page");
	    } else {
	    	System.out.println("User not able to see the AddToCart page");
	    }
	}

	@When("User select the block dropdown and view cart and Get Quotes option")
	public void user_select_the_block_dropdown_and_view_cart_and_get_quotes_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickAddToCartOption();
		click.ClickBlackdropdownOption();
		click.ClickViewCartOption();
		click.ClickEstimateShippingOption();
	}

	@Then("User able to update the Get Quotes button")
	public void user_able_to_update_the_get_quotes_button() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickEstimateShippingOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Quotes button page");
	    } else {
	    	System.out.println("User not able to see the Quotes button page");
	    }
	}

	@When("User select the block dropdown view cart and Coupon option")
	public void user_select_the_block_dropdown_view_cart_and_coupon_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickAddToCartOption();
		click.ClickBlackdropdownOption();
		click.ClickViewCartOption();
		click.ClickCouponCodeOption();
	    
	}

	@Then("User able to update the Coupon button")
	public void user_able_to_update_the_coupon_button() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCouponCodeOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Coupon button page");
	    } else {
	    	System.out.println("User not able to see the Coupon button page");
	    }
	}

	@When("User select the block dropdown and view cart Gift Certificate option")
	public void user_select_the_block_dropdown_and_view_cart_gift_certificate_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickAddToCartOption();
		click.ClickBlackdropdownOption();
		click.ClickViewCartOption();
		click.ClickUseGiftCertificateOption();
	}

	@Then("User able to update the Gift Certificate button")
	public void user_able_to_update_the_gift_certificate_button() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickUseGiftCertificateOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Gift Certificate button page");
	    } else {
	    	System.out.println("User not able to see the Gift Certificate button page");
	    }
	}

	@When("User select the block dropdown and select Checkout option")
	public void user_select_the_block_dropdown_and_select_checkout_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickNikonOption();
		click.ClickAddToCartOption();
		click.ClickBlackdropdownOption();
		click.ClickCheckoutOption();
	}

	@Then("User able to see the checkout option page")
	public void user_able_to_see_the_checkout_option_page() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCheckoutOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the checkout page");
	    } else {
	    	System.out.println("User not able to see the checkout page");
	    }
	}
/*
	@When("User select the camera option")
	public void user_select_the_camera_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("User select the list button")
	public void user_select_the_list_button() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
		click.ClickListButtonOption();
	}

	@Then("User able to see the list option page")
	public void user_able_to_see_the_list_option_page() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickListButtonOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the list button page");
	    } else {
	    	System.out.println("User not able to see the list button page");
	    }
		
	}

	@When("User select the Nikon and thumbnail and Next Right arrow key option")
	public void user_select_the_nikon_and_thumbnail_and_next_right_arrow_key_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClickCameraOption();
	    click.ClickNikonOption();
	    click.ClickthumbnailOption();
	    click.ClicknextButtonOption();
	   
	}

	@Then("User able to see on Next Right arrow key option")
	public void user_able_to_see_on_next_right_arrow_key_option() {
		Camera click = new Camera(CameraMainDriver.getcurrentDriver());
		click.ClicknextButtonOption();
		if (click.equals(click)) {
	    	System.out.println("User able to see the Next Right arrow key option");
	    } else {
	    	System.out.println("User not able to see Next Right arrow key option");
	    }
	}

	@When("User select the Nikon and thumbnail and Previous Left arrow key option")
	public void user_select_the_nikon_and_thumbnail_and_previous_left_arrow_key_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see on Previous Left arrow key option")
	public void user_able_to_see_on_previous_left_arrow_key_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the Default button")
	public void user_select_the_default_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see on Default option")
	public void user_able_to_see_on_default_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the show button")
	public void user_select_the_show_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see on show option")
	public void user_able_to_see_on_show_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
/*
	@When("user select the camera option")
	public void user_select_the_camera_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException(); 
	} */

	@When("User select the image option")
	public void user_select_the_image_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see on image option")
	public void user_able_to_see_on_image_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the block dropdown and checkout and select the redio button option")
	public void user_select_the_block_dropdown_and_checkout_and_select_the_redio_button_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see the redio button option")
	public void user_able_to_see_the_redio_button_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the block dropdown and checkout and select the logian option")
	public void user_select_the_block_dropdown_and_checkout_and_select_the_logian_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see the logian button option")
	public void user_able_to_see_the_logian_button_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the block dropdown and checkout and select the chick box option")
	public void user_select_the_block_dropdown_and_checkout_and_select_the_chick_box_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see the chick box button option")
	public void user_able_to_see_the_chick_box_button_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the block dropdown and checkout and enter the requrement data option")
	public void user_select_the_block_dropdown_and_checkout_and_enter_the_requrement_data_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the confirm button option")
	public void user_select_the_confirm_button_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to uploded the confirm option")
	public void user_able_to_uploded_the_confirm_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
