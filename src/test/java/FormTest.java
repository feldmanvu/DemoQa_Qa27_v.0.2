import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        wd.findElement(By.xpath("//h5[.='Forms']")).click();
        wd.findElement(By.xpath("//span[.='Practice Form']")).click();

    }
    @Test
    public void formTest(){
        typeByLocator(By.id("firstName"),"Lola");
        typeByLocator(By.id("lastName"),"Now");
    }


}
