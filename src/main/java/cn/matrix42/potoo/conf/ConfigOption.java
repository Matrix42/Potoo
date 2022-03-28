package cn.matrix42.potoo.conf;


import static cn.matrix42.potoo.lang.Preconditions.checkNotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import cn.matrix42.potoo.annotation.Public;

/**
 * A {@code ConfigOption} describes a configuration parameter. It encapsulates the configuration
 * key, deprecated older versions of the key, and an optional default value for the configuration
 * parameter.
 *
 * <p>{@code ConfigOptions} are built via the {@link ConfigOptions} class. Once created, a config
 * option is immutable.
 *
 * @param <T> The type of value associated with the configuration option.
 */
@Public
public class ConfigOption<T> {

    private static final DeprecatedKey[] EMPTY = new DeprecatedKey[0];

    static final String EMPTY_DESCRIPTION = "";

    // ------------------------------------------------------------------------

    /** The current key for that config option. */
    private final String key;

    /** The list of deprecated keys, in the order to be checked. */
    private final DeprecatedKey[] deprecatedKeys;

    /** The default value for this option. */
    private final T defaultValue;

    /** The description for this option. */
    private final String description;

    /**
     * Type of the value that this ConfigOption describes.
     *
     * <ul>
     *   <li>typeClass == atomic class (e.g. {@code Integer.class}) -> {@code ConfigOption<Integer>}
     *   <li>typeClass == {@code Map.class} -> {@code ConfigOption<Map<String, String>>}
     *   <li>typeClass == atomic class and isList == true for {@code ConfigOption<List<Integer>>}
     * </ul>
     */
    private final Class<?> clazz;

    private final boolean isList;

    // ------------------------------------------------------------------------

    Class<?> getClazz() {
        return clazz;
    }

    boolean isList() {
        return isList;
    }

    /**
     * Creates a new config option with deprecated keys.
     *
     * @param key The current key for that config option
     * @param clazz describes type of the ConfigOption, see description of the clazz field
     * @param description Description for that option
     * @param defaultValue The default value for this option
     * @param isList tells if the ConfigOption describes a list option, see description of the clazz
     *     field
     * @param deprecatedKeys The list of deprecated keys, in the order to be checked
     */
    ConfigOption(
        String key,
        Class<?> clazz,
        String description,
        T defaultValue,
        boolean isList,
        DeprecatedKey... deprecatedKeys) {
        this.key = checkNotNull(key);
        this.description = description;
        this.defaultValue = defaultValue;
        this.deprecatedKeys = deprecatedKeys == null || deprecatedKeys.length == 0 ? EMPTY : deprecatedKeys;
        this.clazz = checkNotNull(clazz);
        this.isList = isList;
    }

    // ------------------------------------------------------------------------

    /**
     * Creates a new config option, using this option's key and default value, and adding the given
     * description. The given description is used when generation the configuration documention.
     *
     * @param description The description for this option.
     * @return A new config option, with given description.
     */
    public ConfigOption<T> withDescription(final String description) {
        return new ConfigOption<>(key, clazz, description, defaultValue, isList, deprecatedKeys);
    }

    // ------------------------------------------------------------------------

    /**
     * Gets the configuration key.
     *
     * @return The configuration key
     */
    public String key() {
        return key;
    }

    /**
     * Checks if this option has a default value.
     *
     * @return True if it has a default value, false if not.
     */
    public boolean hasDefaultValue() {
        return defaultValue != null;
    }

    /**
     * Returns the default value, or null, if there is no default value.
     *
     * @return The default value, or null.
     */
    public T defaultValue() {
        return defaultValue;
    }

    /**
     * Checks whether this option has deprecated keys.
     *
     * @return True if the option has deprecated keys, false if not.
     */
    public boolean hasDeprecatedKeys() {
        return deprecatedKeys != EMPTY
            && Arrays.stream(deprecatedKeys).anyMatch(DeprecatedKey::isDeprecated);
    }

    /**
     * Gets the deprecated keys, in the order to be checked.
     *
     * @return The option's deprecated keys.
     */
    public Iterable<String> deprecatedKeys() {
        return deprecatedKeys == EMPTY
            ? Collections.emptyList()
            : Arrays.stream(deprecatedKeys)
                .filter(DeprecatedKey::isDeprecated)
                .map(DeprecatedKey::getKey)
                .collect(Collectors.toList());
    }

    /**
     * Returns the description of this option.
     *
     * @return The option's description.
     */
    public String description() {
        return description;
    }

    // ------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && o.getClass() == ConfigOption.class) {
            ConfigOption<?> that = (ConfigOption<?>) o;
            return this.key.equals(that.key)
                && Arrays.equals(this.deprecatedKeys, that.deprecatedKeys)
                && (this.defaultValue == null
                ? that.defaultValue == null
                : (that.defaultValue != null
                    && this.defaultValue.equals(that.defaultValue)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31 * key.hashCode()
            + 17 * Arrays.hashCode(deprecatedKeys)
            + (defaultValue != null ? defaultValue.hashCode() : 0);
    }

    @Override
    public String toString() {
        return String.format(
            "Key: '%s' , default: %s (deprecated keys: %s)",
            key, defaultValue, Arrays.toString(deprecatedKeys));
    }
}
