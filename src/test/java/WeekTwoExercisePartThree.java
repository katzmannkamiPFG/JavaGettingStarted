
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Friday the thirteenth is fabled to be an 'unlucky' day.  Implement the code below to
 * discover which thirteenth dates from any given year fall on a Friday.
 *
 * Each test below has a @Disabled attribute that must be removed in order for that test
 * to run.
 *
 * Implement each step in the simplest manner possible where all tests continue to pass.
 *
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may innclude just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to the
 * called function, you did too much and should start over from the previous test unless it's one
 * if the last two or three.  The final couple of tests are just for verification.
 */

public class WeekTwoExercisePartThree {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?

    @Test

    public void sendingAnActualFridayTheThirteenthReturnsTrue() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2019, 9, 13);

        assertTrue(actual);
    }

    @Test

    public void sendingNotAFridayTheThirteenthDateReturnsFalse() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2019, 11, 13);

        assertFalse(actual);
    }

    @Test

    public void sendingFridayTheThirteenthFromAnotherYearReturnsFalse() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2020, 11, 13);

        assertTrue(actual);
    }

    @Test

    public void sendingTwentySixteenReturnsOnlyOneFridayTheThirteenth() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        LocalDate[] actual = unluckyDatesByYear(2016);
        LocalDate[] expected = new LocalDate[]{
                LocalDate.of(2016, 5, 13),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void sendingTwentyNinteenReturnsTwoFridayTheThirteenths() {
        //  TODO: write this test and, if necessary, make any changes to make it pass
        //  TODO: don't forget to commit after passing the test
    }

    @Test

    public void sendingTwentyFifteenReturnsThreeFridayTheThirteenths() {
        //  TODO: write this test and, if necessary, make any changes to make it pass
        //  TODO: don't forget to commit after passing the test
    }

    // TODO Implementation Implement your changes to make the tests pass here...

    public LocalDate[] unluckyDatesByYear(int year) {
        LocalDate[] localDates = new LocalDate[12];
          LocalDate workingDate;

          for (int month = 1, positionInArray = 0; month <= 12; month++) {
              if (isUnluckyDate(year,month,13)) {
                  localDates[positionInArray] = LocalDate.of(year, month, 13);
              }
          }

//        if (year == 2015){
//            localDates[0] = LocalDate.of(2015, 2, 13);
//            localDates[1] = LocalDate.of(2015, 3,13);
//            localDates[2] = LocalDate.of(2015, 11, 13);
//        }
//        else
//        if (year == 2016){
//            localDates[0] = LocalDate.of(2016, 5, 13);
//        }
//        else
//        if (year == 2019){
//            localDates[0] = LocalDate.of(2019, 9, 13);
//            localDates[0] = LocalDate.of(2019, 12,13);
//        }
        return localDates;

    }
     public boolean isUnluckyDate(int year, int month, int day) {
         DayOfWeek dayOfWeek = LocalDate.of(year,month,day).getDayOfWeek();
         if (dayOfWeek == DayOfWeek.FRIDAY){
             return true;

         }
//        if ((day == 13) && (month == 9) && (year == 2019))
//            return true;
//        if ((day == 13) && (year != 2019))
//            return true;
//        if ((day != 13) && (month != 11))
//            return true;
////        if ((day == 13) && (year == 2016))
////            return true;

        else
        return false;
    }
}

//original:
//    public LocalDate[] unluckyDatesByYear(int year) {
//        LocalDate[] localDates = new LocalDate[12];
//
//        return localDates;
//    }
//
//    public boolean isUnluckyDate(int year, int month, int day) {
//        return false;
//    }
//}