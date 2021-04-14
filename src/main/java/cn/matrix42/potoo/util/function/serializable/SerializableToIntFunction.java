package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntFunction;

/**
 * Serializable ToIntFunction.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableToIntFunction<T> extends ToIntFunction<T>, Serializable {

}
