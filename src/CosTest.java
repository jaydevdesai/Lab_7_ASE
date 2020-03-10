import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CosTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.cos (0), Math.cos (0));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.cos (90), Math.cos (90));
    }
}
