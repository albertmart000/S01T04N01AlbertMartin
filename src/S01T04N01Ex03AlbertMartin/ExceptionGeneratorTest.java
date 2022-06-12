package Ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionGeneratorTest {

    @Test
    void testArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException{
        ExceptionGenerator exceptionGenerator= new ExceptionGenerator("");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> exceptionGenerator.trowException());
    }
}
