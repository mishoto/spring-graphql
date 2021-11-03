package dev.mihail.repository;

import dev.mihail.exceptions.PlayerNotFoundException;
import dev.mihail.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();


    default Player findPlayerByAvatar(String avatar) {
        String sqlQuery = "SELECT * FROM PLAYER WHERE PLAYER.AVATAR = '?'";
            Optional<Player> optionalPlayer = Optional.ofNullable(jdbcTemplate.queryForObject(sqlQuery,
                                                              Player.class, avatar));
            if (optionalPlayer.isEmpty()){
                throw new PlayerNotFoundException("Player With Avatar" + avatar + "Not Found");
            }
            return jdbcTemplate.queryForObject(sqlQuery, Player.class, avatar);
    }

    default List<Player> extractAllPlayers() {
        String sqlQuery = "SELECT * FROM PLAYER";
        return jdbcTemplate.queryForList(sqlQuery, Player.class);
    }

    default int extractNumberOfPlayers() {
        String sqlQuery = "SELECT COUNT (PLAYER.AVATAR) FROM PLAYER";
        List<Player> playerList = jdbcTemplate.queryForList(sqlQuery, Player.class);
        return playerList.size();
    }

    default int deletePlayerByAvatar(String avatar) {
        String sqlQuery = "DELETE * FROM PLAYER WHERE PLAYER.AVATAR = '?'";
        Optional<Player> optionalPlayer = Optional.ofNullable(jdbcTemplate.queryForObject(sqlQuery,
                Player.class, avatar));
        if (optionalPlayer.isEmpty()){
            throw new PlayerNotFoundException("Player With Avatar" + avatar + "Not Found");
        }
            return jdbcTemplate.update(sqlQuery, avatar);
    }
}
