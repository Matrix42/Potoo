package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleToIntFunction;

@FunctionalInterface
public interface SerializableDoubleToIntFunction extends DoubleToIntFunction, Serializable {

}
