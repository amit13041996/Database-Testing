import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String port = "3306";
		String host = "localhost";
		
		// Connection URL Syntax:: "jdbc:mysql://"+host+":"+port+"/databasename";  Ex- "jdbc:mysql://"+localhost+":"+3306+"/demo"; 
		
		
		Connection con = DriverManager.getConnection
				("jdbc:mysql://" + host + ":" + port + "/amit_qa", "root",
				"amit@123");   

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from credentials where scenario = 'rahulshettyacademy'");

		while (rs.next()) // We do rs.next() to handle index exception from base to 1st index, i.e.,
							// java.sql.SQLException: Before start of result set
		{

			/*
			 * WebDriverManager.chromedriver().setup();
			 * 
			 * // Create an object of Chrome Options class 
			 * ChromeOptions chromeOptions = new ChromeOptions();
			 * 
			 * // Create an object of WebDriver class and pass the Chrome Options object as
			 * // an argument
			 *  WebDriver driver = new ChromeDriver(chromeOptions);
			 */

			//System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			
			//WebDriver driver = new ChromeDriver();
			
			// WebDriverManager.chromedriver().create();

			//driver.get("https://rahulshettyacademy.com");
			/*
			 * driver.findElement(By.id("userEmail")).sendKeys(rs.getString("user_name"));
			 * driver.findElement(By.id("userPassword")).sendKeys(rs.getString("password"));
			 * driver.findElement(By.cssSelector(".btn")).click();
			 */

			System.out.println(rs.getString("user_name")); // Column names
			System.out.println(rs.getString("password"));  // Column names
		}

	}

}
