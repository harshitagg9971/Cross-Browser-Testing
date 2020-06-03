package com.generics.CrossBrowserTesting;

public interface AutoConstant 
{
	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = "./drivers/chromedriver.exe";
	String firefoxKey = "webdriver.gecko.driver";
	String firefoxValue = "./drivers/geckodriver.exe";
	String ie_Key = "webdriver.ie.driver";
	String ie_Value = "./drivers/IEDriverServer.exe";
	
	String excelPath = "./testdata/ActiTIME_testdata.xlsx";
	String sheetName = "ActiTIME";
	String url = "https://demo.actitime.com";
}
