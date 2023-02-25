package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Mahatma_Gandhi");
        Thread.sleep(2000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        for (int i = 0; i < 5; i++) {
            javascriptExecutor.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);
        }

        Thread.sleep(2000);
        driver.quit();
        }
}
