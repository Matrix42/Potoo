package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BiPredicate;

@FunctionalInterface
public interface SerializableBiPredicate<T, U> extends BiPredicate<T, U>, Serializable {

}
