package Factory.AbstractFactory;

import Factory.*;

public class OrderTestCaseFactory implements TestCaseFactory{

    public TestCase createTestCase() {
        return new OrderTestCase();
    }

    public TestCaseMode createTestCaseMode() {
        return new OrderTestCaseMode();
    }

    public TestCaseResult createTestCaseResult() {
        return new OrderTestCaseResult();
    }
}
