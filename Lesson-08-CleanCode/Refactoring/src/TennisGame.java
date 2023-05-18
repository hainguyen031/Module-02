public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String score = "";

        if (firstPlayerScore==secondPlayerScore)
        {
            switch (firstPlayerScore)
            {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (firstPlayerScore>=4 || secondPlayerScore>=4) {
            score = checkWinnerPlayer(firstPlayerName, secondPlayerName, firstPlayerScore, secondPlayerScore);
        } else {
            calculateScore(firstPlayerScore, secondPlayerScore);
        }
        return score;
    }

    private static void calculateScore(int firstPlayerScore, int secondPlayerScore) {
        for (int i = 1; i< 3; i++) {
            String score = "";
            int tempScore = 0;
            if (i == 1) tempScore = firstPlayerScore;
            else { score+="-"; tempScore = secondPlayerScore;}
            switch(tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
    }

    private static String checkWinnerPlayer(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String score;
        int minusResult = firstPlayerScore - secondPlayerScore;
        if (minusResult == 1) score = "Advantage " + firstPlayerName;
        else if (minusResult ==-1) score = "Advantage "+ secondPlayerName;
        else if (minusResult >= 2) score = "Win for "+ firstPlayerName;
        else score ="Win for "+ secondPlayerName;
        return score;
    }
}