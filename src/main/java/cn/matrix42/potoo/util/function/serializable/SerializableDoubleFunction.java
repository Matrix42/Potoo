package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleFunction;

/**
 * Serializable DoubleFunction.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableDoubleFunction<R> extends DoubleFunction<R>, Serializable {

}
