package base.soccerteam;

public class SoccerTeam {

    private int wins, losses, ties;

    private static int tournamentGamesPlayed = 0, tournamentGoalsScored = 0;

    public SoccerTeam () { wins = 0; losses = 0; ties = 0; }

    public void win () { wins++; }
    public void lose () { losses++; }
    public void tie () { ties++; }

    public void played (SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore) {
            this.win();
            other.lose();
        } else if (myScore < otherScore) {
            this.lose();
            other.win();
        } else {
            this.tie();
            other.tie();
        }

        tournamentGamesPlayed++;
        tournamentGoalsScored += myScore + otherScore;

    }
    public int getPoints() {
        return 3 * wins + 1 * ties;
    }
    public void reset () {
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static void startTournament () {
        tournamentGoalsScored = 0;
        tournamentGamesPlayed = 0;
    }
    public static int getTournamentGoalsScored () {
        return tournamentGoalsScored;
    }
    public static int getTournamentGamesPlayed () {
        return tournamentGamesPlayed;
    }

}
