package com.unitedcoder.TwoWeekProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addProductClass {
    public static void main(String[] args) throws InterruptedException {
        //define chrome diver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        WebDriver driver= new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        //driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.navigate().to("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys("testautomation1");
        driver.findElement(By.id("password")).sendKeys("automation123!"+ Keys.ENTER);
        // sleep/ wait
        Thread.sleep(2000);
        driver.findElement(By.id("nav_products")).click();
        driver.findElement(By.xpath("//a[text()='Add Product']")).click();
        //driver.findElement(By.id("name")).sendKeys("i phone 12");
        //save button css=======.form_control>input[value='Save'][type='submit

    }
}
