import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.form().selectItemForms();
        app.form().selectPracticeForm();
        app.form().hideFooter();

    }
    @Test
    public void formTest(){
        //app.form().fillForm();
    }


}
