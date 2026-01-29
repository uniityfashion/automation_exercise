package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.DeleteUser;
import org.testng.annotations.Test;

public class DeleteUserTest extends BaseTest {

    @Test
    public void delUserTest(){
        DeleteUser obj = new DeleteUser(driver);
        obj.delUser();
    }

}