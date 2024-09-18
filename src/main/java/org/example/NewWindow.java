package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

//Switching Window
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();
        String parentWindowId = it.next();
        String childWindow =it.next();

        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");

        Thread.sleep(2000);


        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
                .get(1).getText();

        driver.switchTo().window(parentWindowId);

        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        Thread.sleep(2000);
        name.sendKeys(courseName);



//GEt Height & Width

        System.out.println(name.getRect().getDimension().getHeight());

        System.out.println(name.getRect().getDimension().getWidth());

        driver.quit();

    }

}