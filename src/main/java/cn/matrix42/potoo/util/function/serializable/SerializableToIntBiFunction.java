package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntBiFunction;

@FunctionalInterface
public interface SerializableToIntBiFunction<T, U>  extends ToIntBiFunction<T, U> , Serializable {

}
