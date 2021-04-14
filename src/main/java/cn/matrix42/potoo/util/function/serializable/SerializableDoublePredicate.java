package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.DoublePredicate;

/**
 * Serializable DoublePredicate.
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableDoublePredicate extends DoublePredicate, Serializable {

}
