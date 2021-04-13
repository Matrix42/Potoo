package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntConsumer;

@FunctionalInterface
public interface SerializableIntConsumer extends IntConsumer, Serializable {

}
