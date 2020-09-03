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
    public void divisibleBy5And3()
   {
       int number = 15;
       String string = fizzbuzz.play(number);
       Assert.assertEquals("fizzbuzz", string);
   }


}
