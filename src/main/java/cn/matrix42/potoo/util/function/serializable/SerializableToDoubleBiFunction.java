package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.ToDoubleBiFunction;

/**
 * Serializable ToDoubleBiFunction.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableToDoubleBiFunction<T, U>  extends ToDoubleBiFunction<T, U> , Serializable {

}
