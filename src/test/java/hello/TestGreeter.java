package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }

   @Test

  public void newtestTSGreeterPass()

   {
   		g.setName("*Robot beeping* 011101110001011010");

   		assertEquals(g.getName(),"*Robot beeping* 011101110001011010");

   		assertEquals(g.sayHello(),"Hello *Robot beeping* 011101110001011010!");

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

}