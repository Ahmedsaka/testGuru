import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBarTest {

    @Test
    void name() {

        FooBar foo = new FooBar();

        String result = foo.getFoo();

        assertEquals("Foo", result);
    }

    @Test
    void getBar() {
        FooBar foo = new FooBar();

        String result = foo.getBar();

        assertEquals("Bar", result);
    }
}