package org.example;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {


    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Beans", "Brinjal", "Onion", "Orange", "Pears"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(3000);

        addItems(driver, itemsNeeded);

    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {

        int j = 0;

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            //Brocolli - 1 Kg
            //Brocolli,    1 kg

            String[] name = products.get(i).getText().split("-");

            String formattedName = name[0].trim();

            //format it to get actual vegetable name
            //convert array into array list for easy search
            //  check whether name you extracted is present in arrayList or not-

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {

                j++;

                //click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {

                    break;

                }

            }
        }

        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("abcde");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='promoWrapper']/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
        Thread.sleep(2000);

        driver.quit();

    }
}