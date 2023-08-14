package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("cbsjkla222222");
  }
  @Test
  public void war() throws MalformedURLException, InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  ChromeDriver d = new ChromeDriver();
	  
//	DesiredCapabilities cap = new DesiredCapabilities();
//	 cap.setCapability("browserName", "chrome");
//	WebDriver d=new RemoteWebDriver(new URL("http://54.237.37.87:4444/wd/hub"),cap);
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");Thread.sleep(3000);
	d.findElement(By.xpath("//a[.='Create new account']")).click();Thread.sleep(3000);
	d.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();Thread.sleep(3000);
	String a = d.findElement(By.xpath("//*[@id='js_nb']")).getText();
	System.out.println(a);
	d.quit();
}
  public HashMap<String, String> map = new HashMap<String, String>();
	public void kk() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/samsung-galaxy-f13-waterfall-blue-64-gb/product-reviews/itm583ef432b2b0c?pid=MOBGENJWBPFYJSFT&lid=LSTMOBGENJWBPFYJSFTP8FGOC&marketplace=FLIPKART ");

//		HSSFWorkbook workbook = new HSSFWorkbook();
//		HSSFSheet sheet =  workbook.createSheet("TestSheet");
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Review");
//		sheet.getRow(0).createCell(1).setCellValue("Location");
//		sheet.getRow(0).createCell(2).setCellValue("Date");
//		sheet.getRow(0).createCell(3).setCellValue("Target");
        int m=0;
	}
