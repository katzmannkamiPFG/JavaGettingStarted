public class BowlingGame {
    // TODO: Why must this array have a size of 21?
//    // If the bowler utilized 2 rolls for each of the first 9 frames then got a strike in the last frame they get 2
//    extra rolls
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        int frame = 0;
        //int frame[] = new int[10];
        //int []frame = new int[10];
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
        for (int i = 0; i < 10; i++) {
//
             if (Spare(frame)) {
                score += 10 + spareBonus(frame);
                frame += 2;
            } else {
                score += sumOfRolls(frame);
                frame += 2;
            }
        }

        return score;
    }

//

    private boolean Spare(int frame) {
        return sumOfRolls(frame) == 10;
    }

//

    private int spareBonus(int frame) {
        return rolls[frame+2];
    }

    private int sumOfRolls(int frame) {
        return rolls[frame] + rolls[frame+1];
    }
}
//        score += rolls[0] + rolls[1];
//        score += rolls[2] + rolls[3];
//        score += rolls[4] + rolls[5];
//        score += rolls[6] + rolls[7];
//        score += rolls[8] + rolls[9];
//        score += rolls[10] + rolls[11];
//        score += rolls[12] + rolls[13];
//        score += rolls[14] + rolls[15];
//        score += rolls[16] + rolls[17];
//        score += rolls[18] + rolls[19];
//
////            bowlingGame.roll(pins);
////        for (int i = 0; i < 10; i++) {
////        }
////    }
//            return score;
//    }
//
//}