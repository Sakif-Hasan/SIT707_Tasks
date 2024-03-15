package org.example;

import org.openqa.selenium.edge.EdgeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        EdgeDriver driver = new EdgeDriver();
        try {
            driver.navigate().to("https://google.com");

            Thread.sleep(5000);
        } finally {
            driver.quit();
        }
    }
}
