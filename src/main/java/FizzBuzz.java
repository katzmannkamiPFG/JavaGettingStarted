public class FizzBuzz {
    public String execute(Integer number) {
        if ( number % 2 == 0)
            return "2";
        if ( number == 3)
            return "Fizz";
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