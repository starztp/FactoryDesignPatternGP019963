package Factory.FactoryMethod;

import Factory.OrderTestCase;
import Factory.TestCase;

public class OrderTestCaseFactory implements TestCaseFactory{

    public TestCase CreateTestCase() {
        return new OrderTestCase();
    }
}
