package base.soccerteam;

public class SoccerTeam {

    private int wins, losses, ties;

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
    }



}
