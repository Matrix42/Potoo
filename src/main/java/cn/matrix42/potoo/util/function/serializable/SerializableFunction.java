package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.Function;

/**
 * Serializable Function.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableFunction<T, R> extends Function<T, R>, Serializable {

}
