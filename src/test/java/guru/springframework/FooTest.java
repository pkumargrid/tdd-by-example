package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void getBar() {
        Foo f = new Foo();
        String result = f.getBar();
        assertEquals("FooBar",result);
    }
}