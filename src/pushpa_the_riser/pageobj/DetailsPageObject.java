package pushpa_the_riser.pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsPageObject {
	WebDriver driver1;
	//WebDriver driver2;
	
	public DetailsPageObject(WebDriver driver1) {
		this.driver1 = driver1;
	}
	
	//public void DetailsPageObject1(WebDriver driver2) {
		//this.driver2 = driver2;
	//}
	
	By search1 = By.xpath("//*[@id='suggestion-search']");
	By searchButton1 = By.xpath("//*[@id=\'suggestion-search-button\']");
	By movieName1 = By.xpath("//*[@id=\'__next\']/main/div[2]/div[3]/section/div/div[1]/section[2]/div[2]/ul/li[1]/div[1]/div/img");
	By releaseDate1 = By.xpath("//*[@id=\'__next\']/main/div/section[1]/div/section/div/div[1]/section[11]/div[2]/ul/li[1]/div/ul/li/a");
	By country1 = By.xpath("//*[@id=\'__next\']/main/div/section[1]/div/section/div/div[1]/section[11]/div[2]/ul/li[2]/div/ul/li/a");
	
	By search2 = By.xpath("//*[@id=\"searchInput\"]");
	By searchButton2 = By.xpath("//*[@id=\"search-form\"]/fieldset/button");
	By movieName2 = By.xpath("//*[@id=\'mw-content-text\']/div[3]/div[2]/ul/li[1]/table/tbody/tr/td[2]/div[1]/a");
	By releaseDate2 = By.xpath("//*[@id=\'mw-content-text\']/div[1]/table[1]/tbody/tr[12]/td");
	By country2 = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td");

	public WebElement getSearch1() {
		return driver1.findElement(search1);
	}
	public WebElement getSearchButton1() {
		return driver1.findElement(searchButton1);
	}
	public WebElement getMovieName1() {
		return driver1.findElement(movieName1);
	}
	public WebElement getReleaseDate1() {
		return driver1.findElement(releaseDate1);
	}
	public WebElement getCountry1() {
		return driver1.findElement(country1);
	}
	
	public WebElement getSearch2() {
		return driver1.findElement(search2);
	}
	public WebElement getSearchButton2() {
		return driver1.findElement(searchButton2);
	}
	public WebElement getMovieName2() {
		return driver1.findElement(movieName2);
	}
	public WebElement getReleaseDate2() {
		return driver1.findElement(releaseDate2);
	}
	public WebElement getCountry2() {
		return driver1.findElement(country2);
	}
}
