package com.unitedcoder.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver1\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=\'Allow Essential and Optional Cookies\']")).click();

        WebElement createAccountButton = driver.findElement(By.xpath("//*[text()=\"Create New Account\"]"));
        createAccountButton.click();

        Thread.sleep(3000);

        WebElement dayDropDown = driver.findElement(By.id("day"));
        Thread.sleep(2000);
        WebElement monthDropDown = driver.findElement(By.id("month"));
        Thread.sleep(2000);
        WebElement yearDropDown = driver.findElement(By.id("year"));

        //17-03-2022
        Select selectDay = new Select(dayDropDown);
        Select selectMonth = new Select(monthDropDown);
        Select selectYear = new Select(yearDropDown);

        selectDay.selectByIndex(25);
        selectMonth.selectByValue("11");
        selectYear.selectByVisibleText("2000");
        Thread.sleep(1000);
        System.out.println(selectMonth.isMultiple());

//        selectFromDropDownList(dayDropDown, "20");
//        selectFromDropDownList(monthDropDown, "12");
//        selectFromDropDownList(yearDropDown,"1986");

        //driver.close();
        //driver.quit();
        List<WebElement> options = selectDay.getOptions();
        for (int i=0; i< options.size();i++) {
            System.out.println(options.get(i).getText());
        }

        List<WebElement>  month = driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        for (int i=0 ; i < month.size();i++){
            System.out.println(month.get(i).getText());
        }



    }
    //Create method of select function
    public static void selectFromDropDownList (WebElement webElement, String value){
        Select s1=new Select(webElement);
        s1.selectByValue(value);

    }
}
