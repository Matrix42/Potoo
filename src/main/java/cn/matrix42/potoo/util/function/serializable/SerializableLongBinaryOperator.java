package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongBinaryOperator;

/**
 * Serializable LongBinaryOperator.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongBinaryOperator extends LongBinaryOperator, Serializable {

}
