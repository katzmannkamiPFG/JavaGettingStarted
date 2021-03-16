import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekThreeExercisesPartOne {
   // class visibility
   // static variables vs. instance variables
   // getters
   // setters
   // methods
   // constructors
   // access modifiers modifiers (public, protected, private, none) (

//    Access Levels
//    Modifier	Class	Package	Subclass	World
//    public	Y	Y	Y	Y
//    protected	Y	Y	Y	N
//    no modifier	Y	Y	N	N
//    private	Y	N	N	N

    // subclass vs superclass
    // using the final keyword

    // arrays
    // pass by value vs reference

    // incrementally build out a solution using exercises



    @Test
    public void myTest(){
        Author kami = new Author("Kami Katzmann", 5);

        assertEquals(5,kami.getNumberOfBooks());
    }

    @Test
    public void myBookTest(){
        Book nemo = new Book("Nemo", "mystery", "Kami Katzmann");

        assertEquals("mystery", nemo.getGenre());
    }
}