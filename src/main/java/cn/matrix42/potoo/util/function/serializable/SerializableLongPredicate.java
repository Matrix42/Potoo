package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.LongPredicate;

@FunctionalInterface
public interface SerializableLongPredicate extends LongPredicate, Serializable {

}