//		do {
//			List<WebElement> ele=driver.findElements(By.xpath("//span[@data-hook='review-body']"));
//			for(int i=1;i<=1;i++) {
//			int kk=0;
//				for(int j=1;j<=ele.size();j++) {
//					String target=xpath("//a[@data-hook='format-strip'])["+j+"]", driver).getText();
//					String review=xpath("(//span[@data-hook='review-body'])["+j+"]", driver).getText();
//					//WebElement loc=xpath("(//p[@class='_2mcZGG'])["+j+"]", driver);
//					String da=xpath("//span[@data-hook='review-date'])["+j+"]", driver).getText();
//					
//					Thread.sleep(3000);
					
					
//					try {
//						 location=ss[1];
//					} catch (Exception e) {
//						location="Chennai";
//					}
//					sheet.createRow((m*10)+j);
//					sheet.getRow((m*10)+j).createCell(0).setCellValue(review.getText());
//					sheet.getRow((m*10)+j).createCell(1).setCellValue(location);
//					sheet.getRow((m*10)+j).createCell(2).setCellValue(date);
//					sheet.getRow((m*10)+j).createCell(3).setCellValue(target.getText());
//					System.out.println("Review:"+review.getText()+")     (Location : " +location + ")      (Target : "+target.getText()+")     Date: "+date);
//					
//				}
//				
//				
//				
//				 {
//					try {
//						js(xpath("//span[.='Next']", driver), driver);
//					} catch (Exception e) {
//						kk=1;
//						break;
//					}
//				}
//
//				 Thread.sleep(4000);
//			}
//			m++;
//			System.err.println("cuttent page no : "+m);
//
//			File file = new File("D:\\path.xls");
//			FileOutputStream fos = new FileOutputStream(file);
//			workbook.write(fos);
//			workbook.close();
//				}
//				}while (xpath("//span[.='Next']", driver).isDisplayed()==true);
//			
//		
//}
			
			
			
		//	@Test
			public void a() throws InterruptedException, IOException {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/GRITSTONES-Sleeves-Cotton-Chinese-GSFSSHRT1643ANTRA-L/product-reviews/B07N1MRTSW/ref=cm_cr_dp_d_show_all_btm?ie=UTF8&reviewerType=all_reviews");
				String color_or_size="size";
				File file = new File("D:\\path.xls");
				HSSFWorkbook workbook = new HSSFWorkbook();
				HSSFSheet sheet =  workbook.createSheet("TestSheet");
				sheet.createRow(0);
				sheet.getRow(0).createCell(0).setCellValue("Review");
				sheet.getRow(0).createCell(1).setCellValue("Date");
				sheet.getRow(0).createCell(2).setCellValue("Target_Size");
				sheet.getRow(0).createCell(3).setCellValue("Target_Colour");
		        int m=0;
		do {
			
			List<WebElement> ele=driver.findElements(By.xpath("(//a[@data-hook='format-strip'])"));
			System.out.println("ele---size---"+ele.size());
			int kk=0;
				for(int j=1;j<=ele.size();j++) {
					m++;
					String target=	driver.findElement(By.xpath("(//a[@data-hook='format-strip'])["+j+"]")).getText();
					String review=xpath("(//span[@data-hook='review-body'])["+j+"]", driver).getText();
					String da=xpath("(//span[@data-hook='review-date'])["+j+"]", driver).getText();
					System.out.println("target---"+target);
					System.out.println("review---"+review);
					System.out.println("da---"+da);
					Thread.sleep(2000);
					String tar_size = split_size(target);
					String tar_color = split_colore(target, color_or_size);
					String  convertedDatenew = null;
			          String inputDate = split_date(da);
			          String outputFormat = "yyyy-MM-dd";
			          String inputFormat = "d MMMM yyyy";

			          try {
			              SimpleDateFormat inputFormatter = new SimpleDateFormat(inputFormat);
			              SimpleDateFormat outputFormatter = new SimpleDateFormat(outputFormat);

			              Date date = inputFormatter.parse(inputDate);
			              String convertedDate = outputFormatter.format(date);

			            //  System.out.println("Input Date: " + inputDate);
			            //  System.out.println("Converted Date: " + convertedDate);
			             convertedDatenew=convertedDate;
			          } catch (ParseException e) {
			              System.err.println("Error parsing the date: " + e.getMessage());
			          }
			          System.out.println("convertedDatenew---"+convertedDatenew);
			          
			          
			          sheet.createRow(m);
						sheet.getRow(m).createCell(0).setCellValue(review+" "+tar_size+" "+tar_color);
						sheet.getRow(m).createCell(1).setCellValue(convertedDatenew);
						sheet.getRow(m).createCell(2).setCellValue(tar_size);
						sheet.getRow(m).createCell(3).setCellValue(tar_color);
		
		}
				System.out.println(" after 10 value of m----"+m);
				
				FileOutputStream fos = new FileOutputStream(file);
				workbook.write(fos);
				workbook.close();
				
				scroll(xpath("//li[@class='a-last']/a", driver), driver);Thread.sleep(2000);
			js(xpath("//li[@class='a-last']/a", driver), driver);Thread.sleep(4000);
			try {
				xpath("//input[@type='email']", driver).sendKeys("7871932489");Thread.sleep(2000);
				js(xpath("//input[@type='submit']", driver), driver);Thread.sleep(2000);
				xpath("//input[@type='password']", driver).sendKeys("Hyundai6581");Thread.sleep(2000);
				js(xpath("(//input[@type='submit'])[1]", driver), driver);Thread.sleep(4000);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} while (xpath("//li[@class='a-last']/a", driver).isDisplayed()==true);
			
		
			}
			
			public String split_date(String s) {
				String splited_date = null;
				String[] first_split = s.split("on ");
				for (int i = 0; i < first_split.length; i++) {
					String text = first_split[i];
					if (i==1) {
						splited_date=text;
						System.out.println(text);
					}
					
				}
				return splited_date;
			}
			public String split_size(String s) {
				String size = null;
				String[] split_text = s.split("Size: ");
				System.out.println("--split_text.length-size--"+split_text.length);
				for (int i = 0; i < split_text.length; i++) {
					if (i==1) {
						String[] text = split_text[i].split("Colour: ");
						for (int j = 0; j < text.length; j++) {
							if (j==0) {
								String text1 = text[j];
								//System.out.println("text1------"+text1);
								size=text1+" Size";
							}
							
						}
						
					}
				}
				System.out.println(size+"------------size--");
				return size;
			}
			public String split_colore(String s,String first) {
				String size = null;
				String[] split_text = s.split("Colour: ");
				System.out.println("--split_text.length-color--"+split_text.length);
				for (int i = 0; i < split_text.length; i++) {
					if (i==1) {
						String text = split_text[i];
						
						if (first.equalsIgnoreCase("color")) {
							System.out.println("  yesy****");
							String[] again_split = text.split("Size: ");
							for (int j = 0; j < again_split.length; j++) {
								if (j==0) {
								String text1 = again_split[j];
								size=text1+" colour";
								}
							}
						}
						else {
							size=text+" colour";
						}
					}
				}
				System.out.println(size+"------------color--");
				return size;
			}
		//	@Test
			public void name() {
				split_size("Size: 4XLColour: True Blue");
				split_colore("Size: 4XLColour: True Blue", "size");
				System.out.println("------------------------");
				split_size("Colour: BlackSize: M");
				split_colore("Colour: BlackSize: M", "color");
			}
			
			
			
			
			
			
			
			
	  public WebElement xpath(String spath,WebDriver drive) {
			 WebElement xp = drive.findElement(By.xpath(spath));
			  return xp;
		  }
	  public   void js(WebElement findElement,WebDriver drive) {
		  JavascriptExecutor executor =(JavascriptExecutor) drive;
			  executor.executeScript("arguments[0].click();", findElement);
	  }
	  public void scroll(WebElement Element,WebDriver drive) {
		  JavascriptExecutor js = (JavascriptExecutor) drive;
		  js.executeScript("arguments[0].scrollIntoView();", Element);
	  }

	      public static void datechanger() {
	String  convertedDatenew = null;
	          String inputDate = "17 aug 2023";
	          String outputFormat = "yyyy-MM-dd";
	          String inputFormat = "d MMMM yyyy";

	          try {
	              SimpleDateFormat inputFormatter = new SimpleDateFormat(inputFormat);
	              SimpleDateFormat outputFormatter = new SimpleDateFormat(outputFormat);

	              Date date = inputFormatter.parse(inputDate);
	              String convertedDate = outputFormatter.format(date);

	            //  System.out.println("Input Date: " + inputDate);
	            //  System.out.println("Converted Date: " + convertedDate);
	             convertedDatenew=convertedDate;
	          } catch (ParseException e) {
	              System.err.println("Error parsing the date: " + e.getMessage());
	          }
	          System.out.println("convertedDatenew---"+convertedDatenew);
			//return convertedDatenew;
	      }

}