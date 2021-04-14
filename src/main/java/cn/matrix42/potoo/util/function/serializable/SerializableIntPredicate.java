package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntPredicate;

/**
 * Serializable IntPredicate.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableIntPredicate extends IntPredicate, Serializable {

}
