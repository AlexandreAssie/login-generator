package geco;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.*;

public class LoginServiceTest {
    private String[] liste = {"COUCOU","login1","login2"};
    private LoginService service = new LoginService(liste);
    @Test
    public void loginExists() throws Exception {
        assertThat(service.loginExists("COUCOU"),is(true));

        assertThat(service.loginExists("truc"),is(false));
    }

    @Test
    public void addLogin() throws Exception {
        String test1 = "Test";
        service.addLogin(test1);
        assertThat(service.loginExists(test1),is(true));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        String[] test = {"login1","login2"};
        assertThat(service.findAllLoginsStartingWith("l"),hasItems(test));
    }

    @Test
    public void findAllLogins() throws Exception {
        assertThat(service.findAllLogins(),hasItems(liste));


    }

}