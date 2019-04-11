package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;


   @Test
   public void newtestRKGreeterPass() 

   {


      g.setName("Great Name");

      assertEquals(g.getName(),"Great Name");

      assertEquals(g.sayHello(),"Hello + Great Name!");

      g.setName("A Better Name");

      assertEquals(g.sayHello(),"Hello + A Better Name!");



   }

/*
   @Test
   public void newtestRKGreeterFail() 

   {

      assertEquals(g.getName(),"fake name");

      assertEquals(g.sayHello(),"Goodbye!");

   }
*/
	

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

}
