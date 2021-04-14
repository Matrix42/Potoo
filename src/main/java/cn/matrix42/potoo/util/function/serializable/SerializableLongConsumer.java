package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongConsumer;

/**
 * Serializable LongConsumer.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongConsumer extends LongConsumer, Serializable {

}
