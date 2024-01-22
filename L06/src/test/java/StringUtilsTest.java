import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtilsTest {

    @Test
    public void joinArray() {

        ArrayList<String> sArr = new ArrayList<>(Arrays.asList("a","b"));
        char delimiter = '3';
        String res = org.example.StringUtils.joinArray(sArr,delimiter);
        String actual = "a3b3";
        Assert.assertEquals(res, actual);

    }
}