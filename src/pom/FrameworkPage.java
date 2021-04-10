package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

/*public class FrameworkPage extends BasePage  implements AutoConstant{
	
	//declaration
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailidTextfield;
	
	@FindBy(xpath="(//input[@name='gender'])[1]")
	private WebElement maleRadiobutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
    private WebElement mobilenoTextfield;
	

//initialization
	public FrameworkPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utlization
	public void submitdetails() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,0));
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,1));
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,2));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,3));
		emailidTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,4));
		maleRadiobutton.click();
		checkbox.click();
		selectbyvisibletext(countrycodeDropdownlist,"+61");
		mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheet_name,1,5));
		}
	}

*/




