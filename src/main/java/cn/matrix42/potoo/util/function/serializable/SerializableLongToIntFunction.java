package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongToIntFunction;

/**
 * Serializable LongToIntFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongToIntFunction extends LongToIntFunction, Serializable {

}
