import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class kunai_test
{
    public static void main( String[] args ) throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability( "appium-version", "1.0" );
        capabilities.setCapability( "platformName", "Android" );
        capabilities.setCapability( "platformVersion", "5.0.1" );
        capabilities.setCapability( "deviceName", "API21" );
        capabilities.setCapability( "appPackage", "com.cybozu.kunailite" );
        capabilities.setCapability( "appActivity", ".ui.MainActivity" );
        capabilities.setCapability( "autoLaunch", "false" );
        AppiumDriver wd = new AndroidDriver( new URL( "http://localhost:4723/wd/hub" ), capabilities );

        try
        {
            wd.launchApp();
            Thread.sleep( 3000 );
            wd.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS );
            wd.findElement( By.xpath( "//*[@text='New']" ) ).click();
            wd.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS );
            wd.findElement( By.id( "com.cybozu.kunailite:id/sc_schedule_title" ) ).sendKeys( new String[]{ "222" } );
            //wd.findElement( By.id( "com.cybozu.kunailite:id/sc_schedule_title" ) ).sendKeys( "111" );
            wd.findElement( By.xpath( "//*[@text='Add']" ) ).click();
            Thread.sleep( 3000 );

        }
        finally
        {
            wd.quit();
        }

    }
}