package comm.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", -1));

    }

    @Test
    public void isEmpty_with_null(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_with_Empty_Spaces(){
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void isEmpty_isEmpty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmpty_correct_test_false(){
        Assert.assertTrue(StringUtil.isEmpty("Hello World!"));
    }

    @Test
    public void isEmpty_correct_test_correct(){
        Assert.assertFalse(StringUtil.isEmpty("Hello World!"));
    }

}