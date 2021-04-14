package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntUnaryOperator;

/**
 * Serializable IntUnaryOperator.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableIntUnaryOperator extends IntUnaryOperator, Serializable {

}
