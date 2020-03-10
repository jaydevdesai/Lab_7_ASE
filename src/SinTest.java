import org.junit.jupiter.api.*;

public class SinTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.sin (0), Math.sin (Trig.deg2rad (0)));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.sin (45), Math.sin (Trig.deg2rad (45)));
    }

    @Test
    void test3(){
        Assertions.assertEquals (Trig.sin (-90), Math.sin (Trig.deg2rad (-90)));
    }

    @Test
    void test4(){
        Assertions.assertEquals (Trig.sin (90), Math.sin (Trig.deg2rad (90)));
    }

    @Test
    void test5(){
        Assertions.assertEquals (Trig.sin (-45), Math.sin (Trig.deg2rad (-45)));
    }
}
