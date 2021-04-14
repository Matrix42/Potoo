package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntBiFunction;

/**
 * Serializable ToIntBiFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableToIntBiFunction<T, U>  extends ToIntBiFunction<T, U> , Serializable {

}
