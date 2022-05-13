import static org.junit.Assert.assertTrue;

import org.example.App;
import org.example.Role;
import org.example.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final App application = new App();
    @Rule
    public ExpectedException thrown = ExpectedException.none();
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
    @Test
    public void appLoginShouldThrowANullPointerExceptionWhenUserIsNull()
    {
        thrown.expect(NullPointerException.class);
        this.application.login(null);
    }

    @Test
    public void promoteToAdminRoleShouldPromoteTheUserToAdmin() throws NullPointerException
    {
        User actual = this.application.login(this.application.createNewUser("testuser", "!!@#$$$ytuttest", Role.USER));
        this.application.promoteUserToAdmin(actual);
        if (actual != null) {
            Assert.assertSame(Role.ADMIN, actual.getRole());
        }else{
            Assert.fail();
        }
    }

    @Test
    public void promoteToAdminRoleShouldThrowANullPointerExceptionWhenUserIsNull()
    {
        thrown.expect(NullPointerException.class);
        this.application.promoteUserToAdmin(null);
    }
}
