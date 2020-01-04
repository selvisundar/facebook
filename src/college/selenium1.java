package college;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Chrome 79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/index.php");
	WebElement usname=driver.findElement(By.id("username"));
	usname.sendKeys("Welcomes");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Welcome123");
	WebElement btn=driver.findElement(By.id("login"));
	btn.click();
	
	WebElement a=driver.findElement(By.id("location"));
	Select s1=new Select(a);
	s1.selectByIndex(1);
	
	WebElement b=driver.findElement(By.id("hotels"));
	Select s2=new Select(b);
	s2.selectByIndex(1);
	
	WebElement c=driver.findElement(By.id("room_type"));
	Select s3=new Select(c);
	s3.selectByIndex(1);
	
	WebElement d=driver.findElement(By.id("room_nos"));
	Select s4=new Select(d);
	s4.selectByIndex(1);
	
	WebElement dain=driver.findElement(By.id("datepick_in"));
	dain.sendKeys("04/01/2020");
	
	WebElement daout=driver.findElement(By.id("datepick_out"));
	daout.sendKeys("05/01/2020");
	
	WebElement e=driver.findElement(By.id("adult_room"));
	Select s5=new Select(e);
	s5.selectByIndex(1);
	
	WebElement f=driver.findElement(By.id("child_room"));
	Select s6=new Select(f);
	s6.selectByIndex(1);
	
	WebElement search=driver.findElement(By.name("Submit"));
	search.click();
	
	WebElement clk=driver.findElement(By.name("radiobutton_0"));
	clk.click();
	
	WebElement conti=driver.findElement(By.name("continue"));
	conti.click();
	
	WebElement fname=driver.findElement(By.id("first_name"));
	fname.sendKeys("selvi");
	
	WebElement lname =driver.findElement(By.id("last_name"));
    lname.sendKeys("sundar");
    
	WebElement addre =driver.findElement(By.id("address"));
	addre.sendKeys("badmaparadise");
	
	WebElement creno=driver.findElement(By.id("cc_num"));
	creno.sendKeys("1234567891234567");
	
    WebElement g=driver.findElement(By.id("cc_type"));
	Select s7=new Select(g);
	s7.selectByIndex(1);
	
	WebElement h=driver.findElement(By.id("cc_exp_month"));
	Select s8=new Select(h);
	s8.selectByIndex(1);

	 WebElement i=driver.findElement(By.id("cc_exp_year"));
	 Select s9=new Select(i);
	 s9.selectByIndex(1);
	 
	 WebElement ccv=driver.findElement(By.id("cc_cvv"));
	 ccv.sendKeys("123");
	 
	 WebElement book=driver.findElement(By.id("book_now"));
	 book.click();
	 
	 WebDriverWait wait=new  WebDriverWait(driver,15);
	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("")));
	 String v=driver.findElement(By.id("")).getAttribute("");
	 System.out.println(v);
	 
	 WebElement sehotel=driver.findElement(By.id(""));
	 sehotel.click();
	 
	 //List<WebElement> data=driver.findElement(By.xpath(""));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 WebElement searhotel=driver.findElement(By.id("search_hotel"));
	 searhotel.click();		 
	}}
	