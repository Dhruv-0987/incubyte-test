public class fizzbuzz {
    public static String play(int number) {
        if(number % 3 == 0 && number % 5 == 0) return "fizzbuzz";
        if(number % 3 == 0) return "fizz";
        if(number % 5 == 0) return "buzz";
        return String.valueOf(number);
    }

    public static String playstage2(int n) {
        int temp = n;
        if(n % 3 == 0) return "fizz";
        else if(n % 5 == 0) return "buzz";
        else if(n % 3 != 0)
        {
            while(n > 0)
            {
                if(n % 10 == 3)
                {
                    return "fizz";
                }
                n = n / 10;
            }
        }
        n = temp;

            while(n > 0)
            {
                if(n % 10 == 5)
                {
                    return "buzz";
                }
                else
                {

                }
                n = n / 10;
            }
        n = temp;


        return String.valueOf(n);
    }
}
