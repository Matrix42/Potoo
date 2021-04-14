package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BinaryOperator;

/**
 * Serializable BinaryOperator.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableBinaryOperator<T> extends BinaryOperator<T>, Serializable {

}
