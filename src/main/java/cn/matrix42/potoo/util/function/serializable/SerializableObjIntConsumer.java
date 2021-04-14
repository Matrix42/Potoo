package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ObjIntConsumer;

/**
 * Serializable ObjIntConsumer.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableObjIntConsumer<T> extends ObjIntConsumer<T>, Serializable {

}
