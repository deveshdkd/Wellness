package VRM;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import javax.xml.bind.JAXBElement.GlobalScope;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;




 public class Browserswitch

{

	 private static final Object Element = null;
	 static WebDriver driver;
	 WebElement Firstname;
	 public   void Login() 
	 {
		 		//System.setProperty("webdriver.gecko.driver","D:\\Devesh automation\\geckodriver.exe");
	    		//driver = new FirefoxDriver();
		 
		 		System.setProperty("webdriver.chrome.driver","D:\\devesh automation\\chromedriver.exe");
		 		driver = new ChromeDriver();
	        	driver.manage().window().maximize();
	        
		 
	        	driver.get("https://aarush.wellnessforever.in/");
	        	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        	driver.findElement(By.xpath("//*[@id=\"buser\"]")).sendKeys("8427356890");
	        	driver.findElement(By.xpath("//input[@class='get-started-btna large']")).click();
	   }
	 
	 public  void OTP() throws InterruptedException
	 {    	
		 		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 		driver.findElement(By.xpath("//*[@id=\"aTextbox1\"]")).sendKeys("977569"); //enter otp
	        	driver.findElement(By.xpath("//*[@id=\"aTextbox\"]")).sendKeys("123456"); //enter passwrd
	        	driver.findElement(By.xpath("//*[@id=\"subclick\"]")).click();
	        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        	
	        	
	        	
     } 
 public void click_Register() 
 
 	{
	 			driver.findElement(By.id("registerlink")).click();
	 			System.out.print("Enter Mobile Number");
	 			Scanner input = new Scanner(System.in);
	 			String Mobile_Number = input.next();
	 			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Mobile_Number);
	 			driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[1]/section/div[2]/input")).click();
	    
          
	   
 	}
