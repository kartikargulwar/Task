package product.imp;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Implementation {
	WebDriver driver;
	Actions action;
	
//	public void login(WebElement element, WebDriver driver) {
//		action=new Actions(driver);
//		action.moveToElement(element).build().perform();
//	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void email(String text, WebElement element) {
		element.sendKeys(text);
	}
	
	public void psw(String text, WebElement element) {
		element.sendKeys(text);
	}
	
	public void lgn(WebElement element) {
		element.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	}
	
 	public void Dress(WebElement element, WebDriver driver) {
		action=new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 	}
	
	public void clickdress(WebElement element) {
		element.click();
	}
	
	
	public void clicklist(WebElement element) {
		element.click();
	}
	

	public void QVclick(WebElement element) {
		element.click();
	
	}
	
	
//	public void Blueclick(WebElement element) {
//		element.click();
//	
//	}
	
	
	public void Fshareclick(WebElement element, WebDriver driver) {
		element.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}
	
	
	public void robot(WebElement fshareclick, WebDriver driver) throws AWTException, InterruptedException {
		Robot R=new Robot();
		R.mouseMove(650, 15);
		Thread.sleep(2000);
		R.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		R.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.quit();
	}

	
	public void clear(WebElement element) {
		element.click();
	}
	
	public void text(String text, WebElement element, WebDriver driver) {
		element.sendKeys(text);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}
	
	
	public void wishlist(WebElement wishlist, WebDriver driver) {
		wishlist.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	

	
	public void clickclosewishlist(WebElement element) {
		element.click();
	}
	
	public void clickTocart(WebElement element, WebDriver driver) {
	JavascriptExecutor a=(JavascriptExecutor)driver;
	a.executeScript("arguments[0].click();", element);
	}
	
	public boolean price(WebDriver driver, WebElement element, String Exp) {
		String Act=element.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}

	public void Checkout(WebElement element) {
		element.click();
	}
	
	public boolean Verify(WebDriver driver, WebElement Name, String Exp) {
		String Act=Name.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	public boolean Verify1(WebDriver driver, WebElement Company, String Exp) {
		String Act=Company.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
		
	public boolean Verify2(WebDriver driver, WebElement Add1, String Exp) {
		String Act=Add1.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	
	public boolean Verify3(WebDriver driver, WebElement Add2, String Exp) {
		String Act=Add2.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	public boolean Verify4(WebDriver driver, WebElement Country, String Exp) {
		String Act=Country.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	public boolean Verify5(WebDriver driver, WebElement Mob, String Exp) {
		String Act=Mob.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	public boolean Verify6(WebDriver driver, WebElement SelectedProd, String Exp) {
		String Act=SelectedProd.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}

	public boolean Verify7(WebDriver driver, WebElement FinalPrice, String Exp) {
		String Act=FinalPrice.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}

	public void Summarycheckout(WebElement element) {
		element.click();
	}
	
	public void Addcheckout(WebElement element) {
		element.click();
	}
	
	public void checkbox(WebElement element) {
		element.click();
	}
	
	public void Shippingcheckout(WebElement element) {
		element.click();
	}
	
	public void Paybycheck(WebElement element) {
		element.click();
	}
	
	
	public void FinalorderConfirm(WebElement element) {
		element.click();
	}
	
	
	public boolean Verify8(WebDriver driver, WebElement oncecheckprice, String Exp) {
		String Act=oncecheckprice.getText();
		System.out.println(Act);
		if(Act.equals(Exp)) {
			return true;
		}
		return false;
	}
	
	
	public void userdash(WebElement element) {
		element.click();
	}
	
	public void custaccwish(WebElement element, WebDriver driver) throws InterruptedException {
		element.click();
		JavascriptExecutor element1=(JavascriptExecutor)driver;
		element1.executeScript("window.ScrollBy(0,2000)");
		Thread.sleep(5000);
		System.out.println("Wishlist Having the Selected Products");
	}
	
	
	
}