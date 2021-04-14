package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * Serializable Predicate.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializablePredicate<T> extends Predicate<T>, Serializable {

}
