package pl.wsb.fitnesstracker.training.internal;

/**
 * Enumeration representing different types of physical activities.
 */
public enum ActivityType {

    /**
     * Represents running activity.
     */
    RUNNING("Running"),

    /**
     * Represents cycling activity.
     */
    CYCLING("Cycling"),

    /**
     * Represents walking activity.
     */
    WALKING("Walking"),

    /**
     * Represents swimming activity.
     */
    SWIMMING("Swimming"),

    /**
     * Represents tennis activity.
     */
    TENNIS("Tenis");

    private final String displayName;

    /**
     * Constructs a new ActivityType with the specified display name.
     *
     * @param displayName the display name of the activity.
     */
    ActivityType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the display name of the activity.
     *
     * @return the display name.
     */
    public String getDisplayName() {
        return displayName;
    }

}
