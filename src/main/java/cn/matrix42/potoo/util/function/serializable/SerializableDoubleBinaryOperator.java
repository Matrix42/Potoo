package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleBinaryOperator;

/**
 * Serializable DoubleBinaryOperator.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableDoubleBinaryOperator extends DoubleBinaryOperator, Serializable {

}
