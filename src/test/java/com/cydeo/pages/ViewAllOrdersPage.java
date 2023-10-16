package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage extends BasePage {
    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //we need to locate the first cell of the first row
    //day18 1.49.00
    //how do you handle/locate webtables in selenium.we create a custom locator.(xpath cssSelector
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;

}
