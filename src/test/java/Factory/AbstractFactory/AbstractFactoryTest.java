package Factory.AbstractFactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void TestAbstractFactory(){
        TestCaseFactory billTestCaseFactory=new BillTestCaseFactory();
        TestCaseFactory orderTestCaseFactory=new OrderTestCaseFactory();
        billTestCaseFactory.createTestCase().Test();
        billTestCaseFactory.createTestCaseMode().showMode();
        billTestCaseFactory.createTestCaseResult().showResult();
        orderTestCaseFactory.createTestCase().Test();
        orderTestCaseFactory.createTestCaseResult().showResult();
        orderTestCaseFactory.createTestCaseMode().showMode();
    }
}
