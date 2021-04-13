package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.Consumer;

@FunctionalInterface
public interface SerializableConsumer<T> extends Consumer<T>, Serializable {

}
