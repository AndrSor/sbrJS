import org.junit.Assert;
import org.junit.Test;

public class MarkedClassTest {
    @Test
    public void myMark_implementation_markedClass(){
        MarkedClass markedClass = new MarkedClass();
        NonMarkedClass nonMarkedClass = new NonMarkedClass();
        //String res1 = test(markedClass);
        Assert.assertTrue(test(markedClass));
        Assert.assertTrue(test(markedClass));

    }

    static boolean test(MyMark markedObject) {
        return true;
    }

}