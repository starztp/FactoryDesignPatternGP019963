package Factory.SimpleFactory;

import Factory.BillTestCase;
import Factory.OrderTestCase;
import Factory.TestCase;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void TestSimpleFactory(){
        TestCaseFactory factory=new TestCaseFactory();
        TestCase orderCase=factory.CreateTestCase(OrderTestCase.class);
        TestCase billCase=factory.CreateTestCase(BillTestCase.class);
        orderCase.Test();
        billCase.Test();
    }

}
