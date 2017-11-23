package geco;

import java.util.Random;

public class PasswordGeneration {

    private String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public String getRandomPassword(){
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rand.nextFloat() * characters.length());
            salt.append(characters.charAt(index));
        }
        String password = salt.toString();
        return password;

    }
}
