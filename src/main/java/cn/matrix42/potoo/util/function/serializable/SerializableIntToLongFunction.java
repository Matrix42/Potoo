package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntToLongFunction;

@FunctionalInterface
public interface SerializableIntToLongFunction extends IntToLongFunction, Serializable {

}
