import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tessttclass<i> {


    @Before
    public  void setup()
    {
        fizzbuzz fizzbuzz = new fizzbuzz();

    }
    @Test
    public void testnumber()
    {
       int number = 1;
       String numberr =  fizzbuzz.play(number);

        Assert.assertEquals("1", numberr);
    }
    @Test
    public void testfizz()
    {
        int number = 3;
        String numberr = fizzbuzz.play(number);

        Assert.assertEquals("fizz", numberr);
    }

    @Test
    public void testdivisibleby3()
    {
        int number = 6;
        String numberr = fizzbuzz.play(number);

        Assert.assertEquals("fizz", numberr);
    }

    @Test
    public void testbuzz()
    {
        int number  = 5;
        String string = fizzbuzz.play(number);
        Assert.assertEquals("buzz", string);
    }

   @Test
   public void divisileby5()
   {
       int number = 10;
       String string = fizzbuzz.play(number);
       Assert.assertEquals("buzz", string);
   }

   @Test
    public void divisibleBy_5_And_3()
   {
       int number = 15;
       String string = fizzbuzz.play(number);
       Assert.assertEquals("fizzbuzz", string);
   }

   // stage 2 tests
   @Test
    public void number_is_fizz_divisibleBy_3_or_has_3_init()
   {
       int number = 38;
       String string  = fizzbuzz.playstage2(number);

       Assert.assertEquals("fizz", string);
   }

   @Test
   public void number_is_buzz_divisibleBy_5_or_has_5_init()
   {
       int number = 58;
       String string  = fizzbuzz.playstage2(number);

       Assert.assertEquals("buzz", string);
   }

   @Test
    public void number_is_not_divisibleByBoth_andnotcontains_5_Or_3()
   {
       int number = 28;
       String s = fizzbuzz.playstage2(number);
       Assert.assertEquals("28", s);
   }

}
