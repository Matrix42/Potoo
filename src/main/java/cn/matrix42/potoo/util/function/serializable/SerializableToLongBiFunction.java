package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToLongBiFunction;

/**
 * Serializable ToLongBiFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableToLongBiFunction<T, U> extends ToLongBiFunction<T, U>, Serializable {

}