public  void Register_Customer() throws InterruptedException
	{
		 		Firstname=driver.findElement(By.cssSelector("input#name"));
		 		Firstname.clear();
		 		Firstname.sendKeys("Devesh");														// firstName
		    	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).click();
		 		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Kumar");	
		 		driver.findElement(By.id("customer_address")).clear(); 
		 		driver.findElement(By.id("customer_address")).sendKeys("Noida Sec 63");				// Address
		     
		 		Select dropdown = new Select(driver.findElement(By.id("gender")));						// gender selection 
                dropdown.selectByVisibleText("Male"); 												// gender 
                driver.findElement(By.id("popupDatepicker")).click();
                driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/div/table/tbody/tr[4]/td[3]/a")).click();
                
                driver.findElement(By.xpath("//*[@id=\"comments_by_business\"]")).sendKeys("Comment");
           
                Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"users_tagging\"]")));							// user selection 
                dropdown1.selectByVisibleText("test test"); 											// user 
                driver.findElement(By.id("sale_amount")).sendKeys("1000");
                Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[3]/section/div/section/aside[2]/ul/li[2]/div[1]/select")));  //category
                dropdown2.selectByVisibleText("Grade-I");
                Select dropdown3 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[3]/section/div/section/aside[2]/ul/li[3]/div[1]/select")));  //Request
                dropdown3.selectByVisibleText("Grade-I");
             
             
                Select dropdown4 = new Select(driver.findElement(By.xpath("//*[@id=\"re_category\"]")));  //Request
                dropdown4.selectByVisibleText("Hot");
             
             
             
             
                driver.findElement(By.xpath("//*[@id=\"request_date\"]")).click();
                //driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[3]/section/div/section/aside[2]/ul/li[7]/div[1]/div/div[1]/a[3]")).click();
                driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[3]/section/div/section/aside[2]/ul/li[7]/div[1]/div/div[2]/div[1]/table/tbody/tr[4]/td[6]")).click();
                driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[3]/section/div/section/aside[2]/ul/li[7]/div[1]/div/div[2]/div[1]/table/tbody/tr[4]/td[6]")).click();
             
             
                driver.findElement(By.xpath("//*[@id=\"request_text\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"request_text\"]")).sendKeys("Reqst Txt");
             
                driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[6]/div/input[3]")).click();
           
	 }

	 public void Simple_Cmpn() throws InterruptedException 
	 {
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/a")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/div/ul/li[2]/a")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vhld\"]/section/aside[2]/div[1]/a")).click();
		 		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/div[1]/div[1]/ul/li[1]/input")).sendKeys("NewCmpn");      //Cmpn name
		 		driver.findElement(By.xpath(" //*[@id=\"chars_new\"]")).sendKeys("Text For Cmpn");		//Text For Cmpn
        
         
		 		driver.findElement(By.xpath("//*[@id=\"popupDatepicker\"]")).sendKeys("Text For Cmpn");			//date popup
		 		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 		Select dropdown1 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));		//year
		 		dropdown1.selectByVisibleText("2023");
		 		Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
		 		dropdown2.selectByVisibleText("May");
		 		driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[4]/a")).click();				//date
         
		 		driver.findElement(By.xpath(" //*[@id=\"campaign-left\"]/ul/li/h5")).click();							//Advance option
         
		 		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 		driver.findElement(By.name("coupon_flag")).click();
		 		Select dropdown3 = new Select(driver.findElement(By.name("discount_type")));
		 		dropdown3.selectByVisibleText("Rs.");																				//dscnt type
         
		 		driver.findElement(By.xpath(" //*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[2]/input")).sendKeys("10"); 		//dscnt %
         
		 		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[3]/input")).sendKeys("1000");		//max dscnt
      
		 		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[4]/input")).sendKeys("1000");		//On min Bill
         
		 		Select dropdown4 = new Select(driver.findElement(By.name("discount_applicable_type")));
		 		dropdown4.selectByVisibleText("Exclude Items");	
		 		driver.findElement(By.xpath("//*[@id=\"popupContact1\"]/div[2]/section/div/div[2]/div/div/ul/li[2]/strong/a")).click(); 
         
		 		Thread.sleep(1200);
		 		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 		driver.findElement(By.id("orderproduct_id_96_2748")).click();
        
		 		driver.findElement(By.id("apply_service")).click();
         
		 		Thread.sleep(1500);
		 		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 		driver.findElement(By.xpath("//*[@id=\"popupDatepicker1\"]")).click(); 
         
		 		Thread.sleep(2500);
		 		Select dropdown5 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));		//year
		 		dropdown5.selectByVisibleText("2022");
		 		Select dropdown6 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
		 		dropdown6.selectByVisibleText("May");
		 		driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[6]/a")).click();		
       
		 		Thread.sleep(1000);
		 		Select dropdown7 =new Select(driver.findElement(By.name("hour")));   
		 		dropdown7.selectByVisibleText("12");
         
		 		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 		Select dropdown8 =new Select(driver.findElement(By.name("minut")));   
		 		dropdown8.selectByVisibleText("30");
         
		 		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 		Select dropdown9 =new Select(driver.findElement(By.name("gender")));   
		 		dropdown9.selectByVisibleText("Male");
         
		 		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 		Select dropdown10 =new Select(driver.findElement(By.name("customer_source")));   
		 		dropdown10.selectByVisibleText("Mobile");
         
		 		JavascriptExecutor js = (JavascriptExecutor) driver;
         		 js.executeScript("window.scrollBy(0,200)");
         		Thread.sleep(1000);
         
        
         
         
         		js.executeScript("window.scrollBy(0,200)");
         		Thread.sleep(500);
       
         
        		// driver.findElement(By.name("visit_type")).click();
         		Select dropdown11 = new Select(driver.findElement(By.name("visit_type")));
         		dropdown11.selectByIndex(1);
         		Thread.sleep(1000);
         		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[5]/ul/li[1]/div[2]/input\r\n")).sendKeys("2");
         
         		Select dropdown12 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/section/div[1]/ul/li/span/div/div[5]/ul/li[2]/div[1]/div/select")));
         		dropdown12.selectByIndex(2);
         		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
         		driver.findElement(By.name("salesamount")).sendKeys("3");
         
         		driver.findElement(By.name("business_users[]")).click();
         		Thread.sleep(1200);
        		driver.findElements(By.name("business_users[]")).get(1).click();
        		driver.findElements(By.name("business_users[]")).get(2).click();
        
        
        		js.executeScript("window.scrollBy(0,400)");
        		driver.findElements(By.name("campaign_target_code")).get(2).click();
      
        		js.executeScript("window.scrollBy(0,400)");
        		Thread.sleep(1000);
        		Select dropdown17 = new Select(driver.findElement(By.name("flex_1")));
        		dropdown17.selectByVisibleText("Grade-II");
        
        		Select dropdown17a = new Select(driver.findElement(By.name("flex_2")));
        		dropdown17a.selectByVisibleText("Grade-I");
        
        		driver.findElement(By.name("repeat_flag")).click();
        
        		Thread.sleep(1000);
        		Select dropdown15 = new Select(driver.findElement(By.name("repeat_event")));
        		dropdown15.selectByVisibleText("Weekly");
        
        		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/section/div[1]/ul/li/span/div/div[9]/div[1]/ul/li[2]/span/div/span/input")).click();
        
        		Thread.sleep(1000);
        		Select dropdown16 = new Select(driver.findElement(By.name("repeat_day")));
        		dropdown16.selectByVisibleText("Tuesday");
        		Thread.sleep(500);
        		Select dropdown19 = new Select(driver.findElement(By.name("repeat_hour")));
        		dropdown19.selectByVisibleText("9");
        		Thread.sleep(500);
        		Select dropdown18 = new Select(driver.findElement(By.name("repeat_minut")));
        		dropdown18.selectByVisibleText("30");
        
        		js.executeScript("window.scrollBy(0,200)");
        		driver.findElement(By.id("sreciptestnew")).click();
        		
        		Thread.sleep(2000);
        		Select dropdown20 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div[2]/div/section/div[1]/div[1]/ul/li[2]/div/select")));
        		dropdown20.selectByVisibleText("Create Date");
        		//Select dropdown21 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div[2]/div/section/div[1]/div[1]/ul/li[2]/div/select")));
        		//dropdown21.selectByVisibleText("Create Date");
        
        		driver.findElement(By.name("datevisit1")).click();
        		Thread.sleep(1000);
        		Select dropdown22 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));		//year
        		dropdown22.selectByVisibleText("2023");
        		Select dropdown23 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
        		dropdown23.selectByVisibleText("June");
        		driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[4]/a")).click();        
        
        		driver.findElement(By.name("datevisit2")).click();
        		Thread.sleep(1000);
        		Select dropdown24 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));		//year
        		dropdown24.selectByVisibleText("2023");
        		Select dropdown25 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
        		dropdown25.selectByVisibleText("June");
        		driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[5]/a")).click(); 
        
        		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/div[1]/ul/li[5]/input")).click();
        		Thread.sleep(200);
        		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/div[5]/input[1]")).click();									//finish
        
		 		Thread.sleep(500);
		 		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 		js2.executeScript("window.scrollBy(0,483)");
		 		driver.findElement(By.xpath("//*[@id=\"campaign-step5\"]/div/section/div[5]/input[1]")).click();
         
       
       
	 }
	 
