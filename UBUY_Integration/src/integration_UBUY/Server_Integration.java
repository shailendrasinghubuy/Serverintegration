package integration_UBUY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Server_Integration extends Keywords{
	
	@Test
	public void tc01LaunchURL() {
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get("https://www.ubuy.ie/en/");
	}

	@Test
	public void tc02SearchProducts() {
		webDriver.findElement(By.xpath(search)).sendKeys("laptop");
		webDriver.findElement(By.xpath(clickonSaerchButton)).click();
	}
	
	@Test
	public void tc03SelecthProducts() {
		webDriver.findElement(By.xpath(SelectProducts)).click();
	}

	
	@Test
	public void tc04AddToCart() {
		webDriver.findElement(By.xpath(AddToCart)).click();
		
		String myWindowHandle = webDriver.getWindowHandle();
		  webDriver.switchTo().window(myWindowHandle);
		  WebElement element = (new WebDriverWait(webDriver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(PopUp)));
		  element.click();	  
		}

	@Test
	public void tc05ProceedToCheckout() throws Exception {
		Thread.sleep(4000);
		webDriver.findElement(By.xpath(ProceedToCheckOut)).click();
	
	}
	@Test
	public void tc06Login()
	{
		
		webDriver.findElement(By.xpath(UserName)).sendKeys("shailendra.singh@ubuy.co.in");
		webDriver.findElement(By.xpath(Password)).sendKeys("testing123");
		webDriver.findElement(By.xpath(LoginButton)).click();
	}
	@Test
	public void tc07ShippingInformation() throws Exception
	{
		Thread.sleep(4000);
		webDriver.findElement(By.xpath(NewAdress)).click();
		webDriver.findElement(By.xpath(FirstNAme)).sendKeys("shailendra");
		webDriver.findElement(By.xpath(LAstName)).sendKeys("sing");
		webDriver.findElement(By.xpath(TelephoneNumber)).sendKeys("12345678");
		Select Region = new Select(webDriver.findElement(By.xpath(State)));
		Region.selectByVisibleText("Cavan");
		webDriver.findElement(By.xpath(City)).sendKeys("Jaipur");
		webDriver.findElement(By.xpath(House)).sendKeys("ElecTronicMarket");
		webDriver.findElement(By.xpath(Street)).sendKeys("Ridhi Sidhi");
		webDriver.findElement(By.xpath(Zip)).sendKeys("123654");
		webDriver.findElement(By.xpath(ContinueButton)).click();
	}
	@Test
	public void tc08ShippingMethod() throws Exception
	{
		Thread.sleep(4000);
		webDriver.findElement(By.xpath(ShippingSelect)).click();
		webDriver.findElement(By.xpath(ContinueFromShipping)).click();
	}
	@Test
	public void tc09PaymentOptions() throws Exception
	{
		Thread.sleep(4000);
		webDriver.findElement(By.xpath(VisaMAsterCard)).click();
		Select Card =new Select(webDriver.findElement(By.xpath(CardType)));
		Card.selectByVisibleText("MasterCard");
		webDriver.findElement(By.xpath(CardNumber)).sendKeys("5105105105105100");
		Select ExpiryDate = new Select(webDriver.findElement(By.xpath(ExpiryMonth)));
		ExpiryDate.selectByVisibleText("03 - March");
		Select ExpiryDateYear = new Select(webDriver.findElement(By.xpath(ExpiryYear)));
		ExpiryDateYear.selectByVisibleText("2023");
		webDriver.findElement(By.xpath(CardVerificationNumber)).sendKeys("123");
		webDriver.findElement(By.xpath(ContinueFromPaymentOption)).click();
		
	}
	@Test
	public void tc10OrderReview()
	{
		webDriver.findElement(By.xpath(PlaceOrderFinal)).click();
	}
	
}
