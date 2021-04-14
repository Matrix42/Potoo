package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ObjDoubleConsumer;

/**
 * Serializable ObjDoubleConsumer.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableObjDoubleConsumer<T> extends ObjDoubleConsumer<T>, Serializable {

}