public void Simple_Rsnd() throws InterruptedException
	 {
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/a/span")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/div/ul/li[2]/a")).click();
		 
         
		 		driver.findElement(By.xpath("//*[@id=\"vhld\"]/div/section/table/tbody/tr[2]/td[5]/a[1]/img")).click();
		 		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 		js2.executeScript("window.scrollBy(0,500)");
		 		driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/div[4]/input")).click();
		 		js2.executeScript("window.scrollBy(0,500)");
		 		driver.findElement(By.xpath("//*[@id=\"campaign-step5\"]/div/section/div[5]/input[1]")).click();
	 }
	 
public void Simple_Dlt() throws InterruptedException
	 {
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/a/span")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/div/ul/li[2]/a")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vhld\"]/div/section/table/tbody/tr[2]/td[5]/a[2]")).click();
		 		Thread.sleep(500);
		 		driver.findElement(By.xpath("/html/body/div[10]/div/div/button[1]")).click();
        
	 }
	 
public void loyalty() throws InterruptedException
	 
	 {
				
				//Stage 1
				driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/a/span")).click();
				driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/div/ul/li[3]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[2]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[2]/input")).sendKeys("120");
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[2]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[2]/input")).sendKeys("25 % Discount Loyalty");
		 
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 		Select dropdown0 =new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/section/div/form/ul/li[1]/div[2]/div[4]/ul/li[1]/div/select")));   
		 		dropdown0.selectByVisibleText("Rs.");
		 		
		 		driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[2]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[2]/input")).sendKeys("20.00");
         
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[3]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[3]/input")).sendKeys("40");
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[4]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[4]/input")).sendKeys("200");
	 
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[4]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[4]/input")).sendKeys("200");
	 
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 		Select dropdown1 =new Select(driver.findElement(By.xpath("//*[@id=\"discount_applicable_type\"]")));   
		 		dropdown1.selectByVisibleText("Include Items");
		 		
		 		driver.findElement(By.id("checkAll")).click();
		 		driver.findElement(By.id("apply_service")).click();
		 		
		 		driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[6]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[1]/div[2]/div[4]/ul/li[6]/input")).sendKeys("250");
	 
				
				//Stage 2
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[2]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[2]/input")).sendKeys("251");
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[3]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[3]/input")).sendKeys("35 % Discount Loyality");
				
				driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		 		Select dropdown3 =new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/section/div/form/ul/li[2]/div[2]/div[4]/ul/li[1]/div/select")));   
		 		dropdown3.selectByVisibleText("Rs.");
		 		
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[2]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[2]/input")).sendKeys("35.00");
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[3]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[3]/input")).sendKeys("45");
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[4]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/ul/li[2]/div[2]/div[4]/ul/li[4]/input")).sendKeys("555");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		 		Select dropdown4 =new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/section/div/form/ul/li[2]/div[2]/div[4]/ul/li[5]/label[2]/div/select")));   
		 		dropdown4.selectByVisibleText("Exclude Items");
		 		Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		 		driver.findElement(By.xpath("//*[@id=\"ordercategory_id_96\"]")).click();
		 		Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
				driver.findElement(By.id("apply_service")).click();
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[2]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[2]/div[1]/input")).sendKeys("1000");			//points per 1000
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[3]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[3]/div[1]/input")).sendKeys("10");			//POINTS VALIDITY (IN DAYS)
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[4]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[1]/li[4]/div[1]/input")).sendKeys("2");			//REMINDER SEND (IN DAYS) BEFORE
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[2]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[2]/div[1]/input")).sendKeys("1");		//min points
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[3]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[3]/div[1]/input")).sendKeys("1");		//min bill
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[4]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[4]/div[1]/input")).sendKeys("1000");		//max points
				
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[5]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[2]/ul/li[5]/div[1]/input")).sendKeys("1");		//points vs rs
				
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 		js2.executeScript("window.scrollBy(0,800)");
				driver.findElement(By.xpath("//*[@id=\"popupDatepicker1\"]")).click();			//date popup
		 		Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 		Select dropdown19 = new Select(driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/select[2]")));		//year
		 		dropdown19.selectByVisibleText("2023");
		 		Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/select[1]")));			//month
		 		dropdown2.selectByVisibleText("May");
		 		driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/table/tbody/tr[4]/td[5]/a")).click();				//date
				
		 		Thread.sleep(500);
		 		driver.findElement(By.name("offer_no_days")).clear();
		 		driver.findElement(By.name("offer_no_days")).sendKeys("10");			//no of days
		 		
		 		driver.findElement(By.name("offer_age")).clear();
		 		driver.findElement(By.name("offer_age")).sendKeys("50");												//POINTS %
		 		
		 		driver.findElement(By.xpath("//*[@id=\"loyalty_form_points\"]/div[4]/input")).click();				//save
		 		Thread.sleep(500);
		 		driver.findElement(By.xpath("/html/body/div[12]/div/div/button")).click();
				
	 }
	 
	 
	
		 
		 
		 
		 
}




