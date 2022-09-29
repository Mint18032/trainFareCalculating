import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Equivalence Partitioning Testing.
 */
public class EPTest {

    @Test
    public void test1() {
        int h = 24;
        int age = 5;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, -1);
    }

    @Test
    public void test2() {
        int h = 5;
        int age = 201;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, -1);
    }

    @Test
    public void test3() {
        int h = 12;
        int age = 3;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 0);
    }

    @Test
    public void test4() {
        int h = 8;
        int age = 8;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 45000);
    }

    @Test
    public void test5() {
        int h = 16;
        int age = 8;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 30000);
    }

    @Test
    public void test6() {
        int h = 8;
        int age = 36;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 60000);
    }

    @Test
    public void test7() {
        int h = 16;
        int age = 36;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 40000);
    }

    @Test
    public void test8() {
        int h = 8;
        int age = 67;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 51000);
    }

    @Test
    public void test9() {
        int h = 16;
        int age = 67;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 34000);
    }
}