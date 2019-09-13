package Factory.FactoryMethod;

import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void TestFactoryMethod(){
        TestCaseFactory billfactory=new BillTestCaseFactory();
        TestCaseFactory orderfactory=new OrderTestCaseFactory();
        billfactory.CreateTestCase().Test();
        orderfactory.CreateTestCase().Test();
    }
}
