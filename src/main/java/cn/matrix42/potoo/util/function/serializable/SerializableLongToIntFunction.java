package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongToIntFunction;

@FunctionalInterface
public interface SerializableLongToIntFunction extends LongToIntFunction, Serializable {

}
