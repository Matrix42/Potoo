package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongPredicate;

/**
 * Serializable LongPredicate.
 *
 * @author Matrix42
 * @since 1.0.0
 */
@FunctionalInterface
public interface SerializableLongPredicate extends LongPredicate, Serializable {

}
