import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TanTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.tan (0), Math.tan (Trig.deg2rad (0)));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.tan (-45), Math.tan (Trig.deg2rad (-45)));
    }

    @Test
    void test3(){
        Assertions.assertEquals (Trig.tan (135), Math.tan (Trig.deg2rad (135)));
    }

    @Test
    void test4(){
        Assertions.assertEquals (Trig.tan (45), Math.tan (Trig.deg2rad (45)));
    }

    @Test
    void test5(){
        Assertions.assertEquals (Trig.tan (-135), Math.tan (Trig.deg2rad (-135)));
    }

}
