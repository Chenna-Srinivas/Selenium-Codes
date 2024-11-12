package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chenn\\eclipse-workspace\\Selenium_V3\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	//ChromeDriver driver = new ChromeDriver();
	 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

	}
}
