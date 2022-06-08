package com.unitedcoder.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonSearch1 {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        WebDriver driver = new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        //set browser size- dimension class
        Dimension dimension=new Dimension(700,600);
        driver.manage().window().setSize(dimension);
        //point class using for define location,Set the position
        Point point= new Point(300,80);
        driver.manage().window().setPosition(point);
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        Point cordinate=searchBox.getLocation();
        int xLocation=cordinate.getX();
        int yLocation= cordinate.getY();
        System.out.println("X cordinate of search box is: "+ xLocation);
        System.out.println("Y cordinate of search box is: "+ yLocation);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);
        WebElement result= driver.findElement(By.cssSelector("div.a-section.a-spacing-small.a-spacing-top-small"));
        if (result.isDisplayed())
            System.out.println("Google Search Test Passed");
        else
            System.out.println("Test Failed!!!");
        driver.close();//close current driver
        driver.quit();//close all driver instance
    }
}
