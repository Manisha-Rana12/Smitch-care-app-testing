package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookswagonSignIn {

	WebDriver driver;
	
	public BookswagonSignIn(WebDriver driver) {
		this.driver = driver;
		//this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_lblUser']")
	private WebElement myAccount;
	
	@FindBy(css = "#ctl00_divLogin > a']")
	private WebElement loginbtn1;
	
	@FindBy(id = "ctl00_phBody_SignIn_txtEmail")
	private WebElement mobFeild;
	
	@FindBy(id = "ctl00_phBody_SignIn_txtPassword")
	private WebElement password; //4v#jQzT#Heq8BqE
	
	@FindBy(id = "ctl00_phBody_SignIn_btnLogin")
	private WebElement loginbtn;

	
	
	
	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLoginbtn1() {
		return loginbtn1;
	}

	public WebElement getMobFeild() {
		return mobFeild;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public void login(String mobileno, String pass) {
		
		WebElement hoverMyAccount = myAccount;
		Actions action = new Actions(driver);
		action.moveToElement(hoverMyAccount).perform();
		
		loginbtn1.click();
		mobFeild.sendKeys(mobileno);
		password.sendKeys(pass);
		
		loginbtn.click();
		
		
	}
	
	

	
	
//	@FindBy(xpath="//input[@id='ctl00_phBody_SignUp_chkNewsletter']")
//	private WebElement checkBox;
//	
//	@FindBy(id="#ctl00_phBody_SignUp_btnContinue")
//	private WebElement continueBtn;

//	public void hoverOverMenu() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(myAccount).perform();
//    }
	
	

	
}
