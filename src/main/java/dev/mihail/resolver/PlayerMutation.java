package dev.mihail.resolver;

import dev.mihail.model.Player;
import dev.mihail.repository.PlayerRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerMutation implements GraphQLMutationResolver {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerMutation(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public Player createPlayer(String name, Integer age, Integer scores, String avatar){
        Player player = new Player();
                player.setName(name);
                player.setAge(age);
                player.setScores(scores);
                player.setAvatar(avatar);

                return playerRepository.save(player);
    }

    public Player updatePlayer(String name, Integer age, Integer scores, final String avatar) {
        Player player = playerRepository.findPlayerByAvatar(avatar);
        Player updatedPlayer = new Player();
        updatedPlayer.setName(name);
        updatedPlayer.setAge(age);
        updatedPlayer.setScores(scores);
        updatedPlayer.setAvatar(player.getAvatar());

        return playerRepository.save(updatedPlayer);
    }

    public String deletePlayer(String avatar) {

        int rowsAffected = playerRepository.deletePlayerByAvatar(avatar);

        return rowsAffected > 0 ? "Delete was successful" : "Delete was not successful";
    }
}
