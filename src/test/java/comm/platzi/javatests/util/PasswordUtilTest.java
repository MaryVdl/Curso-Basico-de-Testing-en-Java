package comm.platzi.javatests.util;

import org.junit.Test;

import static comm.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        //Funcion de comprobacion de Junit (assertEquals)
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        //Funcion de comprobacion de Junit (assertEquals)
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefg"));
    }
    @Test
    public void medium_then_has_letter_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("1234abcde"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_simbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abc12!er!"));
    }

}