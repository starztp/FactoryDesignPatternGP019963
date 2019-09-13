package Factory.AbstractFactory;

import Factory.TestCase;
import Factory.TestCaseMode;
import Factory.TestCaseResult;

public interface TestCaseFactory {
    TestCase createTestCase();
    TestCaseMode createTestCaseMode();
    TestCaseResult createTestCaseResult();
}
