package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.UnaryOperator;

/**
 * Serializable UnaryOperator.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableUnaryOperator<T> extends UnaryOperator<T>, Serializable {

}
