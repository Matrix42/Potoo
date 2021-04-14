package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongToDoubleFunction;

/**
 * Serializable LongToDoubleFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongToDoubleFunction extends LongToDoubleFunction, Serializable {

}
