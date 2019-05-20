package pageobject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public String userName = "recascade_admin";
	
	@FindBy(id = "UserName")
	WebElement userNameTxt;
	
	@FindBy(id = "Password")
	WebElement passwordTxt;
	
	@FindBy(id = "tooltip_quick_search")
	WebElement quickSearch;
	
	@FindBy(xpath = "//div[@id='quick_search']//input[@class='QuickSearchTextBox']")
	WebElement quickSearchTxt;
	
	@FindBy(xpath = "//div[@id='quick_search']//input[@class='input_button']")
	WebElement quickSearchBtn;
	
	@FindBy(id = "btnSubmit")
	WebElement loginBtn;
	
	@FindBy(id = "AssetBar1_lblAssetID")
	WebElement assetId;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//	}
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	public void signIn() {
		try {
			userNameTxt.clear();
			userNameTxt.sendKeys(userName);
			loginBtn.click();
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void quickSearchClick() {
		try {
			quickSearch.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterTextAndSearch(String assetMgmtPropId) {
		try {
			quickSearchTxt.clear();
			quickSearchTxt.sendKeys(assetMgmtPropId);
			quickSearchBtn.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getAssetId() {
		try {
			return assetId.getText();
			}
		catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
  	
	
}
