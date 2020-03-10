import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TanTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.tan (0), Math.tan (0));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.tan (90), Math.tan (90));
    }

}
