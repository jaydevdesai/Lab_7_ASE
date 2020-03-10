import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CosTest {

    @Test
    void test1(){
        Assertions.assertEquals (Trig.cos (0), Math.cos (Trig.deg2rad (0)));
    }

    @Test
    void test2(){
        Assertions.assertEquals (Trig.cos (-45), Math.cos (Trig.deg2rad (-45)));
    }

    @Test
    void test3(){
        Assertions.assertEquals (Trig.cos (-60), Math.cos (Trig.deg2rad (-60)));
    }

    @Test
    void test4(){
        Assertions.assertEquals (Trig.cos (45), Math.cos (Trig.deg2rad (45)));
    }

    @Test
    void test5(){
        Assertions.assertEquals (Trig.cos (30), Math.cos (Trig.deg2rad (30)));
    }
}
