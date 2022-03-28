package cn.matrix42.potoo.conf;


/** A key with DeprecatedKeys will fall back to the DeprecatedKeys if it itself is not configured. */
public class DeprecatedKey {

    // -------------------------
    //  Factory methods
    // -------------------------

    static DeprecatedKey createDeprecatedKey(String key) {
        return new DeprecatedKey(key, true);
    }

    // ------------------------------------------------------------------------

    private final String key;

    private final boolean isDeprecated;

    public String getKey() {
        return key;
    }

    public boolean isDeprecated() {
        return isDeprecated;
    }

    private DeprecatedKey(String key, boolean isDeprecated) {
        this.key = key;
        this.isDeprecated = isDeprecated;
    }

    // ------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && o.getClass() == DeprecatedKey.class) {
            DeprecatedKey that = (DeprecatedKey) o;
            return this.key.equals(that.key) && (this.isDeprecated == that.isDeprecated);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31 * key.hashCode() + (isDeprecated ? 1 : 0);
    }

    @Override
    public String toString() {
        return String.format("{key=%s, isDeprecated=%s}", key, isDeprecated);
    }
}