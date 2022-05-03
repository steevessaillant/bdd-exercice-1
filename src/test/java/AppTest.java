import static org.junit.Assert.assertTrue;

import org.example.App;
import org.example.Role;
import org.example.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final App application = new App();

    @Before
    public void setup(){
        this.application.getUsers().clear();
    }
    @Test
    public void appCreateNewShouldAddAllNewUsersToItsUsersList()
    {
        this.application.createNewUser("testuser","!!@#$$$ytuttest", Role.USER);
        this.application.createNewUser("testadmin","!!@#$$$ytuttestadmin",Role.ADMIN);
        Assert.assertEquals(2,this.application.getUsers().size());
    }

    @Test
    public void appCreateNewShouldReturnNewlyAddedUserAndsAlsoAddItToTheUsersList()
    {
        User testUser = this.application.createNewUser("testuser","!!@#$$$ytuttest",Role.USER);
        Assert.assertSame(testUser,this.application.getUsers().get(0));
    }

    @Test
    public void appLoginShouldReturnAnExistingUserFromUsersListAndAuthenticateThisUser()
    {
        User testUser = this.application.login(this.application.createNewUser("testuser","!!@#$$$ytuttest",Role.USER));
        assertTrue(Objects.requireNonNull(testUser).isAuthenticated());
    }
    @Test(expected = NullPointerException.class)
    public void appLoginShouldThrowANullPointerExceptionWhenUserIsNull()
    {
        User testUser = this.application.login(null);
    }
}
