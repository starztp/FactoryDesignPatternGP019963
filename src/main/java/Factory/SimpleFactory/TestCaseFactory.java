package Factory.SimpleFactory;

import Factory.TestCase;

public class TestCaseFactory {
   public TestCase CreateTestCase(Class clazz){
       if(clazz!=null){
           try {
               return (TestCase) clazz.newInstance();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return null;
   }
}
