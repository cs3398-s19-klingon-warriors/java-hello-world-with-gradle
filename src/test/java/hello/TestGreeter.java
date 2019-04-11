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


   @Test

   public void test() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }


   // Assignment 16- Part 2a
   @Test
   public void newtest_SG_GreeterPass()
   {
      g.setName("RiIckkk");
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello Rickyyy");
   }
   // Assignment 16 - Part 5a
   @Test
   public void newtest_SG_GreeterFail()
   {
      g.setName("Morty");
      assertEquals(g.getName(),"(not) Morty");
      assertEquals(g.sayHello(),"Hello (not) Morty!");
   }

}