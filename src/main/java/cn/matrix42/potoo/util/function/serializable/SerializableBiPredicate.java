package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BiPredicate;

/**
 * Serializable BiPredicate.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableBiPredicate<T, U> extends BiPredicate<T, U>, Serializable {

}
