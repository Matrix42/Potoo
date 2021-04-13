package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface SerializableUnaryOperator<T> extends UnaryOperator<T>, Serializable {

}
