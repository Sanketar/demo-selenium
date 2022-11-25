package com.selenium.automation.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");//C:\\Program Files (x86)\\webdriver\\chromedriver.exe

        ChromeOptions chromeoption = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeoption);
        
        System.out.println("The is execution staring");	
        
        driver.get("http://43.205.142.228:8085/addressbook/");
        
        Thread.sleep(3000);//gwt-uid-5
        
        driver.findElement(By.className("v-button")).click();
        
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Sanket");
        //((Object) driver.findElements(By.id("gwt-uid-5"))).sendkeys("sam");
        driver.findElement(By.id("gwt-uid-7")).sendKeys("R");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9865324578");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("Sanket@abd.com");
        driver.findElement(By.id("gwt-uid-13")).sendKeys("20/01/01");
        
        driver.findElement(By.className("v-button-primary")).click();
        
        Thread.sleep(2000);
        
        driver.quit();
        
        System.out.println("The susscessfull exicution");
        
        
        
        
    }
}
