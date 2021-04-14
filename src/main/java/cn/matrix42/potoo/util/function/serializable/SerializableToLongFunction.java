package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToLongFunction;

/**
 * Serializable ToLongFunction.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableToLongFunction<T> extends ToLongFunction<T>, Serializable {

}
