package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntConsumer;

/**
 * Serializable IntConsumer.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableIntConsumer extends IntConsumer, Serializable {

}
