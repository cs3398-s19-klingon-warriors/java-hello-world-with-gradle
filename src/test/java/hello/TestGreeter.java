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

   @Test
   public void testGreeterSGGreeterPass(){
       g.setName("Ingio Montoya");
       assertEquals(g.getName(), "Ingio Montoya");
       assertEquals(g.sayHello(), "Hello Ingio Montoya!");
   }

   @Test
   public void testGreeterSGGreeterFail(){
       g.setName("Kitty Whompus");
       assertEquals(g.getName(), "Catty Corner");
       assertEquals(g.sayHello(), "Hello Catty Corner!");
   }
   
}

