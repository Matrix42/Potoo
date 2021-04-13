package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ObjDoubleConsumer;

@FunctionalInterface
public interface SerializableObjDoubleConsumer<T> extends ObjDoubleConsumer<T>, Serializable {

}
