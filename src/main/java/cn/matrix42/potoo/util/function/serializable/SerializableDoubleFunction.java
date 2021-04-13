package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleFunction;

@FunctionalInterface
public interface SerializableDoubleFunction<R> extends DoubleFunction<R>, Serializable {

}
