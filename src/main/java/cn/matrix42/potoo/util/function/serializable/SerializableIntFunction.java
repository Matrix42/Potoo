package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntFunction;

@FunctionalInterface
public interface SerializableIntFunction<R> extends IntFunction<R>, Serializable {

}
