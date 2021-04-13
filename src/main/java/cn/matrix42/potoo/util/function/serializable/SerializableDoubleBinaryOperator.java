package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleBinaryOperator;

@FunctionalInterface
public interface SerializableDoubleBinaryOperator extends DoubleBinaryOperator, Serializable {

}
