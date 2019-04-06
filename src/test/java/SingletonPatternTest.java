
import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

import java.lang.reflect.Constructor;



public class SingletonPatternTest {

    @Test
    public void shoouldReturnInstance() {
        // Given

        // When
        final SingletonPattern singleton = SingletonPattern.getInstance();

        // Then
        assertNotNull(singleton);
    }


    @Test
    public void shoouldReturnSameInstance() {
        // Given

        // When
        final SingletonPattern singleton1 = SingletonPattern.getInstance();
        final SingletonPattern singleton2 = SingletonPattern.getInstance();

        // Then
        assertSame(singleton1, singleton2);
    }

    @Test
    public void shouldHavePrivateConstructor() {
        // Given

        //When
        Constructor<?>[] constructors = SingletonPattern.class.getConstructors();


        // then
        assertEquals(1, constructors.length);
        assertFalse(constructors[0].isAccessible());


    }
}