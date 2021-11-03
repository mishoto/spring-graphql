package dev.mihail.resolver;

import dev.mihail.model.Player;
import dev.mihail.repository.PlayerRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class PlayerQuery implements GraphQLQueryResolver {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerQuery(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public int countPlayers() {
        return playerRepository.extractNumberOfPlayers();
    }

    public List<Player> findAllPlayers() {
        return playerRepository.extractAllPlayers();
    }
}
