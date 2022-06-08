package com.unitedcoder.classconcepts;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class AddProductTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?_g=categories");

        LoginUser cubeCartUser = new LoginUser("testautomation1","automation123!");

        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(cubeCartUser.getUserName());
        Thread.sleep(2000);

        WebElement passWordField= driver.findElement(By.id("password"));
        passWordField.sendKeys(cubeCartUser.getPassWord());
        Thread.sleep(2000);
        //click on login button
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        //click on product button
        driver.findElement(By.id("nav_products")).click();
        //click on Add product button
        driver.findElement(By.xpath("//*[text()='Add Product']")).click();

        ProductContent productContent = new ProductContent("javaBook"+System.currentTimeMillis());
        driver.findElement(By.id("name")).sendKeys(productContent.getProductName());

        WebElement conditionDropDown = driver.findElement(By.id("condition"));
        Select select = new Select(conditionDropDown);
        //select.selectByVisibleText(DropDownContent.Refurbished.name());
        select.selectByIndex(2);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
        //verify successfully saved new product
        String successFulMessage = driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div[2]")).getText();
        if (driver.getPageSource().contains(successFulMessage)){
            System.out.println("product create successfully, test pass!!!");
        }
        else
            System.out.println("Test Failed");

        driver.close();
        driver.quit();












    }
}
