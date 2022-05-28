package org.test;

import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test1 {
@BeforeClass
public void beforeClass() {
	System.out.println("Browser Configuration...");
}

@AfterClass
 public void afterclass() {
	System.out.println("Close/Quit Browser");
}

@BeforeMethod
public void beforeEachMethod() {
	Date d = new Date();
	System.out.println("Start time..."+d);
}

@AfterMethod
public void afterEachMethod() {
	Date d = new Date();
	System.out.println("End time..."+d);
}

@Test
public void tc1() {
	System.out.println("TC 1..");
}

@Test(priority=0)
public void tc2() {
	System.out.println("TC 2...");
}
}
