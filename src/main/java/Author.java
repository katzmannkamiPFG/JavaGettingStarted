public class Author {
    private String name;
    private int numberOfBooks;

    Author(){
        name = "";
        numberOfBooks = 5;
    }

    public Author(String name, int numberOfBooks) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}




