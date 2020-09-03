import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tessttclass {


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

    public void testdivisibleby3()
    {
        int number = 6;
    }


}
