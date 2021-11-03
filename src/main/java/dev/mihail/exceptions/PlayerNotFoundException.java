package dev.mihail.exceptions;

public class PlayerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 3591518762764266414L;

    public PlayerNotFoundException(String avatar) {
        super("Player not found with this email: " + avatar);
    }
}
