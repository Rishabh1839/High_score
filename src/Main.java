public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Rish", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Kevin", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Daniel", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Aaron", position);

    }
    // Create method called Display high score position
    // players name as name as a parameter
    // and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " has managed to get in position");
        System.out.println(position + " on the high score table");
    }
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    public static int calculateHighScorePosition(int score){
        //1 if the score is >=1000
        if(score >= 1000)
        {
            return 1;
        }
        //2 if the score is >=500 and < 1000
        else if(score >= 500)
        {
            return 2;
        }
        //3 if the score is >=100 and < 500
        else if(score >= 100)
        {
            return 3;
        }
        //4 in all other cases
        else
        {
            return 4;
        }
    }
}
