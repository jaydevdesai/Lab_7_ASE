import org.junit.jupiter.api.*;

public class SinTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.sin (0), Math.sin (0));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.sin (90), Math.sin (90));
    }

}
