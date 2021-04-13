package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongToDoubleFunction;

@FunctionalInterface
public interface SerializableLongToDoubleFunction extends LongToDoubleFunction, Serializable {

}
