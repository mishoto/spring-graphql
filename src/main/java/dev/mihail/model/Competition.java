package dev.mihail.model;

import org.springframework.data.annotation.Id;
import java.util.List;

public class Competition {

    @Id
    private Integer id;
    private String name;
    private CompTypeByDifficulty difficulty;
    private CompTypeByNumberOfPlayers numberOfPlayers;
    private List<Player> playerList;
    private Game game;
}
