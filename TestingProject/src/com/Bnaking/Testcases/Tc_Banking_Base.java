package com.Bnaking.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.utility.UtilityTakeSecreenshot;

public class Tc_Banking_Base {
	public String url="http://demo.guru99.com/V1/index.php";
	public String uName="mngr156111";
	public String PassName="EmAdEda";
	public String custName="subbareddy";
	public String dataofbirth="05-06-1995";
	public String cityName="Bangalore";
	public String StateName="karantaka";
	public String PinNumber="560032";
	public String telinumber="9505517923";
	public String Emailid="subbur281@gmail.com";
	public String adress="rayachoty kadadpa,andhra predesh,pv palli,veerbali mandle,raaychoty taluk";
	public WebDriver driver;
	@BeforeTest()
	public void setBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\workspace\\TestingProject\\src\\com\\Bnaking\\Testcases\\chromedriver.exe");
		
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
	}  
	
	}
