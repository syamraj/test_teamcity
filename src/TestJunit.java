import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void test123() {
	   message = "new";
      assertEquals(message,messageUtil.printMessage());
   }
}