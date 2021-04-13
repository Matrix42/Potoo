package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntFunction;

@FunctionalInterface
public interface SerializableToIntFunction<T> extends ToIntFunction<T>, Serializable {

}
