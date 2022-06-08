package com.unitedcoder.collectiondatastructure;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestMultipleWebSiteWithMap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //driver.get("https://www.amazon.com");
        Map<String, String> websites = new HashMap<>();
        websites.put("Google", "https://www.google.com");
        websites.put("yahoo!", "https://www.yahoo.com");
        websites.put("YouTube", "https://www.youtube.com");

        Set<String> keys = websites.keySet();
        for (String x : keys) {
            //StopWatch watch = new StopWatch();
            //watch.start();
            driver.get(websites.get(x));
            Thread.sleep(1000);
            if (driver.getTitle().contains("x")) {
                System.out.println(x + " opened successfully, Test Pass !!!");
                //watch.stop();
                //System.out.println(x + "opened within " + watch.getTime(TimeUnit.MILLISECONDS));
            }
            else {
                System.out.println(x + " not opened successfully, Test Fail!!!");
            }
        }
        driver.close();
        driver.quit();

    }
}
