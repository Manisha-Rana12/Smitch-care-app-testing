package testClass;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Page.BookswagonSignIn;
import generics.baseTest;


public class TestBooksWagon extends baseTest{

	WebDriver driver;
	BookswagonSignIn signin;
	Properties pro;
	
	
	

	@Test
	public void testSignIn() throws InterruptedException {
//		signin.getMyAccount().click();
//		Thread.sleep(2000);
//		signin.getSignIn().click();
//		Thread.sleep(2000);
//		signin.getNameFeild().sendKeys("isha");;
//		Thread.sleep(2000);
//		signin.getMobileFeild().sendKeys("9382392290");
//		Thread.sleep(6000);
//		signin.getCheckBox().click();
//		Thread.sleep(2000);
//		signin.getContinueBtn().click();
		
		/*
		signin.getMyAccount().click();
		Thread.sleep(2000);
		signin.getMobFeild().sendKeys("9382392290");
		Thread.sleep(2000);
		signin.getPassword().sendKeys("4v#jQzT#Heq8BqE");
		Thread.sleep(2000);
		signin.getLoginbtn().click();
		
		*/
		pro = new Properties();
		signin.login(mobileno, pass);
		
		
	}
	
	
	
	
}
