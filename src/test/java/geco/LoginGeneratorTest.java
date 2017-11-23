package geco;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService = new LoginService(new String[]{"JROL","BPER","CGUR","JDUP","JRAL","JRAL1"});

    private LoginGenerator loginGenerator = new LoginGenerator(loginService);

    @Test
    public void testGenerator(){


        assertThat(loginGenerator.generateLoginForNomAndPrenom("Durant","Paul"),is("PDUR"));
    }

    @Test
    public void test2Generator(){
               assertThat(loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"),is("JROL1"));
    }

    @Test
    public void testAccentGenerator(){


        assertThat(loginGenerator.generateLoginForNomAndPrenom("Durant","Paul"),is("PDUR"));
    }

    @Test
    public void testCoco(){

        assertThat(loginGenerator.generateLoginForNomAndPrenom("Raling","John"),is("JRAL2"));

    }
}