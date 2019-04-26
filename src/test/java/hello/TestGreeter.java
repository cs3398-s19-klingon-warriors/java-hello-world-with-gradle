package hello;



import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;





public class TestGreeter {



   private Greeter g;
	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

   
   @Test
   public void newtestRKGreeterPass() 

   {


      g.setName("Great Name");

      assertEquals(g.getName(),"Great Name");

      assertEquals(g.sayHello(),"Hello Great Name!");

      g.setName("A Better Name");

      assertEquals(g.sayHello(),"Hello A Better Name!");



   }

   // Failing test
   // Commented out to test another new Pass, below
/*
   @Test
   public void newtestRKGreeterFail() 

   {

      assertEquals(g.getName(),"fake name");

      assertEquals(g.sayHello(),"Goodbye!");

   }
*/

	   @Test
   public void newtestRKGreeterPassBool() 

   {
	assertFalse(g.haveName());


	g.setName("Now I have a name");


	assertTrue(g.haveName());

   }


}
