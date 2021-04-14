package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Serializable Consumer.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableConsumer<T> extends Consumer<T>, Serializable {

}
