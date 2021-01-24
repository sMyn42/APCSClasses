package base.soccerteam;

public class FIFAWorldCup {

    public static void main (String[] args) {

        SoccerTeam usa = new SoccerTeam();
        SoccerTeam france = new SoccerTeam();
        SoccerTeam germany = new SoccerTeam();
        SoccerTeam japan = new SoccerTeam();

        //Play games

        SoccerTeam.startTournament();

        usa.played(france, 3, 6);
        usa.played(japan, 1, 0);
        usa.played(germany, 1, 4);
        usa.played(france, 2, 2);
        usa.played(japan, 4, 4);
        usa.played(germany, 2, 3);

        france.played(germany, 2, 1);
        france.played(japan, 5, 6);
        france.played(germany, 0, 2);
        france.played(japan, 3, 1);

        germany.played(japan, 2, 0);
        germany.played(japan, 3, 3);

        //Report Results of the First Tournament

        System.out.println("------------Standings: FIFA 2014 World Cup Group B - Men's-------------");
        System.out.println("Total Games Played: " + SoccerTeam.getTournamentGamesPlayed());
        System.out.println("Total Goals Scored: " + SoccerTeam.getTournamentGoalsScored());
        System.out.println("");
        System.out.println("Germany:       " + germany.getPoints());
        System.out.println("Japan:         " + japan.getPoints());
        System.out.println("France:        " + france.getPoints());
        System.out.println("United States: " + usa.getPoints());
        System.out.println("-----------------------------------------------------------------------");

        //Play games

        SoccerTeam.startTournament();
            germany.reset();
            usa.reset();
            france.reset();
            japan.reset();

        usa.played(france, 4, 0);
        usa.played(japan, 5, 0);
        usa.played(germany, 3, 2);
        usa.played(france, 9, 1);
        usa.played(japan, 13, 2);
        usa.played(germany, 2, 1);

        france.played(germany, 2, 1);
        france.played(japan, 8, 1);
        france.played(germany, 0, 6);
        france.played(japan, 4, 5);

        germany.played(japan, 8, 3);
        germany.played(japan, 3, 3);


        //Report Results of the Second Tournament

        System.out.println("-----------Standings: FIFA 2014 World Cup Group B - Women's------------");
        System.out.println("Total Games Played: " + SoccerTeam.getTournamentGamesPlayed());
        System.out.println("Total Goals Scored: " + SoccerTeam.getTournamentGoalsScored());
        System.out.println("");
        System.out.println("Germany:       " + germany.getPoints());
        System.out.println("Japan:         " + japan.getPoints());
        System.out.println("France:        " + france.getPoints());
        System.out.println("United States: " + usa.getPoints());
        System.out.println("-----------------------------------------------------------------------");

    }

}
