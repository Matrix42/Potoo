package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BinaryOperator;

@FunctionalInterface
public interface SerializableBinaryOperator<T> extends BinaryOperator<T>, Serializable {

}
