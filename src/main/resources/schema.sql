CREATE TABLE `player` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_age` int(11) NOT NULL DEFAULT 1,
  `p_name` varchar(255) NOT NULL DEFAULT `player`,
  `p_scores` int(11) NOT NULL DEFAULT 0,
  `p_avatar` varchar(255) NOT NULL UNIQUE DEFAULT `url`
  PRIMARY KEY (`p_id`)
);

CREATE TABLE `game` (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_name` varchar(255) NOT NULL UNIQUE DEFAULT `game`,
  PRIMARY KEY (`g_id`)
);

CREATE TYPE `difficulty` AS ENUM (`EASY`, `MEDIUM`, `HARD`);
CREATE TYPE `num_of_players` AS ENUM (`ONE`, `TWO`, `THREE`, `MULTIPLE`);

CREATE TABLE `competition` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL UNIQUE DEFAULT `CN001`,
  `c_difficulty` difficulty NOT NULL DEFAULT `EASY`,
  `c_players` num_of_players NOT NULL DEFAULT `ONE`
  PRIMARY KEY (`c_id`)
  FOREIGN KEY (`g_id`)
  FOREIGN KEY (`p_id`)
);