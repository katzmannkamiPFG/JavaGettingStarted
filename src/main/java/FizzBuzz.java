public class FizzBuzz {
    public String execute(Integer number) {
        if (( number % 3 == 0) && (number % 5 == 0))
            return "FizzBuzz";
        if ( number % 2 == 0)
            return "2";
        if ( number % 3 == 0)
            return "Fizz";
        if ( number % 5 == 0)
            return "Buzz";
        else
            return "1";
    }
}




////original:
//public class FizzBuzz {
//    public String execute(Integer number) {
//        return "1";
//    }
//}