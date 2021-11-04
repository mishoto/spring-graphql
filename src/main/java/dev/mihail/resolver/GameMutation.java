package dev.mihail.resolver;

import dev.mihail.model.Game;
import dev.mihail.model.input.CreateGameInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GameMutation implements GraphQLMutationResolver {

    private static final Logger logGameMutation = LoggerFactory.getLogger(GameMutation.class);

    public Game createGame(CreateGameInput inputName){
        logGameMutation.info("Creating Game with name {} ", inputName);

        return new Game(inputName.getName());
    }
}
