import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @org.junit.jupiter.api.Test
    void func() {
        Function func = new Function();
        double actual= func.func(6,1);
        double expected =0.21621621621621623;
        assertEquals(expected,actual);
    }
}