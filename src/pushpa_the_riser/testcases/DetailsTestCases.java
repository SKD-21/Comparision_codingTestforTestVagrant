package pushpa_the_riser.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pushpa_the_riser.pageobj.DetailsPageObject;

public class DetailsTestCases {
	
	@Test
	public void detailsTest() {
		
		WebDriver driver1 = WebDriverManager.chromedriver().create();
		driver1.get("https://www.imdb.com/");
		
		DetailsPageObject pageObject1 = new DetailsPageObject(driver1);
		
		pageObject1.getSearch1().sendKeys("Pushpa: The Rise - Part 1");
		pageObject1.getSearchButton1().click();
		pageObject1.getMovieName1().click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String releaseDateIMDB = pageObject1.getReleaseDate1().getText();
		System.out.println("IMDB Release date: "+releaseDateIMDB);
		String countryIMDB = pageObject1.getCountry1().getText();
		System.out.println("IMDB Country of origin: "+countryIMDB);
		System.out.println();
		
		//WebDriver driver2 = WebDriverManager.chromedriver().create();
		driver1.get("https://www.wikipedia.org/");
		
		//DetailsPageObject pageObject2 = new DetailsPageObject(driver1);
		
		pageObject1.getSearch2().sendKeys("Pushpa: The Rise - Part 1");
		pageObject1.getSearchButton2().click();
		
		
		
		//pageObject1.getMovieName2().click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String releaseDateWIKI = pageObject1.getReleaseDate2().getText();
		System.out.println("WIKI Release date: "+releaseDateWIKI);
		String countryWIKI = pageObject1.getCountry2().getText();
		System.out.println("WIKI Country of origin: "+countryWIKI);
		System.out.println();
		
		
		try {
			assertEquals(countryIMDB,countryWIKI);
		if(countryIMDB.equals(countryWIKI)) {
			System.out.println("Comparision country PASS");
		} else {
			System.out.println("Comparision country FAIL");
		}
		System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			assertEquals(releaseDateIMDB,releaseDateWIKI);
		if(releaseDateIMDB.equals(releaseDateWIKI)) {
			System.out.println("Comparision releaseDate PASS");
		} else {
			System.out.println("Comparision releaseDate FAIL");
		}
		System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
