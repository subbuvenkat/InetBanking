package com.Bnaking.Testcases;

import org.testng.annotations.Test;

import com.PageObject.PageObject;

public class Tc_Banking_001 extends Tc_Banking_Base {
	@Test
	public void test(){
		PageObject pb=new PageObject(driver);
		driver.get(url);
		pb.uname(uName);
		pb.upass(PassName);
		pb.submit();
		pb.clicklink();
		pb.name(custName);
		pb.clickradibutt();
		pb.custodab(dataofbirth);
		pb.custoadress(adress);
		pb.custcityName(cityName);
		pb.stateName(StateName);
		pb.pinNumber(PinNumber);
		pb.teliphonen(telinumber);
		pb.emailid(Emailid);
	
		pb.submit();
		
	
		}

}                     
