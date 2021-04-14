package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BiConsumer;

/**
 * Serializable BiConsumer.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableBiConsumer<T, U> extends BiConsumer<T, U>, Serializable {

}
