package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongFunction;

/**
 * Serializable LongFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongFunction<R> extends LongFunction<R>, Serializable {

}
