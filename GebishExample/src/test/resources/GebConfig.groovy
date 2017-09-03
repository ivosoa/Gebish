/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.Dimension
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

baseUrl = 'https://www.google.com'

// default driver...
driver = { 
    firefox{
        new FirefoxDriver()
        URL url = new URL(System.getProperty("com.example.test.remoteWebDriverUrl"))
    }
}

reportsDir = "target/geb-reports"

waiting {
    timeout = 6
    retryInterval = 0.5
    slow { timeout = 12 }
    reallyslow { timeout = 24 }
}