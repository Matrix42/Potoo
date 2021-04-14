package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BiFunction;

/**
 * Serializable BiFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableBiFunction<T, U, R> extends BiFunction<T, U, R>, Serializable {

}
