package product.po;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product.imp.Implementation;

public class Cart {
	
	//Login with Credentials
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")WebElement user;
	
	@FindBy(xpath="//*[@id=\"email\"]")WebElement email;

	@FindBy(xpath="//*[@id=\"passwd\"]")WebElement psw;

	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")WebElement lgn;
	
	
	//summer dress submenu
	
	@FindBy(xpath="	/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")WebElement Dress; 

	@FindBy(xpath="//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")WebElement clickdress; 
	
	
	//View mode to list

	@FindBy(xpath="//*[@id=\"list\"]/a/i")WebElement clicklist;

	
	//view product
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]/span")WebElement qvclick;
	
//	@FindBy(xpath="//*[@id=\"color_14\"]")WebElement BlueClick;
	
	
	//Facebookshare
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[2]")WebElement Fshareclick;
	
	
	//2 quantities 
		
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]/span/i")WebElement text;
	
	
	//Add this product to wishlist
		
	@FindBy(xpath="//a[@title='Add to my wishlist']")WebElement wishlist;
	
	@FindBy(xpath="/html/body/div[2]/div/div/a")WebElement clickclosewishlist;
	
	
	//Click on Add to cart. Verify product price.

	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")WebElement clickTocart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")WebElement price;
	
	
	//Click on Proceed to checkout.
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")WebElement Checkout;

	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")WebElement product;
	
	
	//summary - verify delivery address, product selected and price
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[2]/span")WebElement Name;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[3]/span")WebElement Company;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[4]/span")WebElement Add1;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[5]/span")WebElement Add2;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[6]/span")WebElement Country;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[7]/span")WebElement Mob;
	@FindBy(xpath="//*[@id=\"product_5_19_0_304453\"]/td[5]/input[2]")WebElement SelectedProd;
	@FindBy(xpath="//*[@id=\"total_price\"]")WebElement FinalPrice;
	
	//Complete checkout process.
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")WebElement Summarycheckout;
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")WebElement Addcheckout;
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")WebElement checkbox;
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")WebElement Shippingcheckout;
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")WebElement Paybycheck;
	@FindBy(xpath="//html/body/div/div[2]/div/div[3]/div/form/p/button/span")WebElement FinalorderConfirm;
	
	//On Order confirmation page, check amount once.
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/span/strong")WebElement oncecheckprice;
	

	//product has been added to wishlist.
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")WebElement userdash;
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")WebElement custaccwish;

	
	
	Implementation imp;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		imp=new Implementation();
	}
	
	
	public boolean ValidateCartPage(WebDriver driver) throws AWTException, InterruptedException {
		
		user.click();	
		email.sendKeys("kartik.argulwar@rediffmail.com");
		psw.sendKeys("1234567890");
		lgn.click();
		Dress.click();
		clickdress.click();
		clicklist.click();
		qvclick.click();
//		BlueClick.click();
		Fshareclick.click();
		imp.clear(text);
		wishlist.click();
		clickclosewishlist.click();
		clickTocart.click();
		imp.price(driver, product, "$57.96");
		Checkout.click();
		imp.Verify(driver, Name, "K A");
		imp.Verify1(driver, Company, "abc");
		imp.Verify2(driver, Add1, "abcdefg");
		imp.Verify3(driver, Add2, "pune, Arkansas 31391");
		imp.Verify4(driver, Country, "United States");
		imp.Verify5(driver, Mob, "1234567890");
		imp.Verify6(driver, SelectedProd, "2");
		imp.Verify7(driver, FinalPrice, "$59.96");
		Summarycheckout.click();
		Addcheckout.click();
		checkbox.click();
		Shippingcheckout.click();
		Paybycheck.click();
		FinalorderConfirm.click();
		imp.Verify8(driver, oncecheckprice, "$59.96");
		userdash.click();
		custaccwish.click();
		Thread.sleep(3000);
		imp.robot(Fshareclick, driver);

		return false;
	}
}
