package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntToDoubleFunction;

/**
 * Serializable IntToDoubleFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableIntToDoubleFunction extends IntToDoubleFunction, Serializable {

}
