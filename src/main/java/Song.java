import java.time.LocalDate;

public class Song {

    private String title;
    private int numberOfWriters;
    private LocalDate datePublished;


    Song(){
        title = "";
        numberOfWriters = 0;
//        datePublished = LocalDate.of("", "", "");
    }


    Song(String title, int numberOfWriters){
        this.title = title;
        this.numberOfWriters = numberOfWriters;
    }

    public Song(LocalDate datePublished) {
        this.datePublished = datePublished;
    }


    public String getTitle() {
        return title;
    }

    public int getNumberOfWriters() {
        return numberOfWriters;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

//    public void setDatePublished(LocalDate datePublished) {
//        this.datePublished = datePublished;
//    }
}
