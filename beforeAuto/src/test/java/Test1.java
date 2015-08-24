import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by John on 24.08.2015.
 */
public class Test1 {

    @BeforeMethod
    public static void start() {
        Configuration.browser = System.getProperty("browser", "firefox");
        Configuration.startMaximized = true;
    }

    @Test
    public void testPush (){
        open("http://www.tut.by/");
        System.out.println("BEFORE BUILD PASSED");
    }
}
