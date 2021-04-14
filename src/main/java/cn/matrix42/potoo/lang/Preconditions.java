package cn.matrix42.potoo.lang;

import cn.matrix42.potoo.annotation.NotNull;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class Preconditions {

    private Preconditions() {

    }

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     * @param reference object reference
     * @param <T> object type
     * @return none null object
     * @since 1.0.0
     */
    public static <T extends @NotNull Object> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

}
