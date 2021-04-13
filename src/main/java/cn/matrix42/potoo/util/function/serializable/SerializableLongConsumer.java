package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongConsumer;

@FunctionalInterface
public interface SerializableLongConsumer extends LongConsumer, Serializable {

}
