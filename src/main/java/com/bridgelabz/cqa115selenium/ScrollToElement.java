package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Mahatma_Gandhi");
        Thread.sleep(2000);

         WebElement ele = driver.findElement(By.xpath("//span[@id='Salt_Satyagraha_(Salt_March)']"));

        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);

        driver.quit();
    }
}


