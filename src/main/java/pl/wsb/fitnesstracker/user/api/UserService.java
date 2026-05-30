package pl.wsb.fitnesstracker.user.api;

public interface UserService {

    /**
     * Creates a new user.
     *
     * @param user The user to be created
     * @return The created user
     */
    User createUser(User user);

    /**
     * Updates an existing user.
     *
     * @param userId The ID of the user to be updated
     * @param userDto Data containing new values
     * @return The updated user
     */
    User updateUser(Long userId, UserDto userDto);

    /**
     * Deletes a user by their ID.
     *
     * @param userId The ID of the user to be deleted
     */
    void deleteUser(Long userId);
}