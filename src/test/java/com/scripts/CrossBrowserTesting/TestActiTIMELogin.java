package com.scripts.CrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.CrossBrowserTesting.BaseTest;
import com.pages.CrossBrowserTesting.POMActiTIMELoginPage;

public class TestActiTIMELogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActiTIMELoginPage task1 = new POMActiTIMELoginPage(driver);
		task1.loginMethod();
	}
}
