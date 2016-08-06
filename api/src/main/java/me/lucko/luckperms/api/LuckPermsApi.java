package me.lucko.luckperms.api;

import java.util.Optional;
import java.util.UUID;

/**
 * The root Api interface in LuckPerms
 */
@SuppressWarnings("unused")
public interface LuckPermsApi {

    /**
     * Schedules an update task to run
     */
    void runUpdateTask();

    /**
     * @return the version of the plugin running on the platform
     */
    String getVersion();

    /**
     * Gets a wrapped {@link LPConfiguration} instance, with read only access
     * @return a configuration instance
     */
    LPConfiguration getConfiguration();

    /**
     * Gets a wrapped {@link Datastore} instance, with somewhat limited access
     * @return a datastore instance
     */
    Datastore getDatastore();

    /**
     * Gets the {@link Logger} wrapping used by the platform
     * @return the logger instance
     */
    Logger getLogger();

    /**
     * Gets a wrapped {@link UuidCache} instance, providing read access to the LuckPerms internal uuid caching system
     * @return a uuidcache instance
     */
    UuidCache getUuidCache();

    /**
     * Gets a wrapped user object from the user storage
     * @param uuid the uuid of the user to get
     * @return a {@link User} object, if one matching the uuid is loaded, or null if not
     */
    User getUser(UUID uuid);

    /**
     * Gets a wrapped user object from the user storage. This method does not return null, unlike {@link #getUser(UUID)}
     * @param uuid the uuid of the user to get
     * @return an optional {@link User} object
     */
    Optional<User> getUserSafe(UUID uuid);

    /**
     * Gets a wrapped user object from the user storage
     * @param name the username of the user to get
     * @return a a {@link User} object, if one matching the uuid is loaded, or null if not
     */
    User getUser(String name);

    /**
     * Gets a wrapped user object from the user storage. This method does not return null, unlike {@link #getUser(String)}
     * @param name the username of the user to get
     * @return an optional {@link User} object
     */
    Optional<User> getUserSafe(String name);

    /**
     * Check if a user is loaded in memory
     * @param uuid the uuid to check for
     * @return true if the user is loaded
     */
    boolean isUserLoaded(UUID uuid);

    /**
     * Gets a wrapped group object from the group storage
     * @param name the name of the group to get
     * @return a {@link Group} object, if one matching the name exists, or null if not
     */
    Group getGroup(String name);

    /**
     * Gets a wrapped group object from the group storage. This method does not return null, unlike {@link #getGroup}
     * @param name the name of the group to get
     * @return an optional {@link Group} object
     */
    Optional<Group> getGroupSafe(String name);

    /**
     * Check if a group is loaded in memory
     * @param name the name to check for
     * @return true if the group is loaded
     */
    boolean isGroupLoaded(String name);

    /**
     * Gets a wrapped track object from the track storage
     * @param name the name of the track to get
     * @return a {@link Track} object, if one matching the name exists, or null if not
     */
    Track getTrack(String name);

    /**
     * Gets a wrapped tracj object from the track storage. This method does not return null, unlike {@link #getTrack}
     * @param name the name of the track to get
     * @return an optional {@link Track} object
     */
    Optional<Track> getTrackSafe(String name);

    /**
     * Check if a track is loaded in memory
     * @param name the name to check for
     * @return true if the track is loaded
     */
    boolean isTrackLoaded(String name);

}
