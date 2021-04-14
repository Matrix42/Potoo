package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongUnaryOperator;

/**
 * Serializable LongUnaryOperator.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongUnaryOperator extends LongUnaryOperator, Serializable {

}
