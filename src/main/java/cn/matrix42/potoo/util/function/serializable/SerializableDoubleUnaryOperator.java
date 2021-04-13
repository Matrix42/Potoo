package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleUnaryOperator;

@FunctionalInterface
public interface SerializableDoubleUnaryOperator extends DoubleUnaryOperator, Serializable {

}
