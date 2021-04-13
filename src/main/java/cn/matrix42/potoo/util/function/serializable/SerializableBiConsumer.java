package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BiConsumer;

@FunctionalInterface
public interface SerializableBiConsumer<T, U> extends BiConsumer<T, U>, Serializable {

}
