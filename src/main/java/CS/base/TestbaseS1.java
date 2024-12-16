package CS.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TestbaseS1 {

	public static Properties prop;
	public static WebDriver driver;
	protected JavascriptExecutor js = (JavascriptExecutor) driver;

	public TestbaseS1()

	{
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/CS/config/CSconfigS1.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initilization() {
		String browser = prop.getProperty("Browser");

		if (browser.equals("chrome")) {

			String Headlessmode = prop.getProperty("Headlessmode");
			if (Headlessmode.equals("true")) {

				WebDriverManager.chromedriver().setup();
				ChromeOptions opt = new ChromeOptions();

				opt.addArguments("headless--");
				driver = new ChromeDriver(opt);

			} else {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.err.println("check the browser name");
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();

	}

}
