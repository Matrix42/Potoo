package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ObjLongConsumer;

@FunctionalInterface
public interface SerializableObjLongConsumer<T> extends ObjLongConsumer<T>, Serializable {

}
