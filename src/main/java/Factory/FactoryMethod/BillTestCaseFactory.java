package Factory.FactoryMethod;

import Factory.BillTestCase;
import Factory.TestCase;

public class BillTestCaseFactory implements TestCaseFactory{

    public TestCase CreateTestCase() {
        return new BillTestCase();
    }
}
