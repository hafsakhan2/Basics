
public class FizzBuzz {

    for(int i = 0; i< 20; i++)
    {
        if((i%3 == 0) && (i%5 == 0))
        {
            System.out.println("FizzBUzz");
        }
        else if(i%3 == 0)
        {
            System.out.println("Fizz");
        }
        else if(i%5 == 0)
        {
            System.out.println("Buzz");
        }
    }
}
