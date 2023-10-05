package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        userNameInput.sendKeys("Kate");
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        emailInput.sendKeys("bobrinevakat@gmail.com");
        currentAddress.sendKeys("Kursk");
        permanentAddress.sendKeys("Moskow");
        button.click();


        // blockElements.click();

    }
}