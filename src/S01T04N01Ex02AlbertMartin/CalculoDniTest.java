package S01T04N01Ex02AlbertMartin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)

public class calculoDniTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj= new ArrayList<>();
        obj.add(new Object[]{12345678,'Z'});
        obj.add(new Object[]{11111111,'H'});
        obj.add(new Object[]{22222222,'J'});
        obj.add(new Object[]{33333333,'P'});
        obj.add(new Object[]{44444444,'A'});
        obj.add(new Object[]{55555555,'K'});
        obj.add(new Object[]{66666666,'Q'});
        obj.add(new Object[]{77777777,'B'});
        obj.add(new Object[]{88888888,'Y'});
        obj.add(new Object[]{99999999,'R'});

        return obj;
    }

    private int dni;
    private char exp;

    public calculoDniTest(int dni, char exp){
        this.dni= dni;
        this.exp= exp;
    }

    @Test
    public void testCalculateDniLetter() {
        CalculoDni calculoDni= new CalculoDni(dni);
        char letter= calculoDni.calculateDniLetter(dni);
        assertEquals(exp, letter);
        }

}
