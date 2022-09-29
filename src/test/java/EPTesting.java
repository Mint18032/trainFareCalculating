import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Equivalence Partitioning Testing.
 */
public class EPTesting {
    @Test
    public void test1() {
        int h = 24;
        int age = 5;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(-1, price);
    }
}