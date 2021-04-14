package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleSupplier;

/**
 * Serializable DoubleSupplier.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableDoubleSupplier extends DoubleSupplier, Serializable {

}
