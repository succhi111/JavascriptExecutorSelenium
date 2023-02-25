package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteOnDisableButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\suche\\IdeaProjects\\JavascriptExecutor\\src\\main\\resources\\Test.html");

        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("suchhi111");

        javascriptExecutor.executeScript("document.getElementById('pass').value='This is password'");
         Thread.sleep(2000);
driver.quit();
    }
}