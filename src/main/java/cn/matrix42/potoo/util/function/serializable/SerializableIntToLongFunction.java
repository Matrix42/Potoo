package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntToLongFunction;

/**
 * Serializable IntToLongFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableIntToLongFunction extends IntToLongFunction, Serializable {

}
