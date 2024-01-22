import org.junit.Test;

public class MarkedClassTest {
    @Test
    public void myMark_implementation_markedClass(){
        MarkedClass markedClass = new MarkedClass();
        NonMarkedClass nonMarkedClass = new NonMarkedClass();
        //test(markedClass);
    }

    static String test(MyMark markedObject) {
        return "Метод 'Test' успешно завершен!";
    }

}