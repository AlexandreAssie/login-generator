package geco;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration passwordGeneration = new PasswordGeneration();
    @Test
    public void testPassword(){
        assertThat(passwordGeneration.getRandomPassword().length(),is(8));


        assertThat(passwordGeneration.getRandomPassword().length(),is(8));

        assertThat(passwordGeneration.getRandomPassword().length(),is(8));
    }
}