package integration_UBUY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	public static  WebDriver webDriver = new FirefoxDriver();;

	 String search = "//input[@name='q']";
	 String clickonSaerchButton ="//form[@id='search-form']//button[@type='submit']";
	 String SelectProducts = "//body/div[@class='section search-content']/div[@class='container-fluid']/div[@class='row']/div[@id='usstore-product-block-section']/div[@id='store']/div[@class='row']/div[1]";
	 String AddToCart  ="//*[@id='add-to-cart-btn' and @class='add-to-cart-btn']";
	 String PopUp=".//*[@class='view-cart-and-checkout']";
	 String ProceedToCheckOut ="//div[@class='totals']//ul[@class='checkout-types']//li//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]";
	 String UserName =".//*[@id='login-email']";
	 String Password =".//*[@id='login-password']";
	 String LoginButton = ".//*[@id='login-form']/div/button";
	 String NewAdress ="//*[@class='address-select input-rdo' and @id='addr_id_']";
	 String FirstNAme=".//*[@id='billing:firstname']";
	 String LAstName =".//*[@id='billing:lastname']";
	 String TelephoneNumber =".//*[@id='telephone_main_box']";
	 String State =".//*[@id='billing:region']";
	 String City =".//*[@id='billing:city']";
	 String House =".//*[@id='billing:address_house_no']";
	 String Street =".//*[@id='billing:address_street']";
	 String Zip =".//*[@id='zip']";
	 String ContinueButton =".//*[@id='billing_save_button']";
	 
	 String ShippingSelect =".//*[@id='s_method_dhlint_P']";
	 String ContinueFromShipping =".//*[@id='shipping_method_save_button']";
	 
	 String VisaMAsterCard =".//*[@id='p_method_cybersecure']";
	 String CardType =".//*[@id='cybersecure_cc_type']";
	 String CardNumber =".//*[@id='cybersecure_cc_number']";
	 String ExpiryMonth =".//*[@id='cybersecure_expiration']";
	 String ExpiryYear =".//*[@id='cybersecure_expiration_yr']";
	 String CardVerificationNumber =".//*[@id='cybersecure_cc_cid']";
	 String ContinueFromPaymentOption =".//*[@id='payment_method_save_button']";
	 
	 String PlaceOrderFinal =".//*[@id='place_order_button']";
	 
	 
}
