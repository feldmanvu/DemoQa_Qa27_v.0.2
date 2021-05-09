import org.testng.annotations.Test;

public class QuickTest extends TestBase{
    @Test(groups = {"my","pay"})
    public void quicktest(){
        logger.info("Passsed quick");

    }
}
