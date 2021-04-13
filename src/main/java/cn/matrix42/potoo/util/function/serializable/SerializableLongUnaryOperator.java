package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongUnaryOperator;

@FunctionalInterface
public interface SerializableLongUnaryOperator extends LongUnaryOperator, Serializable {

}
