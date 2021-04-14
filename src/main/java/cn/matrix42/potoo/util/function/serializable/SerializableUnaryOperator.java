package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.UnaryOperator;

/**
 * Serializable UnaryOperator.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableUnaryOperator<T> extends UnaryOperator<T>, Serializable {

}
