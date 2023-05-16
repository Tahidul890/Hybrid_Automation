package tohid.usa.stepdefinition;



import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tohid.usa.basepage.Super_Class;
import tohid.usa.elementspage.PageFactoryElements;
import tohid.usa.genericfunctions.CommonMethods;
import tohid.usa.genericfunctions.WaitHelper;


public class FunctionalStepDef extends Super_Class{
	PageFactoryElements pf;
	@Given("user able to login the application")
	public void user_able_to_login_the_application() {
	    
	    pf = new PageFactoryElements();
	    pf.applicationLogin();
	    
	    
	}
	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() {
		log.info(">>>>>User able to select men module<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectMenModule());
	    CommonMethods.mouseHover(pf.getSelectMenModule());
	    
	    log.info(">>>>>User able to select tops from men module<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectTopsFromMenModule());
	    CommonMethods.mouseHover(pf.getSelectTopsFromMenModule());
	    
	    log.info(">>>>>User able to select jackets from the tops module<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectJacketFromMenModule());
	    CommonMethods.actionClick(pf.getSelectJacketFromMenModule());
	    
	}
	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() throws InterruptedException {
		
		log.info(">>>>>User able to select any jacket<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectJupiterAll_WeatherTrainer());
	    CommonMethods.actionClick(pf.getSelectJupiterAll_WeatherTrainer());
	    
	    Thread.sleep(1000);
	    log.info(">>>>>User able to select a size<<<<<");
	    //WaitHelper.seleniumWait(pf.getSelectSize());
	    CommonMethods.actionClick(pf.getSelectSize());
	    
	    log.info(">>>>>User able to select a color<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectColor());
	    CommonMethods.actionClick(pf.getSelectColor());
	    
	    log.info(">>>>>User able to select quantity<<<<<");
	    WaitHelper.seleniumWait(pf.getSelectQuantity());
	    pf.getSelectQuantity().clear();
	    pf.getSelectQuantity().sendKeys("2");
	}
	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {
	    
		log.info(">>>>>User able to click on to cart button<<<<<");
		WaitHelper.seleniumWait(pf.getClickOnAddtoCart());
		CommonMethods.actionClick(pf.getClickOnAddtoCart());
	    
	}
	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {
	    
		log.info(">>>>>User able to click on to the shopping cart pop-up<<<<<");
		WaitHelper.seleniumWait(pf.getClickShoppingCart());
		CommonMethods.actionClick(pf.getClickShoppingCart());
	    
	}
	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {
	    
		log.info(">>>>>User able to click on proceed to checkout<<<<<");
		WaitHelper.seleniumWait(pf.getProceed_to_Checkout());
		CommonMethods.actionClick(pf.getProceed_to_Checkout());
	    
	}
	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() {
	    
	//	pf.AddNewAddress();
	   
	}
	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {
//	    CommonMethods.getPageRefresh();
//	    
//	    log.info(">>>>>User able to select a shipping method<<<<<");
//	    WaitHelper.seleniumWait(pf.getShippingMethod());
//	    CommonMethods.actionClick(pf.getShippingMethod());
//	    
//	    log.info(">>>>>User able to click on next button<<<<<");
//	    WaitHelper.seleniumWait(pf.getClickOnNext());
//	    CommonMethods.actionClick(pf.getClickOnNext());
	    
	}
	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {
	    
//		log.info(">>>>>User able to click on same as shipping address<<<<<");
//	    WaitHelper.seleniumWait(pf.getClickOnSameAsShippingAddress());
//	    CommonMethods.jsClick(pf.getClickOnSameAsShippingAddress());
//	    
//	    log.info(">>>>>User able to click on place order button<<<<<");
//	    WaitHelper.seleniumWait(pf.getClickOnPlaceOrder());
//	    CommonMethods.jsClick(pf.getClickOnPlaceOrder());
	}
	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String ExpectedResult) {
	    
//		log.info(">>>>>User able to verify the confirmation message<<<<<");
//		Assert.assertEquals(ExpectedResult, pf.getVerifyOrderConf().getText());
//		System.out.print("Order Confirmation" + pf.getVerifyOrderConf().getText());
	    
	}
}
