package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	public WebDriver ldriver;
	public PageObject(WebDriver driver){
		ldriver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(name="uid")
	WebElement uName;
	@FindBy(name="password")
	WebElement uPass;
  @FindBy(name="btnLogin")   
  WebElement submit1;
  @FindBy(linkText="New Customer")
  WebElement clickcustmerLink;
  @FindBy(name="name")
  WebElement useName;
  @FindBy(name="rad1")
  WebElement radiclick;
  @FindBy(id="dob")
  WebElement dataob;
  @FindBy(name="addr")
  WebElement adress1;
  @FindBy(name="city")
  WebElement cityName;
  @FindBy(name="state")
  WebElement state;
  @	FindBy(name="pinno")
  WebElement pin;
  @	FindBy(name="emailid")
  WebElement emailId;
  @	FindBy(name="sub")
  WebElement submit;
  @FindBy(name="telephoneno")
  WebElement telNum;
  public void submit(String Submit){
	  submit.click();
  }
  public void emailid(String Emailid){
	  emailId.sendKeys(Emailid);
  }
  public void teliphonen(String telinumber){
	  telNum.sendKeys(telinumber);
  }
  public void pinNumber(String PinNumber){
	  pin.sendKeys(PinNumber);
  }
  public void stateName(String StateName){
	  state.sendKeys(StateName);
  }
  public void custcityName(String cityname){
	  cityName.sendKeys(cityname);
  }
  public void custoadress(String adress){
	  adress1.sendKeys(adress);
  }
  public void custodab(String dataofbirth){
	  dataob.sendKeys(dataofbirth);
  }
  public void clickradibutt(){
	  radiclick.click();
  }
  public void name(String custName){
	  useName.sendKeys(custName);
  }
  public void clicklink(){
	  clickcustmerLink.click();
  }
  public void uname(String userName){
	  uName.sendKeys(userName);
  }
  public void upass(String usePass){
	  uPass.sendKeys(usePass);
  }
  
  public void submit(){
	  submit1.submit();
  }

}