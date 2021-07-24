public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        String[] scoresResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

        // Draw scores Deuce or All
        if (isDrawScoreAnd(m_score1 > 2)) return "Deuce";
        if (isDrawScoreAnd(m_score1 < 3)) return scoresResult[m_score1] + "-All";

        // Winner scores Advantage or Win
        if (m_score1 >= 4 || m_score2 >= 4)
        {
            // TODO
            int diffScore = m_score1-m_score2;

            if (Math.abs(diffScore) == 1) score = "Advantage ";
            else score = "Win for ";

            if (diffScore > 0) score += "player1";
            else score += "player2";

            return score;
        }

        // Other Scores
        return scoresResult[m_score1] + "-" + scoresResult[m_score2];
    }

    private boolean isDrawScoreAnd(boolean deuceOrAll) {
        return m_score1 == m_score2 && deuceOrAll;
    }
}