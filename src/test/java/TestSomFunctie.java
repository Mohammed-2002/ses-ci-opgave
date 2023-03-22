import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSomFunctie {

    @Test
    public void geeftDeSomFunctieEffectiefDeSomVAnTWeePositieveGetallen(){

        Calculator calculator = new Calculator(3,5);

        double som = calculator.getSommatie();

        Assertions.assertEquals(8,som);
    }
    @Test
    public void geeftDeSomFunctieEffectiefDeSomVAnTWeeNegatieveGetallen(){

        Calculator calculator = new Calculator(-3,-5);

        double som = calculator.getSommatie();

        Assertions.assertEquals(-8,som);
    }


}

