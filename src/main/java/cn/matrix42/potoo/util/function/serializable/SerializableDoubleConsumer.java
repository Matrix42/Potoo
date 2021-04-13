package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleConsumer;

@FunctionalInterface
public interface SerializableDoubleConsumer extends DoubleConsumer, Serializable {

}
