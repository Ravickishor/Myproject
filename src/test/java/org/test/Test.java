package org.test;
import java.util.Date;
public class Test {
	
		    //@BeforeClass
				public void beforeClass() {
					System.out.println("Browser configuration and launch browser");
				}
			//@AfterClass
				public void afterClass() {
					System.out.println("Close Browser...");
				}
			//@Before	
				public void beforeEachMethod() {
					Date d=new Date();
					System.out.println("Start time:"+d);
					}
			//@After
				public void afterEachMethod() {
					Date d=new Date();
					System.out.println("Endtime:"+d);
					}
			//@Test	
				public void tc1() {
					System.out.println("TC1...");
				}
			//@Test
				public void tc2() {
					System.out.println("TC2...");
				}
			//@Test	
				public void tc3() {
					System.out.println("TC3...");
				}
			}

