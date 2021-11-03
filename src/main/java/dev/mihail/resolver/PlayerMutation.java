package dev.mihail.resolver;

import dev.mihail.model.Player;
import dev.mihail.repository.PlayerRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerMutation implements GraphQLMutationResolver {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(String name, Integer age, Integer scores, String avatar){
        Player player = new Player();
                player.setName(name);
                player.setAge(age);
                player.setScores(scores);
                player.setAvatar(avatar);

                return playerRepository.save(player);
    }
}
