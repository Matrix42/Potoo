package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToLongFunction;

@FunctionalInterface
public interface SerializableToLongFunction<T> extends ToLongFunction<T>, Serializable {

}
