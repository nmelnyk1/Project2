package Generics3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bekham = new SoccerPlayer("Bekham");

       // Team dynamo = new Team("Dynamo");

        Team <FootballPlayer> dynamo= new Team<>("Dynamo");
        dynamo.addPlayer(joe);

       /*dynamo.addPlayer(pat);
        dynamo.addPlayer(bekham);*/
        System.out.println(dynamo.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago bulls");
        baseballTeam.addPlayer(pat);


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(dynamo, 3, 8);

        dynamo.matchResult(fremantle, 2, 1);
//        dynamo.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(dynamo.getName() + ": " + dynamo.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(dynamo.compareTo(melbourne));
        System.out.println(dynamo.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(dynamo));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams = new ArrayList<>();
        Collections.sort(teams);
    }
}


