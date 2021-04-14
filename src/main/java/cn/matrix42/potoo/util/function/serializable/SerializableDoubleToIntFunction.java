package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleToIntFunction;

/**
 * Serializable DoubleToIntFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableDoubleToIntFunction extends DoubleToIntFunction, Serializable {

}
