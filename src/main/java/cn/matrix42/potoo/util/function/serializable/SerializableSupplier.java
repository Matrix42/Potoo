package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * Serializable Supplier.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableSupplier<T> extends Supplier<T>, Serializable {

}
